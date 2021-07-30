import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class Basics {


	static void removeDuplicate(String str) {
		Map<Character,Integer> map= new LinkedHashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			if(map.containsKey(c)==true) {
				Integer value = map.get(c);
				map.put(c, value+1)	;
			} else
			map.put(c, 1);
		}
		System.out.println(map);
		Set<Entry<Character,Integer>> entries=map.entrySet();
		for(Entry<Character,Integer> entry: entries) {
			System.out.print(entry.getKey());
		}
		Set<Character> chars=map.keySet();
		System.out.println(chars);
		
		
	}
	public static void main(String[] args) {
	removeDuplicate("aaaabbbcccddddddd");
		
	}
			
		
		// TODO Auto-generated method stub

	}

