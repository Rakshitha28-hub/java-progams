import java.util.Scanner;
class GreatestThreeternary
{
    public static void main(String args[])
    {
         Scanner reader = new Scanner(System.in);
         System.out.print("\nEnter the first num:");
         int fn = reader.nextInt();
         System.out.print("\nEnter the second num:");
         int sn = reader.nextInt();
         System.out.print("\nEnter the third num:");
         int tn = reader.nextInt();
         reader.close();
         int result = (fn > sn ? (fn > tn ? fn : tn) : (sn > tn ? sn : tn));
         System.out.print("\nGreatest number among three is " + result);
     }
}