public class Recursive {
    public static void  stupidPrint() {
        System.out.println("Hello Recursion");
        stupidPrint();
    
}

public static int factorial (int n) {
    if (n == 1)
        return 1;
    else{
        int smallerSolution = factorial(n-1);
        return n * smallerSolution; 
}
}

public static int sum (int n) {
    if (n == 0)
        return 0;
    else{
        int smallerSolution = sum (n-1);
        return smallerSolution + n; 
}
}

public static int fib (int n) {
    if (n == 0 || n==1)
        return 1;

    else{
        
        return fib (n-1) + fib(n-2);
}
}

public static void main(String[] args) {
    //stupidPrint();
    System.out.println(fib(3));
}

}

