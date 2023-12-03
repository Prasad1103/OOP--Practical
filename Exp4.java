
import java.lang.Math.*;
abstract class shape{
	double area;
	abstract public void compute_area();
}
class rectangle extends shape
{
	double width,height;
	rectangle(double width,double height)//parameterized constuctor
	{
		super();
		this.width=width;
		this.height=height;
	}
	public void compute_area()//method overriden
	{
		area=width*height;
		System.out.println("Area of Rectangle:"+area);
	}
}
class traingle extends shape
{
	double side1,side2,side3;
	double result;
	traingle(double side1,double side2,double side3)	
	{
		super();
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}

	public void compute_area()
	{
		result=0.5*(side1+side2+side3);
		area=Math.sqrt(result*(result-side1)*(result-side2)*(result-side3));
		System.out.println("Area of traingle:"+ area);
	}
}
public class shapeclass
{
		public static void main(String args[])
		{
			traingle t1=new traingle(3.4,7.8);
			rectangle r1=new rectangle(56.2,23.4);
			t1.compute_area();
			r1.compute_area();	

		}
}

//Output:

C:\Users\prasad\OneDrive\Desktop\JAVA>javac shapeclass.java

C:\Users\prasad\OneDrive\Desktop\JAVA>java shapeclass
Area of traingle:11.86
Area of Rectangle:134.4
