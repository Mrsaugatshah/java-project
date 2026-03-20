abstract class Bank {
    abstract int rateOfIneterest();
}

class EBL extends Bank {
    int rateOfIneterest() {
        return 3;
    }
}

class NBL extends Bank {
    int rateOfIneterest() {

        return 4;
    }
}

public class abstraction {
    public static void main(String args[]) {
        Bank obj1 = new EBL();
        Bank obj2 = new NBL();
        System.out.println("the interest rate of everest bank=" + obj1.rateOfIneterest() + "%");
        System.out.println("the interest rate of Nepal bank = " + obj2.rateOfIneterest() + "%");
    }
}
