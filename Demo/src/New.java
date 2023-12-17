import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str[]= {"ruchi", "bhadani", "new"};
//		String str1 = "";
//		for(int i=0;i<str.length;i++) {
//			if(i==str.length-1)
//			str1+=str[i]+"";
//			else str1+=str[i]+",";
//		}
//		System.out.println(str1);
		
		List arry=Arrays.asList(str);
//		System.out.println(arry.stream().collect(Collectors.joining(",")));
		
		System.out.println(String.join("??", arry));
		

	}
	
	
//	class Base {
//	    public static void show() {
//	       System.out.println("Base::show() called");
//	    }
//	}
//
//	class Derived extends Base {
//	    public static void show() {
//	       System.out.println("Derived::show() called");
//	    }
//	}
//
//	class Main {
//	    public static void main(String[] args) {
//	        Base b = new Derived();;
//	        b.show();
//	    }
//	}
//
//
//	public void function1(Vehicle v){
//
//	 
//
//	Thread t = new Thread(() -> {v.drive();});
//	t.start();
//
//	 
//
//	}
//
//
//
//	class Employee{
//
//	private Employee emp =null
//
//
//	public Employee getInstance(Employee emp){
//
//	if(emp==null){
//		emp=new Employee();
//	}
//
//	return emp;
//	}
//	}
//
//
//	Employee emp=new Employee();
//	Employee emp1=new Employee();



























}
