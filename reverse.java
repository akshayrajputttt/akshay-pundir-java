import java.util.Scanner;

public class reverse {
  public static void armstrong(){
Scanner sc=new Scanner(System.in);
    int number = sc.nextInt();
    int originalNumber, remainder, result = 0;
    originalNumber = number;

    while (originalNumber != 0) {
        remainder=originalNumber%10;
        result=result*10 + remainder;
        originalNumber = originalNumber/10;
    }
    
    System.out.println(result);
}
  public static void main(String[] args) {
     armstrong();
}

}
