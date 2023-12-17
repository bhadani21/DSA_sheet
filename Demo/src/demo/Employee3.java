package demo;

public class Employee3 {
	
	
	private static final String Employee3 = null;

	Employee3(){
	}

	public Employee3 getInstance(Employee3 emp){

	if(emp==null) new Employee3();
	return emp;
	}

	public static void main(String[] args) {
		Employee3 emp = new Employee3();
		System.out.println(emp.getInstance(emp));
		Employee3 emp1=new Employee3();
		System.out.println(emp1.getInstance(emp1));

	}

}
