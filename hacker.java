
import java.util.Scanner;

abstract class Calculator {
    abstract int add(int a, int b);
}

class Adder extends Calculator{
    public int add(int a, int b){
        return a+b;
    }
}
public class hacker{
    public static void main(String[] args){
        int a,b;
        try(Scanner scan=new Scanner(System.in)){
            a=scan.nextInt();
            b=scan.nextInt();
        }
        Calculator adds=new Adder();
        System.out.println("The sum "+adds.add(a,b));
        }
    }

