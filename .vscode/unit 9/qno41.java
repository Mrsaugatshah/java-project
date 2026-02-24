class qno41 {
    public static void main(String[] args) {

        // Primitive data types
        int num = 10;
        double price = 25.75;

        // Boxing (Primitive → Object)
        Integer objInt = Integer.valueOf(num);
        Double objDouble = Double.valueOf(price);

        System.out.println("Integer Object: " + objInt);
        System.out.println("Double Object: " + objDouble);

        // Unboxing (Object → Primitive)
        int newNum = objInt.intValue();
        double newPrice = objDouble.doubleValue();

        System.out.println("Unboxed int value: " + newNum);
        System.out.println("Unboxed double value: " + newPrice);
    }
}
