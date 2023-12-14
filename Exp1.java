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

Algorithm:
1. Begin
2. Define a class operation with instance variables real and imag
3. Input the two complex numbers c1=(a+ib) and c2=(c+id)
4. Define the method add (c1, c2) as (a+ib) + (c+id) and stores result in c3
5. Define the method sub (c1, c2) as (a+ib) - (c+id) and stores result in c3
6. Define the method mul (c1, c2) as (a+ib) * (c+id) and store the result in c3 as 
(ac-bd) + i(bc+ad)
7. Define the method div (c1, c2) as (a+ib)/(c+id) and stores the quotient c3 as
{(ac+bd)/(c2+d2)} +i{(bc-ad)/(c2+d2)}
8. Define the method display () which outputs each result
9. End

