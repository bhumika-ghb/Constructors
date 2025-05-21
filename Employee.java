public class Employee{
	String Name;
	double Salary;
	public Employee(String name,double Salary){
		this.Name=name;
		this.Salary=Salary;
		if(Salary<0){
			System.out.println(0);
		}
	}
	public void displayDetails(){
		System.out.println(Name+" " + Salary+" ");
	}
	public static void main(String[] args){
		Employee emp=new Employee("Bhumika",40000);
		emp.displayDetails();
	}
}
		