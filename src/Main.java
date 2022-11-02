public class Main {
    public static void main(String[] args){
//        int sum = sum(5);
//        int fac = factorial(3);
//        fac = factorial(3, 1);
//        System.out.println(fac);
        System.out.println(factorialHeadRec(5));
//        tailRecursion(5);
    }

    public static int sum(int n){
        if(n == 0) return  0;
        return n + sum(n - 1);
    }

    public static int factorial(int n){
        if(n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static int factorial(int n, int res){
        if(n == 1) return res;
        return factorial(n - 1, n * res);
    }

    public static void headRecersion(int n){
        System.out.println("Called");

        if(n == 0) return;
        // We call the method recursively
        headRecersion(n - 1);
        // then we do some operations
        System.out.println("Value of n => " + n);
    }

    public static void tailRecursion(int n){
        System.out.println("Called");
        if(n == 0) return;
        // we do some operations
        System.out.println("Value of n => " + n);
        // then we call the function recursively
        tailRecursion(n - 1);
    }

    public static int factorialHeadRec(int n){
        if(n == 1) return 1;
        System.out.println("Val Of n => " + n);

        int res = factorialHeadRec(n - 1);

        return  res * n;
    }

}