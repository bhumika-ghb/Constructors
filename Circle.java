public class Circle{
	double radius;
	public Circle(double radius){
		this.radius=radius;
	}
	public double getArea(){
		return(3.14*radius*radius);
	}
	public double getCircumInference(){
		return 2*3.14*radius;
	}
	public static void main(String[] args){
		Circle ci=new Circle(4);
		double b=ci.getArea();
		System.out.println(b);
		double d=ci.getCircumInference();
		System.out.println(d);
	}
}
		
