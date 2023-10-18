import java.util.Scanner;

public class first {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is " + result);
        }
        
    }

//system.out.println(name.compareto(name4))
//lexicographical order
//multi threading and micro services
//variable data type input buffer today class 21/9
//system.in.readallbytes
//throw exception
//byte range -128 to 127
//short  range 2 byte 16 bit 1 bit for sign 15 for data
//-2 ki power 15 to 2 ki power 15 -1
//integer 4 byte 32 bit 1 bit for sign and remaining number
//-2 ki 31 to 2 ki 31 -1
//long range 8 byte
//-2 ki 63 to 2 ki 63 -1
//operators 26/9
//imp is butwise operator 
//dono bit different hai toh 1 ayega or agr same hai toh  xor
//ternary and instance of ky hota hai
//final value in java and capital stringis condisder as constant