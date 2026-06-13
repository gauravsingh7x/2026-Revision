
public class Methods {

/*    //declaration || definition
    static void printTable(){
        for (int i=1; i<=10; i++){
            int table=i*2;
            System.out.println("-> "+table);
        }
    }


    //x & y are called parameters
    static void printSum(int x, int y){
        System.out.println("Sum= "+(x+y));
    }


    static void printMultiplication(int a, int b){
        int multi=a*b;
        //'return' keyword will return from current line > next line will not be executed
//        return;
        System.out.println("Multi= "+multi);
        return;
    }

    //method overloading example
    static int add(int m, int n, int o){
        return m+n+o;
    }
    static int add(int m, int n){
        return m+n;
    }
    static float add(int p, float q){
        float sum = p+q;
        return sum;
    }


    //call by value || pass by value
    static void solve(int num){
        System.out.println("before Inside solve: "+num);
        num = num*10;
        System.out.println("after Inside solve: "+num);
    }
    //another one to understand > call by value || pass by value
    static void solve(int a){
        System.out.println("before Inside solve: "+a);
        a = a*10;
        System.out.println("after Inside solve: "+a);
    }

    //global variable < can use anywhere
    static int value = 20;
    //variable Scoping > we can't use this variable 'value' out of this method
    static void printMultiples(){
        int value = 20;
        for (int i=1; i<=10; i++){
            System.out.println(20*i);
        }
        System.out.println("exit the printMultiples loop");
    }

        //to understand method scoping
        static void solve(){
            int num=5;
            System.out.println(num);
            return;
        }
*/


    public static void main(String[] args) {
        System.out.println("Function Learning");


        /*
        //to understand method scoping
        solve();
        System.out.println("main method ");


        //to understand variable scoping
        printMultiples();


        //call by value || pass by value
        int num =5;
        System.out.println("Inside main1 "+num);
        solve(num);
        System.out.println("Inside main2 "+num);


        //method overloading example
        int ans1 = add(5,7);
        float ans2 = add(10,7);
        System.out.println(ans1);
        System.out.println(ans2);

        System.out.println(add(5,7));
        System.out.println(add(10,15, 15));


        //non-void method returned result we've to store in same returnType var to use
        int res= add(10,25);
        System.out.println("Sum using non-void method = "+res);

        printMultiplication(10,2);

        // values are called 'Arguments' which received by parameters
        printSum(5,10);

        printTable();

        System.out.println("we're here at line after function executed");
*/
    }


}
