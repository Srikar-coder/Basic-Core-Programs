import java.util.Scanner;
public class leapYear{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter valid Year:");
int year=sc.nextInt();
if(year%4 == 0)
{
if(year%100 == 0)
{
if(year%400 == 0)
System.out.println("Yes it is a leap year");
else
System.out.println("No it is not a leap year");
}
else
System.out.println("Yes it is a leap year");
}
else
{
System.out.println("No it is not a leap year");
}
}

}
