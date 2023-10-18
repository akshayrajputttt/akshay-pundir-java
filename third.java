import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //area of rectangle
        System.out.println("enter the length");
        int length=sc.nextInt();
        System.out.println("enter the bredth");
        int bredth=sc.nextInt();
        int result= length * bredth;
        System.out.println(result);

    }
}
