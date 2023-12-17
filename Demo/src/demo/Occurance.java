package demo;

import java.util.HashMap;
import java.util.Map.Entry;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="welcometombrdi";
//		s=s.replaceAll(" ", "");
//		System.out.println(s);
//		int arr[]=new int[26];
//		for (int i = 0; i < s.length(); i++) {
//			char ch=s.charAt(i);
//				arr[ch-'a']++;
//		}
//		
//		for (int i = 0; i <= 26; i++) {
//			if(arr[i]!=0) {
//				System.out.print(arr[i]);
//			}
//		}
		
		HashMap<Character,Integer> map=new HashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}
			else map.put(ch,1);
		}
		
		for (Entry<Character, Integer> one:map.entrySet()) {
			System.out.print(one.getKey()+":"+one.getValue());
			
		}

	}

}
