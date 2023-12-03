
class Employee
{
  String name,add,mail;
  float id,mobile,basic,gross;
  void salary()
  {
   float da,hra,pf,cf;
   da=basic*97/100;
   hra=basic*10/100;
   pf=basic*12/100;
   cf=basic*0.1f/100;
   gross=basic+da+hra-pf-cf;
   System.out.println("Name of Employee "+name);
   System.out.println("Basic of Salary "+basic);
   System.out.println("Gross Salary "+gross);
   System.out.println("mail of Employee "+mail);
   System.out.println("\n");
  }
}
class Programmer extends Employee
{
 Programmer(String name,int sal,String mail)
 {
 System.out.println("Programmer Salary Details:");
 this.name=name;
 this.mail=mail;
 basic=sal;
 System.out.println("\n");
 }
}
class TeamLead extends Employee
{
 TeamLead(String name,int sal,String mail)
 {
 System.out.println("Team Leader Salary Details:");
 this.name=name;
 this.mail=mail;
 basic=sal;
 System.out.println("\n");
 }
}
class APM extends Employee
{
 APM(String name,int sal,String mail)
 {
 System.out.println("Assistant Project Manager Salary Details:");
 this.name=name;
 this.mail=mail;
 basic=sal;
 System.out.println("\n");
 }
}
class ProjectManager extends Employee
{
 ProjectManager(String name,int sal,String mail)
 {
 System.out.println("Project Manager Salary Details:");
 this.name=name;
 this.mail=mail;
 basic=sal;
 System.out.println("\n");
 }
}
public class Inheritance12
{
 public static void main(String[] args)
 {
 Programmer p=new Programmer("Sujal Patil",50000,"xyz@gmail.com");
 p.salary();
 TeamLead t=new TeamLead("pankaj Patil",60000,"abc@gmail.com");
 t.salary();
 APM a=new APM("Chaitanya Kale",70000,"chaitanya@gmail.com");
 a.salary();
 ProjectManager PM=new ProjectManager("Aniket Sable",80000,"aniket@gmail.com");
 PM.salary();
 }
}

//Output:

C:\Users\prasad\OneDrive\Desktop\JAVA>javac Inheritance12.java

C:\Users\prasad\OneDrive\Desktop\JAVA>java Inheritance12
Programmer Salary Details:


Name of Employee Sujal Patil
Basic of Salary 50000.0
Gross Salary 97450.0
mail of Employee xyz@gmail.com


Team Leader Salary Details:


Name of Employee pankaj Patil
Basic of Salary 60000.0
Gross Salary 116940.0
mail of Employee abc@gmail.com


Assistant Project Manager Salary Details:


Name of Employee Chaitanya Kale
Basic of Salary 70000.0
Gross Salary 136430.0
mail of Employee chaitanya@gmail.com


Project Manager Salary Details:


Name of Employee Aniket Sable
Basic of Salary 80000.0
Gross Salary 155920.0
mail of Employee aniket@gmail.com
