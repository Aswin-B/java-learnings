import java.util.Scanner;

public class If_else_statements {
    public static void main(String[] args) {
        // System.out.println("If else statements");

        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        num = scanner.nextInt();

        if(num > 0){
            System.out.println("The given number is +ve");
        }
        else{
            System.out.println("The given number is -ve");
        }
    }
}
