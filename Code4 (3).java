import java.util.Scanner;

public class Code4 {
    
        public static void main(String[] args) {
            
    




        Scanner not=new Scanner(System.in);
        double discountsellingprice;
        System.out.println("the discount selling price is ");
        discountsellingprice=not.nextInt();
        double discountpercentage;
        System.out.println("the discount percentage is :");
        discountpercentage=not.nextInt();
        double originalsellingprice;
        System.out.println("the original selling price is ");
        originalsellingprice=(discountsellingprice*100)/(100-discountpercentage);
        System.out.println(originalsellingprice);




        }



}
