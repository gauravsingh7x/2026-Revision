import java.util.Scanner;

//print the sum of n  natural numbers

public class sumNaturalNum {

    public static void printSum(int i, int n, int sum) {
        if (i==n) {
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1,n,sum);
        System.out.println(i);
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=scanner.nextInt();
                // 1 is i, 5 is n, sum is 0
        printSum(1, n, 0);  //call(arg)

    }
}
