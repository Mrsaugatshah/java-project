import java.util.Scanner;

public class Switch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, num;
        System.out.print("enter a number:");
        num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("sunday");
                break;

            case 2:
                System.out.println("monday");
                break;

            case 3:
                System.out.println("tuesday");
                break;

            case 4:
                System.out.println("wednesday");
                break;

            case 5:
                System.out.println("thuesday");
                break;

            case 6:
                System.out.println("friday");
                break;

            case 7:
                System.out.println("saturday");
                break;

        }
    }

}
