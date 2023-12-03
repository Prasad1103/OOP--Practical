//Name :-Prasad Chaudhari
//Roll no.:- 09
//Batch:- S1
//Program 5 - Design and develop a context for given case study and implement an interface for Vehicles 

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
interface Vehicle{
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
class Bicycle implements Vehicle{
    int speed;
    int gear;
    Bicycle(){
        speed=10;
        gear=1;
    }
    public void changeGear(int newGear){
        gear = newGear;
        System.out.println("Bicycle is now running on Gear - "+gear);
    }
    public void speedUp(int increment){
        System.out.println("Initial Speed of Bicycle was "+speed + "hm/hr.");
        speed=speed+increment;
        System.out.println("After Increasing Speed of Bicycle is "+speed + "hm/hr.");
    }
    public void applyBrakes(int decrement){
        System.out.println("Initial Speed of Bicycle was "+speed + "hm/hr.");
        speed=speed-decrement;
        System.out.println("After Applying brakes Speed of Bicycle is "+speed + "hm/hr.");
    }
    public void display(){
        System.out.println("Speed - "+speed+" km/hr. \nGear -"+gear);
    }
    
}
class Bike implements Vehicle{
    int speed;
    int gear;
    Bike(){
        speed=20;
        gear=1;
    }
    public void changeGear(int newGear){
        gear = newGear;
        System.out.println("Bike is now running on Gear - "+gear);
    }
    public void speedUp(int increment){
        System.out.println("Initial Speed of Bike was "+speed + "hm/hr.");
        speed=speed+increment;
        System.out.println("After Increasing Speed of Bike is "+speed + "hm/hr.");
    }
    public void applyBrakes(int decrement){
        System.out.println("Initial Speed of Bike was "+speed + "hm/hr.");
        speed=speed-decrement;
        System.out.println("After Applying brakes Speed of Bike is "+speed + "hm/hr.");
    }
    public void display(){
        System.out.println("Speed - "+speed+" km/hr. \nGear -"+gear);
    }
    
}
class Car implements Vehicle{
    int speed;
    int gear;
    Car(){
        speed=30;
        gear=1;
    }
    public void changeGear(int newGear){
        gear = newGear;
        System.out.println("Car is now running on Gear - "+gear);
    }
    public void speedUp(int increment){
        System.out.println("Initial Speed of Car was "+speed + "hm/hr.");
        speed=speed+increment;
        System.out.println("After Increasing Speed of Bike is "+speed + "hm/hr.");
    }
    public void applyBrakes(int decrement){
        System.out.println("Initial Speed of Car was "+speed + "hm/hr.");
        speed=speed-decrement;
        System.out.println("After Applying brakes Speed of Car is "+speed + "hm/hr.");
    }
    public void display(){
        System.out.println("Speed - "+speed+" km/hr. \nGear -"+gear);
    }
}
public class Transport{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nSelect the mode of Trasport: \n\t1. Bicycle\n\t2. Bike\n\t3. Car");
        int ch = sc.nextInt();
        Bicycle bicycle = new Bicycle();
        Bike bike = new Bike();
        Car car = new Car();

        while(ch > 0 && ch < 4 )
        {
            {
            System.out.println("\nChoose Operation: \n\t1. Change Gear\n\t2. Increase Speed\n\t3. Decrease Speed\n\t4. Display Present State\n\t5. Exit");
            }
            int operate = sc.nextInt();
            switch (operate) {
                case 1:
                    System.out.println("Which Gear do you want to use? ");
                    int  g =  sc.nextInt();
                    if (ch == 1)
                        bicycle.changeGear(g);
                    else if(ch == 2)
                        bike.changeGear(g);
                    else 
                        car.changeGear(g);   
                    break;
                case 2:
                    System.out.println("By how many Km/hr do you want to increase speed? ");
                    int  incre =  sc.nextInt();
                    if (ch == 1)
                        bicycle.speedUp(incre);
                    else if(ch == 2)
                        bike.speedUp(incre);
                    else 
                        car.speedUp(incre);   
                    break;
                case 3:
                    System.out.println("By how many Km/hr do you want to Decrease speed? ");
                    int  decre =  sc.nextInt();
                    if (ch == 1)
                        bicycle.applyBrakes(decre);
                    else if(ch == 2)
                        bike.applyBrakes(decre);
                    else 
                        car.applyBrakes(decre);   
                    break;
                case 4:
                    if (ch == 1)
                        bicycle.display();
                    else if(ch == 2)
                        bike.display();
                    else 
                        car.display();
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Enter Valid Choice");
            }
        } 
    }
}

//Output:
C:\Users\prasad\OneDrive\Desktop\JAVA>javac Transport.java

C:\Users\prasad\OneDrive\Desktop\JAVA>java Transport

Select the mode of Trasport:
        1. Bicycle
        2. Bike
        3. Car
3

Choose Operation:
        1. Change Gear
        2. Increase Speed
        3. Decrease Speed
        4. Display Present State
        5. Exit
4
Speed - 30 km/hr.
Gear -1

C:\Users\prasad\OneDrive\Desktop\JAVA>javac Transport.java

C:\Users\prasad\OneDrive\Desktop\JAVA>java Transport

Select the mode of Trasport:
        1. Bicycle
        2. Bike
        3. Car
3

Choose Operation:
        1. Change Gear
        2. Increase Speed
        3. Decrease Speed
        4. Display Present State
        5. Exit
2
By how many Km/hr do you want to increase speed?
120
Initial Speed of Car was 30hm/hr.
After Increasing Speed of Bike is 150hm/hr.

Choose Operation:
        1. Change Gear
        2. Increase Speed
        3. Decrease Speed
        4. Display Present State
        5. Exit
1
Which Gear do you want to use?
4
Car is now running on Gear - 4

Choose Operation:
        1. Change Gear
        2. Increase Speed
        3. Decrease Speed
        4. Display Present State
        5. Exit
3
By how many Km/hr do you want to Decrease speed?
50
Initial Speed of Car was 150hm/hr.
After Applying brakes Speed of Car is 100hm/hr.
