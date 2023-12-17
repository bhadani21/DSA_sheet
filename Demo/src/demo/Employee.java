package demo;

public class Employee{

private static Employee emp= null;



private Employee(){
}

public static Employee getInstance(){

if(emp==null) emp=new Employee();
return emp;
}

public static void main(String[] args) {
	Employee emp = new Employee();
	System.out.println(emp.getInstance());
	Employee emp1 = new Employee();
	System.out.println(emp1.getInstance());
}

}
