import java.util.Scanner;

public class Code6 {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    double a;
    System.out.println("Enter the first length:");
    a=sc.nextInt();
    double b;
    System.out.println("Enter the second length:");
    b=sc.nextInt();
    double h;
    System.out.println("Enter the height:");
    h=sc.nextInt();
    double area;
    System.out.println("the area is:");
    area=0.5*(a+b)*h;
    System.out.println(area);



    }
}
