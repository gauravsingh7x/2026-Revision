import java.util.Scanner;

public class Loops {

    static void main() {

        Scanner scanner = new Scanner(System.in);

/*
//for loop
        System.out.print("print the number for table: ");
        int num = scanner.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num*i);
        }
        System.out.println("we're here after termination of loop at line 15");


//another example
        System.out.print("print the number between range starts divisible by 3 only: ");
        int start = scanner.nextInt();
        System.out.print("print the number between range ends divisible by 3 only: ");
        int end = scanner.nextInt();

        for(int i=start; i<=end; i++){
            if (i%3 == 0){
                System.out.println(i);
            }
        }
        System.out.println("we're here after termination of loop at line 28");


//another example with diff type of update
        System.out.print("print the number between range starts: ");
        int start = scanner.nextInt();
        System.out.print("print the number between range ends: ");
        int end = scanner.nextInt();
        for (int i=start; i<=end; i+=2){
            // i+=2 means i=i+2 > updating by 2
//          System.out.println(i);

            // odd numbers will be printed
            if (i%2 != 0 ){
                System.out.println(i);
            }
        }


//nested for loop example with '*' pattern of square
        for (int i=1; i<=7; i++){
            for (int j=1; j<=7; j++) {
                System.out.print("* ");
            }
            //this sout will start new line for next row after completion of once inner loop
            System.out.println();
        }
        System.out.println("we're here to at line 52");


//another example1 nested for loop
        for (int i=1; i<=3; i++){
            for (int j=1; j<=3; j++) {
                System.out.println("i = "+i+", j = "+j);
            }
       }
        System.out.println("we're here to at line 60");
//another example2 nested for loop
        for (int i=1; i<=3; i++){
            for (int j=1; j<=3; j++) {
                System.out.print("i = "+i+", j = "+j + "  ");
            }
            System.out.println();
       }
        System.out.println("we're here to at line 69");


//break keyword > exit the current iteration/block of code, upcoming iteration will not happen
        System.out.print("Print the number range starts: ");
        int start = scanner.nextInt();
        System.out.print("Print the number range ends: ");
        int end = scanner.nextInt();
        System.out.print("Enter the number for break: ");
        int breakIteration = scanner.nextInt();
        for (int i=start; i<=end; i++){
            if (i != breakIteration){
                System.out.println(i);
            } else {
                //breakIteration will not run itself
                break;
                //break exit the current iteration OR block of code
            }
        }
        System.out.println("We're here outside of loops at line 96");


//continue keyword > skip the iteration
        System.out.print("Print the number range starts: ");
        int start = scanner.nextInt();
        System.out.print("Print the number range ends: ");
        int end = scanner.nextInt();
//        System.out.print("Enter the number for continue: ");
//        int skipContinue = scanner.nextInt();

        for (int i = start; i <= end; i++) {
//            if (i == skipContinue){
            if (i == 3 || i == 4 || i == 6) {
                continue;
            }
            System.out.println(i);
        }


//while loop
        int i=1;
        while (i<=5){
            System.out.println("learning");
            i++;
        }


//nested while loop
        int i=1;
        while (i<=5){
            int j=1;    //imp: reset for each row
            while (j<=5) {
                System.out.print("i = "+i+", j= "+j+ "  ");
                j++;
            }
            System.out.println();
            i++;
        }


//do-while loop > runs first statement, no matter is condition is tru or not
//demo1
        int i=1;
        do {
            System.out.println(i);
            i++;
        }while (i<=0);
*/
//demo2
        int i=1;
        do {
            System.out.println(i);
            i++;
        }while (i<=10);


    }
}

