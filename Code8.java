import java.util.Scanner;

public class Code8 {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    double a;
    System.out.println("Enter the first length");
    a=sc.nextInt();
    double b;
    System.out.println("Enter the second length");
    b=sc.nextInt();
    double c;
    System.out.println("Enter the third length");
    c=sc.nextInt();
    double s;
    s=(a+b+c)/2;
    System.out.println("the s is" );
    System.out.println(s);
    double area;
    System.out.println("the area is :");
    area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.println(area);
    }
}
