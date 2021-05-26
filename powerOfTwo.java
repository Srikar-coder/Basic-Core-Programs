import java.util.Scanner;
public class powerOfTwo{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
int n;
System.out.println("Enter the number");
n=sc.nextInt();
for(int i=0;i<=n;i++){
System.out.println("Power of 2 "+i+"is:"+(int)(Math.pow(2,i)));
}
}
}
