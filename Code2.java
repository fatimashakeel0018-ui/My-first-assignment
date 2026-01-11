import java.util.Scanner;

public class Code2 {
    public static void main(String[] args) {
     
        Scanner read=new Scanner(System.in);
        double radius;
        System.out.println("Enter the radius:");
        radius=read.nextInt();
        double circum;
        System.out.println("the circumference is:");
        circum=(2*Math.PI*radius);
        System.out.println(circum);
        double area;
        System.out.println("the area is:");
        area=(Math.PI*Math.pow(radius,2));
        System.out.println(area);

    }
}
