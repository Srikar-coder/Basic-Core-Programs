import java.util.*;
public class largestOfThree
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter three numbers");
System.out.println(Math.max(sc.nextInt(),Math.max(sc.nextInt(),sc.nextInt())));
}
}
