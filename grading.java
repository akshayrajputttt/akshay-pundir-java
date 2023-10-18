import java.util.Scanner;
public class grading{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>=90){
            System.out.println("A");
           
        }
         else if(marks<90 && marks>80){
                System.out.println("B");
            }
            else{
                System.out.println("C");
            }
    }

}