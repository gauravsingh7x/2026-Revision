//print the num 1 to 5

public class Recur2 {

    public static void printNum(int num) {
        if (num == 6 ) return;     //base condition
        System.out.println(num);    //print
        printNum(num + 1);          //recursive fun
    }


    public static void main(String[] args) {

        printNum(5);  //call(arg)

    }
}
