
import java.util.scanner;
class Publication
{
 String title;
 int price,copies;
 public static int total=0;
 public int saleCopy()
 {
  System.out.println("Total Sale of Publication is :"+(copies*price));
  return (copies*price);
 }
 public int getcopies()
 {
  return this.copies;
 }
 public int setcopies(int cp)
 {
  return this.copies=cp;
 }
 public int setprice(int p)
 {
  return this.price=p; 
 }                                 
}
class Book extends Publication
{
 String author;
 int pcopies,price1;
 public int saleCopy()
 {
  System.out.println("Total Sale of Book is :"+(copies*price));
  total=total+(copies*price);
  return(copies*price);
 }
 public void orderCopies()
 {
  Scanner in=new Scanner(System.in);
  System.out.println("Enter the title of the book to be ordered :");
  title=in.nextLine();
  System.out.println("Enter the author of the book to be ordered :");
  author=in.nextLine();
  System.out.println("Enter the no. of copies of the Book to be ordered :");
  pcopies=in.nextInt();
  System.out.println("Enter the price of the Book to be ordered :");
  price1=in.nextInt();
  setcopies(getcopies()+pcopies);
  setprice(price1);
 }
}
/*class Magazine extends Publication
{
 private int orderQty;
 private String currIssue;
 public String getcurrIssue()
 {
  return this.currIssue;
 }
 public void setcurrIssue(String issue)
 {
  this.currIssue=issue;
 }
 public int getorderQty()
 {
  return this.orderQty;
 }
 public void setorderQty()
 {
  return this.orderQty=copies;
 }
 public int saleCopy()
 {
  System.out.println("Total Sale of Magazine is ;"+(copies*price));
  total=total+(copies*price);
  return (copies*price);
 }
 public void recvNewIssue(String pNewIssue)
 {
  setcopies(order Qty);
  currIssue=pNewIssue;
 }
}*/
public class Exp2
{
 public static void main(String args[])
 {
  Book b1=new Book();
  b1.orderCopies();
  System.out.println("Total Copies of the Book1 Ordered :"+b1.copies);
  System.out.println("Name of the Book1 Ordered :"+b1.title);
  b1.saleCopy();
  Book b2=new Book();
  b2.orderCopies();
  System.out.println("Total Copies of the Book2 Ordered :"+b2.copies);
  System.out.println("Name of the Book2 Ordered :"+b2.title);
  b2.saleCopy();
  System.out.println("\n Total Scale of Publication is :"+b1.total);
 }
}
//output:

C:\Users\prasad\OneDrive\Desktop\JAVA>javac Exp2.java

C:\Users\prasad\OneDrive\Desktop\JAVA>java Exp2
Enter the title of the book to be ordered :
What`s In The Name
Enter the author of the book to be ordered :
 William Shakespeare
Enter the no. of copies of the Book to be ordered :
20
Enter the price of the Book to be ordered :
500
Total Copies of the Book1 Ordered :20
Name of the Book1 Ordered :What`s In The Name
Total Sale of Book is :10000
Enter the title of the book to be ordered :
Pirates Of The Caribbean
Enter the author of the book to be ordered :
Mayank Patil
Enter the no. of copies of the Book to be ordered :
13
Enter the price of the Book to be ordered :
700
Total Copies of the Book1 Ordered :13
Name of the Book1 Ordered :Pirates Of The Caribbean
Total Sale of Book is :9100

