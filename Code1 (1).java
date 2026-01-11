import java.util.Scanner;

public class Code1 {
    public static void main(String[] args) {
      
       Scanner sc=new Scanner(System.in);
       int num1;
       int num2;
       System.out.println("Enter num1:");
       num1=sc.nextInt();
       System.out.println("Enter num2:");
       num2=sc.nextInt();
       double p;
       System.out.println("The percentage is");
       p=(1.0*num1/num2*100);
       System.out.println(p); 

    }
}
