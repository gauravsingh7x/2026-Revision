//print the num 1 to 5

import java.util.Scanner;

public class factorialRecur {

    public static int calcFactorial(int n) {
        if(n==0 || n==1){
            return 1;
        }
        int fact_nm1 =  calcFactorial(n-1);
        int fact_n = n*fact_nm1;
        return fact_n;

    }


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number to get factorial : ");
        int n=scanner.nextInt();
        int fact = calcFactorial(n);  // stored in fact = call(arg)
        System.out.println(fact);

    }
}
