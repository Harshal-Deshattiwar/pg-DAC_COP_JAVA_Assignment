

public class Que1_Emp {
	 private int EmpId ;
	 private String Name;
	 private String Dept;
	 private int Salary;
	 private String Address;
	 
	 Que1_Emp(int id, String name, String dept, int salary, String address){
		 this.EmpId = id;
		 this.Name = name;
		 this.Dept = dept;
		 this.Salary = salary;
		 this.Address = address;
		 
	 }
	 
	 void displayEmpDetails() {
		 System.out.println("EmpId = " + EmpId );
		 System.out.println("Name = " + Name );
		 System.out.println("Dept = " + Dept );
		 System.out.println("Salary = " + Salary );
		 System.out.println("Address = " + Address );
	 }
	

}
