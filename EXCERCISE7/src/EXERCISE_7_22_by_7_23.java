class Point{
	int x;
	int y;
	Point(){
		this(0,0);
	}
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "["+x+","+y+"]";
	}
}
abstract class Shape{
	Point p;
	Shape(){
		this(new Point(0,0));
	}
	Shape(Point p){
		this.p = p;
	}
	abstract double calcArea();
	Point getPosition() {
		return p;
	}
	void setPosition(Point p) {
		this.p = p;
	}
}
class Circle extends Shape{
	double r;
	Circle(double r){
		super();
		this.r = r;
	}
	public double calcArea() {
		return this.r*this.r;
	}
}
class Rectangle extends Shape{
	int width;
	int height;
	
	Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public boolean IsSquare() {
		if(this.width == this.height)
			return true;
		else
			return false;
	}
	public double calcArea() {
		return (this.width-this.p.x)*(this.height-this.p.y);
	}
}
public class EXERCISE_7_22_by_7_23 {
	static double sumArea(Shape[] arr)
	{
		double sum=0;
		for(int i=0;i<arr.length;i++) //원래는 추상메서드를 오버라이딩 했으므르로 형검사를 하지 않고 
		{                             //바로 메서드를 호출해도 참조한 객체의 메서드가 호출됨	
			if(arr[i] instanceof Circle)
				sum += ((Circle)arr[i]).calcArea();
			else if(arr[i] instanceof Rectangle)
				sum += ((Rectangle)arr[i]).calcArea();
		}
		return sum;
	}
	public static void main(String[] args) {
		Shape[] arr = {new Circle(5.0), new Rectangle(3,4),new Circle(1)};
		System.out.println("면적의 합 : "+sumArea(arr));
	}
}
