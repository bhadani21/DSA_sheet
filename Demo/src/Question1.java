import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Question1 {
	
	public static void main(String args[]) {
		
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		
		Employee emp=new Employee("Ruchi","Bhadani",1238);
		Employee emp2=new Employee("Ram1","Bhadani1",1236);
		Employee emp3=new Employee("Ramm2","Bhadani2",1234);
		
		
		map.put(emp.getFirstName()+emp.getLastName(), emp.getPhoneNo());
		map.put(emp2.getFirstName()+emp2.getLastName(), emp2.getPhoneNo());
		map.put(emp3.getFirstName()+emp3.getLastName(), emp3.getPhoneNo());
		
		for(Entry<String, Integer> one:map.entrySet()) {
			System.out.println(one.getKey()+"-"+one.getValue());
		}
	}

}
