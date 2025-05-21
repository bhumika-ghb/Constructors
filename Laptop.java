import java.util.Scanner;
public class Laptop{
	String brand;
	int ramSize;
	public Laptop(String brand,int size){
		this.brand=brand;
		this.ramSize=size;
	}
	public void showspecs(){
		System.out.println(brand+" "+ramSize+" ");
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter brand name:\n");
		String brand=sc.next();
		System.out.println("Enter ramSize:\n");
		int ramSize=sc.nextInt();
		Laptop lap=new Laptop(brand,ramSize);
		lap.showspecs();
		Laptop lap1=new Laptop("Dell",32);
		lap1.showspecs();
		sc.close();
	}
}
		