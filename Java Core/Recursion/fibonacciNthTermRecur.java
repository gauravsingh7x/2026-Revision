public class fibonacciNthTermRecur {

    public static void printFibonacci(int f_t, int s_t, int nth_term){
        if(nth_term==0){
            return;
        }
        int n_t = f_t + s_t;
        System.out.println(n_t);
        printFibonacci(s_t,n_t,nth_term-1);

    }

    public static void main(String[] args) {
        int first=0, second=1;
        System.out.println(first);
        System.out.println(second);
        int nth_term=5;
        printFibonacci(first,second,nth_term-2);


    }

}
