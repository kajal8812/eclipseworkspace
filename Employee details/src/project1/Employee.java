
public class Employee {
	String name;
	String designation;
	int salary;
	int empId;
	
	Employee(String name,String designation,int salary,int empId){
		this.name=name;
		this.designation=designation;
		this.salary=salary;
		this.empId=empId;
	}
	

	void displayInfo() {
		System.out.println("Employee name is "+ name +"."+ " Employee Designation is "+ designation+"."+" Employee salary is "+salary+"."+" EmpID is "+empId+".");
		
	}
}

/*class Main{
	public static void main(String[] args) {
		Employee e1=new Employee("Rani","Business Analyst",2000,101);
		Employee e2=new Employee("Raghav","SDE",3000,102);
		Employee e3=new Employee("parineeti","sr. Developer",7000,103);
		Employee e4=new Employee("Reena","Business Analyst",2000,104);
		 
		 
		 e1.displayInfo();
		 e2.displayInfo();
		 e3.displayInfo();
		 e4.displayInfo();
		
	}
}*/