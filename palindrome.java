import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         int number=sc.nextInt();
         int temp=0;
         int x=number;
         x=number%10;
         number=number/10;
         temp=temp*10+x;
         System.out.println(number);

    }
}
