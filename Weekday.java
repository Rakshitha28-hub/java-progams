import java.util.Scanner;

public class Weekday
{
   public static void main(String args[])
   {
       Scanner reader = new Scanner(System.in);
       System.out.print("Enter a number"); 
       int num = reader.nextInt();
       int rem = num%7;
       if (rem==0)
       {  
           System.out.print("\nIt is Monday");
       }
       else if (rem==1)
       {
           System.out.print("\nIt is Tuesday");
       }
        if (rem==2)
       {  
           System.out.print("\nIt is Wednesday");
       }
       else if (rem==3)
       {
           System.out.print("\nIt is Thurday");
       }
        if (rem==4)
       {  
           System.out.print("\nIt is Friday");
       }
       else if (rem==5)
       {
           System.out.print("\nIt is Saturday");
       }
       else if (rem==6)
       {
           System.out.print("\nIt is Sunday");
       }
    }
}