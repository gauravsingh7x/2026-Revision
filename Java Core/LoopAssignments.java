import java.util.Scanner;

public class LoopAssignments {
    static void main() {
        Scanner scanner=new Scanner(System.in);

//printing counting 1 to n
/*
        //by for loop
        System.out.print("Enter the Number to end of counting: ");
        int endFor=scanner.nextInt();
        for (int i=1; i<=endFor; i++){
            System.out.println(i);
        }
        //by while loop
        System.out.print("Enter the Number to end of counting: ");
        int endWhile=scanner.nextInt();
        int i= 1;
        while (i<=endWhile){
            System.out.println(i);
            i++;
        }
        //by do-while loop
        System.out.print("Enter the Number to end of counting: ");
        int endDoWhile=scanner.nextInt();
        int j= 1;
        do {
            System.out.println(i);
            j++;
        }while (j<=endDoWhile);


//printing counting n to 1
        //by for loop
        System.out.print("Enter the Number to start of reverse counting: ");
        int startFor=scanner.nextInt();
        for (int i=startFor; i>=1; i--){
            System.out.println(i);
        }
        //by while loop
        System.out.print("Enter the Number to start of reverse counting: ");
        int i= scanner.nextInt();
        while (i>=1){
            System.out.println(i);
            i--;
        }
        //by do-while loop
        System.out.print("Enter the Number to start of reverse counting: ");
        int startDoWhile=scanner.nextInt();
        int j=startDoWhile;
        do {
            System.out.println(i);
            j--;
        }while (j>=startDoWhile);


//printing 10 multiplies of n
        //by for loop
        for (int i=1; i<=10; i++){
            System.out.println(i*10);
        }
        //by while loop
        int i=1;
        while (i<=10){
            System.out.println(i*10);
            i++;
        }
        //by do-while loop
        int j=1;
        do {
            System.out.println(j*10);
            j++;
        }while (j<=10);


//printing names in 100 times
        //by for loop
        System.out.print("Enter the number to start: ");
        int startFor=scanner.nextInt();
        System.out.print("Enter the number to end: ");
        int endFor=scanner.nextInt();
        for (int i=startFor; i<=endFor; i++){
            System.out.println(i+" for loop");
        }
        //by while loop
        System.out.print("Enter the number to start: ");
        int startWhile=scanner.nextInt();
        System.out.print("Enter the number to end: ");
        int endWhile=scanner.nextInt();
        int i=startWhile;
        while (i<=endWhile){
            System.out.println(i+" while loop");
            i++;
        }
        //by do-while loop
        System.out.print("Enter the number to start: ");
        int startDoWhile=scanner.nextInt();
        System.out.print("Enter the number to end: ");
        int endDoWhile=scanner.nextInt();
        int j=startDoWhile;
        do {
            System.out.println(j+" do-while loop");
            j++;
        }while (j<=endDoWhile);


//print all prime numbers from 1 to 100 or given range
        //by for loop
        System.out.print("Enter the number to print prime number range (starts at 1): ");
        int endFor=scanner.nextInt();
        for (int prime = 2; prime <= endFor; prime++) {
            boolean isPrime = true;
            for (int i = 2; i <= prime / 2; i++) {
                if (prime % i == 0) {
                    isPrime = false;
                    break;
                }
            }if (isPrime) {
                System.out.println(prime + " prime number > for loop ");
            }
        }

        //by while loop
        System.out.print("Enter the number to print prime number range (starts at 1): ");
        int endWhile=scanner.nextInt();
        int prime=2;
        while (prime <= endWhile){
            boolean isPrime = true;
            int i=2;
            while (i<=prime/2){
                if (prime%i == 0){
                  isPrime = false;
                  break;
                }
                i++;
            }if (isPrime)
                System.out.println(prime + " prime number > while loop ");
        prime ++;
        }

        //by do-while loop
        System.out.print("Enter the number to print prime number range (starts at 1): ");
        int endDoWhile=scanner.nextInt();
        int primeDo = 2;
        do {
            boolean isPrime = true;
            int i = 2;
            do {    // inner loop to check prime
                if (primeDo%i == 0 && primeDo != i) {
                    isPrime = false;
                    break;
                }i++;
            } while (i <= primeDo/2);
            if (isPrime) {
                System.out.println(primeDo + " prime number > do-while loop");
            }
            primeDo++;
        } while (primeDo <= endDoWhile);


//print all even numbers from 1 to 100 or given range
        //by for loop
        System.out.print("Enter the number for range start: ");
        int startFor=scanner.nextInt();
        System.out.print("Enter the number for range end: ");
        int endFor=scanner.nextInt();
        for (int i=startFor; i<=endFor; i++){
            if (i%2==0){
                System.out.println(i+" even number using for loop");
            }
        }
        //by while loop
        System.out.print("Enter the number for range start: ");
        int startWhile=scanner.nextInt();
        System.out.print("Enter the number for range end: ");
        int endWhile=scanner.nextInt();
        int i=startWhile;
        while (i<=endWhile){
            if (i%2==0){
                System.out.println(i+" even number using while loop");
            }i++;
        }
        //by do-while loop
        System.out.print("Enter the number for range start: ");
        int startDoWhile=scanner.nextInt();
        System.out.print("Enter the number for range end: ");
        int endDoWhile=scanner.nextInt();
        int j=startDoWhile;
        do {
            if (j%2==0){
                System.out.println(j+" even number using do-while loop");
            }
            j++;
        }while (j<=endDoWhile);


//print the sum of all the numbers from 1 to n OR given range
        //by for loop
        System.out.print("Enter the number for range start: ");
        int startFor=scanner.nextInt();
        System.out.print("Enter the number for range end: ");
        int endFor=scanner.nextInt();
        int sumFor = 0;
        for (int i=startFor; i<=endFor; i++){
            sumFor += i;
        }
        System.out.println("Summation of entered range numbers using 'for' loop= "+sumFor);

        //by while loop
        System.out.print("Enter the number for range start: ");
        int startWhile=scanner.nextInt();
        System.out.print("Enter the number for range end: ");
        int endWhile=scanner.nextInt();
        int sumWhile = 0;
        int i=startWhile;
        while (i<=endWhile){
            sumWhile +=i;
            i++;
        }
        System.out.println("Summation of entered range numbers using 'while' loop= "+sumWhile);

        //by do-while loop
        System.out.print("Enter the number for range start: ");
        int startDoWhile=scanner.nextInt();
        System.out.print("Enter the number for range end: ");
        int endDoWhile=scanner.nextInt();
        int sumDoWhile = 0;
        int j=startDoWhile;
        do {
            sumDoWhile +=j;
            j++;
        }while (j<=endDoWhile);
        System.out.println("Summation of entered range numbers using 'do-while' loop= "+sumDoWhile);
*/

//print the integers in range from 50 to 100 or given range, that are perfectly divisible by 7
        //by for loop
        System.out.print("Enter the number for range start: ");
        int startFor=scanner.nextInt();
        System.out.print("Enter the number for range end: ");
        int endFor=scanner.nextInt();
        for (int i=startFor; i<=endFor; i++){
            System.out.println("using 'for' loop > Integers = "+i);
        }

        //by while loop
        System.out.print("Enter the number for range start: ");
        int startWhile=scanner.nextInt();
        System.out.print("Enter the number for range end: ");
        int endWhile=scanner.nextInt();
        int i=startWhile;
        while (i<=endWhile){
            System.out.println("using 'while' loop > Integers = "+i);
            i++;
        }

        //by do-while loop
        System.out.print("Enter the number for range start: ");
        int startDoWhile=scanner.nextInt();
        System.out.print("Enter the number for range end: ");
        int endDoWhile=scanner.nextInt();
        int j=startDoWhile;
        do {
            System.out.println("using 'do-while' loop > Integers = "+j);
            j++;
        }while (j<=endDoWhile);

    }
}
