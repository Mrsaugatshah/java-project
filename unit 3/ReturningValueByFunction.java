public class ReturningValueByFunction {
    int sum(int a, int b) {
        return a + b;
    }

    
    public static void main(String args[]) {
        int a = 5, b = 10;
        ReturningValueByFunction obj = new ReturningValueByFunction();
        System.out.println("sum =" + obj.sum(a, b));
    }
}
