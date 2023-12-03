
import java.util.*;
class NAexception
{
public static void main(String[] args)
{
Scanner scr=new Scanner(System.in);
int num1,num2,q;
try
{
System.out.println("\nEnter the value of first integer: ");
num1 = Integer .parseInt(scr.next());
System.out.println("\nEnter the value of second integer: ");
num2=Integer.parseInt(scr.next());
q = num1/num2;
System.out.println("\nQuotient is: "+q);
}
catch(NumberFormatException e)
{
System.out.println(e);
}
catch(ArithmeticException e)
{
System.out.println(e);
}
}
}

// Output:
C:\Users\prasad\OneDrive\Desktop\JAVA>javac NAexception.java

C:\Users\prasad\OneDrive\Desktop\JAVA>java NAexception

Enter the value of first integer:
8

Enter the value of second integer:
4

Quotient is: 2

C:\Users\prasad\OneDrive\Desktop\JAVA>java NAexception

Enter the value of first integer:
5

Enter the value of second integer:
0
java.lang.ArithmeticException: / by zero
