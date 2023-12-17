package LinkedList_Problems;

import java.util.*;

public class FirstNonRepeating {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Stream");
	String str=sc.nextLine();
	FirstNonRepeating fn=new FirstNonRepeating();
	String ans = fn.findNonRepeatingStream(str);
	System.out.println("Non Repeating Stream="+ans);
	
}

private  String findNonRepeatingStream(String str) {
	Queue<Character> q=new LinkedList<Character>();
	int charCount[]=new int[26];
	String ans="";
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		q.add(ch);
		charCount[ch-'a']++;
		while(!q.isEmpty()) {
			if(charCount[q.peek()-'a']>1) {
				q.remove();
			}
			else {
				ans+=q.peek();
				break;
			}
		}
		if(q.isEmpty()) {
			ans+="#";
		}
	}
	return ans;
}

}
