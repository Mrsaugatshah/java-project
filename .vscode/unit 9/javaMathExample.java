public class javaMathExample {
    public static void main(String args[]) {
        double x = 28;
        double y = 4;
        // return the maximum of two numbers
        System.out.println("maximum number of x and y is: " + Math.max(x, y));
        // return the squre root of y
        System.out.println("Squre root of y is:" + Math.sqrt(y));
        // return 28power of 4 i.e. 28*28*28
        System.out.println("power od x and y is:" + Math.pow(x, y));
        // return the logarithm of given value
        System.out.println("logarithm of x is" + Math.log(x));
        System.out.println("logarithm of y is" + Math.log(y));
        // return the logarithm of given value when base is 10
        System.out.println("log10 of x is:" + Math.log10(x));
        System.out.println("log10 of y is:" + Math.log10(y));
        // return the log of x+1
        System.out.println("log1p of x is" + Math.log1p(x));
        // return x power of2
        System.out.println("exp of x is:" + Math.exp(x));
        // return (x power of 2)-1
        System.out.println("expm1 of x is: " + Math.expm1(x));

    }
}
