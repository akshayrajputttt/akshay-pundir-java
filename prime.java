import java.util.Scanner;
public class prime{
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    char input =sc.next().charAt(0);
    System.out.println(input);
    if(input=='a' || input=='e' || input=='i'|| input=='o'|| input=='u'){
        System.out.println("the alphabet is vowel");
    }
else{
    System.out.println("consonants");
}
}
}