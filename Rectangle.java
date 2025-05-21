public class Rectangle{
	int length;
	int breadth;
	public Rectangle(){
		System.out.println("length:"+length);
		System.out.println("breadth:"+breadth);
	}
	public Rectangle(int len,int br){
		length=len;
		breadth=br;
	}
	public int area(int length,int breadth){
		return length*breadth;
	}
	public static void main(String[] args){
		Rectangle rect=new Rectangle();
		System.out.println(rect.area(12,2));
	}
}
			
