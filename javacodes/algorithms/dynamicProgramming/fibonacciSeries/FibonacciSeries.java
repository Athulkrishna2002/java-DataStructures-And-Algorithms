package javacodes.algorithms.dynamicProgramming.fibonacciSeries;

public class FibonacciSeries {
    static int counter = 0;
    static int counterb = 0;
    static int counterWithMemoization = 0;
    static Integer[] memo = new Integer[100];

    public static int fibwitoutMemmoization(int n){
        counter++;

        if(n==0 || n==1){
            return n;
        }
        return fibwitoutMemmoization(n-1) + fibwitoutMemmoization(n-2);
    }

    public static int fibwithUSingMemmoization(int n){
        counterWithMemoization++;
        if(memo[n] != null){
            return memo[n];
        }

        if(n==0 || n==1){
            return n;
        }
        memo[n] = fibwithUSingMemmoization(n-1) + fibwithUSingMemmoization(n-2);
        return memo[n];
    }
    // Bottom up approach
    public static int fib2(int n){
        int[] fibList = new int[n + 1];
        fibList[0] = 0;
        fibList[1] = 1;

        for (int index = 2; index <= n; index++){
            counterb++;
            fibList[index] = fibList[index-1] + fibList[index-2];
        }
        return fibList[n];
    }

    public static void main(String[] args){
        int n = 7;
        System.out.println("\nFib of "+n+" without using memmoization = "+fibwitoutMemmoization(n));
        System.out.println("Counter without using memmoization = "+counter);

        System.out.println("\nFib of "+n+" with using Memmoization = "+fibwithUSingMemmoization(n));
        System.out.println("Counter using memmoization = "+counterWithMemoization);

        System.out.println("\nFib of "+n+" with using bottom up approach = "+fib2(n));
        System.out.println("Counter using bottom up approach = "+counterb);

    }
}
