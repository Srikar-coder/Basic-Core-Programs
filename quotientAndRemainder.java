import java.util.Scanner;
public class quotientAndRemainder {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter dividend");
int x=sc.nextInt();
System.out.println("Enter divisor");
int y=sc.nextInt();
int quotient = x/y;
int remainder = x%y;
System.out.println("Quotient = " + quotient);
System.out.println("Remainder = " + remainder);
  }
}
