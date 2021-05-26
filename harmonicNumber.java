import java.util.Scanner;
public class harmonicNumber{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
if(n<=0){
System.out.println("The number should be greater than Zero");
}else{
String str ="1/1";
for(int i=2;i<=n;i++)
str+=" + 1/"+i;
System.out.println("The Nth Harmonic Value is: "+str);
}

}
}
