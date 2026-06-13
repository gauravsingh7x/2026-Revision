import java.util.Scanner;

//print the reverse number to entered by user by recu
public class Recur1 {


    public static void printNum(int num) {
        if (num == 0) return;
        System.out.println(num);
        printNum(num - 1);
    }


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scanner.nextInt();
        printNum(num);

    }
}
