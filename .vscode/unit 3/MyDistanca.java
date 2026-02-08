/* write a class distance to feet inches */

import java.util.Scanner;

class Distance {
    private int feet;
    private int inches;

    public Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public void addDistance(Distance d) {
        this.feet += d.feet;
        this.inches += d.inches;
        if (this.inches >= 12) {
            this.feet += this.inches / 12;
            this.inches %= 12;
        }
    }

    public void subtractDistance(Distance d) {
        int totalInches1 = this.feet * 12 + this.inches;
        int totalInches2 = d.feet * 12 + d.inches;
        int result = Math.abs(totalInches1 - totalInches2);
        this.feet = result / 12;
        this.inches = result % 12;
    }

    public void displayDistance() {
        System.out.println("Distance:" + feet + "feet," + inches + "inches");
    }

}

public class MyDistanca {
    public static void main(String args[]) {
        int choice;
        Distance distance1 = new Distance(5, 8);
        Distance distance2 = new Distance(3, 2);
        Scanner sc = new Scanner(System.in);
        System.out.print("\npress 1 for sum and 2 for  difference:");
        choice = sc.nextInt();

        if (choice == 1) {
            // add distance
            distance1.addDistance(distance2);
            System.out.println("after addition:");
            distance1.displayDistance();
        }
        if (choice == 2) {
            // subtract distances
            distance1.subtractDistance(distance2);
            System.out.println("after subtraction:");
            distance1.displayDistance();
        }
    }

}
