import java.math.BigInteger;
import java.util.Scanner;

public class TakingInput {
    public static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int firstNum = scanner.nextInt();

        System.out.print("Enter the second value: ");
        int secondNum = scanner.nextInt();
        int result = firstNum + secondNum;

        System.out.print("Enter the value of Big Integer: ");
        BigInteger bigInteger = scanner.nextBigInteger();

        System.out.print("Enter the value of flag : ");
        boolean flag = scanner.nextBoolean();

        System.out.print("Enter the value for short: ");
        short shortVal = scanner.nextShort();

        System.out.print("Enter the value for float: ");
        float floatVal = scanner.nextFloat();

        System.out.println("Result is: "+result);
        System.out.println("Big Integer value: "+bigInteger);
        System.out.println("flag: "+flag);
        System.out.println("short value: "+shortVal);
        System.out.println("float value: "+floatVal);

        scanner.close();

    }
}
