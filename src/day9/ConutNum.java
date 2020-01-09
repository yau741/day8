package day9;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConutNum {

	public static void main(String[] args) {
		String line = "* Because TreeNodes are about twice the size of regular nodes, we"+
		    "* use them only when bins contain enough nodes to warrant use"+
		     "* (see TREEIFY_THRESHOLD). And when they become too small (due to"+
		     "* removal or resizing) they are converted back to plain bins.  In"+
		     "* usages with well-distributed user hashCodes, tree bins are"+
		     "* rarely used.  Ideally, under random hashCodes, the frequency of"+
		     "* nodes in bins follows a Poisson distribution"+
		     "* (http://en.wikipedia.org/wiki/Poisson_distribution) with a"+
		     "* parameter of about 0.5 on average for the default resizing"+
		     "* threshold of 0.75, although with a large variance because of"+
		     "* resizing granularity. Ignoring variance, the expected"+
		     "* occurrences of list size k are (exp(-0.5) * pow(0.5, k) /"+
		     "* factorial(k)). The first values are";
		char[] charArray = line.toCharArray();
		Map<Object,Integer> map =new HashMap();
		for (char c : charArray) {//用hashMap 统计字符出现的次数
			if(!map.containsKey(c)){
				map.put(c, 1);
			}else{
				map.put(c, map.get(c)+1);
			}
		}
		System.out.println("------------1打印每个字母出现的次数----------------");
		Set<Object> keySet = map.keySet();
		for (Object object : keySet) {
			System.out.println(object+"有"+map.get(object)+"个");
		}
		System.out.println("------------2打印每个字母出现的次数----------------");
		Set<Entry<Object, Integer>> entrySet = map.entrySet();
		for (Entry<Object, Integer> entry : entrySet) {
			System.out.println(entry.getKey()+"有"+entry.getValue()+"个");
		}
		
		String[] split = line.trim().split("\\W+|\\d+|\\t+");
		Map<String,Integer> map2 =new HashMap();
		for (String string : split) {//统计每个单词出现的次数
			if(!map2.containsKey(string)){
				map2.put(string, 1);
			}else{
				map2.put(string, map2.get(string)+1);
			}
		}
		System.out.println("------------1打印出现次数超过3次的单词----------------");
		Set<Entry<String, Integer>> entrySet2 = map2.entrySet();
		for (Entry<String, Integer> entry : entrySet2) {
			if(entry.getValue()>3){
				System.out.println(entry.getKey()+"有"+entry.getValue()+"个");
			}
		}
		System.out.println("------------2打印出现次数超过3次的单词----------------");
		Set<String> keySet2 = map2.keySet();
		for (String string : keySet2) {
			if(map2.get(string)>3){
				System.out.println(string+"有"+map2.get(string)+"个");
			}
		}
	}
}
