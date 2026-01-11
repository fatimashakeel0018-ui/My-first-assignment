import java.util.Scanner;
public class Code3 {
    public static void main(String[] args) {
     
        Scanner see=new Scanner(System.in);
        double originalsellingprice;
        System.out.println("the original selling price is ");
        originalsellingprice=see.nextInt();
        double discountpercentage;
        System.out.println("the discount percentage is :");
        discountpercentage=see.nextInt();
        double discountsellingprice;
        System.out.println("the discount selling price is ");
        discountsellingprice=originalsellingprice-(discountpercentage/100*originalsellingprice);
        System.out.println(discountsellingprice);
    }
}
