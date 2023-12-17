
public class Employee {

		private String firstName;
		private String lastName;
		private int phoneNo;
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public int getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(int phoneNo) {
			this.phoneNo = phoneNo;
		}
		@Override
		public String toString() {
			return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", phoneNo=" + phoneNo + "]";
		}
		public Employee(String firstName, String lastName, int phoneNo) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNo = phoneNo;
		}
		
		


}
