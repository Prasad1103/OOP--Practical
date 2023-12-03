public class ComplexNUmber{
int real, img;
ComplexNumber(int r, int i)
{
this.real = r;
this.img = i;
}
public void showc(){
System.out.println(this.real+"+"+this.img+"i");
}
public static ComplexNumber add(ComplexNumber n1,ComplexNumber n2)
{
ComplexNumber add=new ComplexNumber(0,0);
add.real=n1.real+n2.real;
add.img=n1.img+n2.img;
return add;
}
public static ComplexNumber sub(ComplexNumber n1,ComplexNumber n2)
{
ComplexNumber sub=new ComplexNumber(0,0);
sub.real=n1.real-n2.real;
sub.img=n1.img-n2.img;
return sub;
}
public static ComplexNumber mul(ComplexNumber n1,ComplexNumber n2)
{
ComplexNumber mul=new ComplexNumber(0,0);
mul.real=n1.real*n2.real;
mul.img=n1.img*n2.img;
return mul;
}
public static ComplexNumber div(ComplexNumber n1,ComplexNumber n2)
{
ComplexNumber div=new ComplexNumber(0,0);
div.real=n1.real/n2.real;
div.img=n1.img/n2.img;
return div;
}
public static void main(String args[]) {
ComplexNumber c1 = new ComplexNumber(9, 8);
ComplexNumber c2 = new ComplexNumber(1, 6);
System. out.print("first complex number-");
c1.showc();
System.out.print("second complex nuumber-");
c2.showc();
ComplexNumber add = add(c1,c2);
System.out.print("addition of complex number is-");
add.showc();
ComplexNumber sub = sub(c1,c2);
System.out.print("subtraction of complex number is-");
sub.showc();
ComplexNumber mul = mul(c1,c2);
System.out.print("multiplication of complex no is-");
mul.showc();
ComplexNumber div = div(c1,c2);
System.out.print("division of complex no is-");
div.showc();
}
}

//Output:
C:\Users\prasad\OneDrive\Desktop\JAVA>javac ComplexNumber.java

C:\Users\prasad\OneDrive\Desktop\JAVA>java ComplexNumber
first complex number-9+8i
second complex nuumber-1+6i
addition of complex number is-10+14i
subtraction of complex number is-8+2i
multiplication of complex no is-9+48i
division of complex no is-9+1i
