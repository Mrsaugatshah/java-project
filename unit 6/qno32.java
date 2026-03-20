import java.util.Scanner;

class qno32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str.length() > 3) {
            System.out.println("Character at index 3 is: " + str.charAt(3));
        } else {
            System.out.println("String length is less than 4, index 3 not available.");
        }

        sc.close();
    }
}
