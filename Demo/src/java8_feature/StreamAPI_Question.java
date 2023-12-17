package java8_feature;

import java.util.Arrays;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAPI_Question {

	public static void main(String[] args) {
		
		//1. find the count the occurance of each character in a string
		
		String str="iloveindiaa";
		Map<String, Long> map =Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		System.out.println(map);
	
	// 2. find the all duplicate element from a given string
		List<String> duplicateEle= Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream()
		.filter(d->d.getValue()>1)
		.map(d->d.getKey()).collect(Collectors.toList());
		System.out.println(duplicateEle);
		
		
	// 3. find the unique element from a given string
		List<String> uniqueEle= Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet()
				.stream()
				.filter(i->i.getValue()==1).map(i->i.getKey()).collect(Collectors.toList());
		System.out.println(uniqueEle);
		
	// 4. first non repeating element 
		String ele = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet()
				.stream()
				.filter(i->i.getValue()==1).map(w->w.getKey()).findFirst().get().toString();
		System.out.println(ele);
		
	// 5 find the second largest ele
		
	int arr[] = {2,43,12,15,14};
	int	list= Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	System.out.println(list);
	
	// 6 find longest  string from given array
	
	 String[] strArray= {"java","coding","new-string"};
	 String longestString= Arrays.stream(strArray).reduce((word,word2)->word.length()>word2.length()?word:word2).get();
	 System.out.println(longestString);
	
	// 7 find all element from array wh starts with 1
	 int arr_ele[]= {1,11,31,15,16,111};
	 List<String>  list1=Arrays.stream(arr_ele).boxed().map(e->e+"").filter(s->s.startsWith("1")).collect(Collectors.toList());
	 System.out.println(list1);

	 
	 // 8 String.join exampleString
	 String[] ba= {"new","data"};
	System.out.println(String.join("-",ba));
	 
	 
	}
}
