import java.util.Scanner;

public class Solution
{
    public static double calculator(double a, double b, String op){
        if(op.equals("+")){       // for addition
            return a+b;
        }else if(op.equals("-")){  // for substraction
            return a-b;
        }else if(op.equals("*")){  // for multiplication
            return a*b;
        }else if(op.equals("/")){  // for division
            return a/b;
        }
        return Integer.MIN_VALUE;   // for invalid operation
    }
    
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = s.nextDouble();
        System.out.print("Enter the second number: ");
        double b = s.nextDouble();
        System.out.print("Operation(+, -, *, /): ");
        String op = s.next();
        double result = calculator(a, b, op);
        if(result == Integer.MIN_VALUE){
            System.out.print("Invalid Operation Type");
        }else{
            System.out.print("Result: " +result);   
        }
	}
}