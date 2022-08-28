import java.util.Scanner;

public class Display_Unit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        if (a < 10) {
            System.out.println("Entered number's unit is ones");
        } else if (a < 100) {
            System.out.println("Entered number's unit is tens");
        }else if (a < 1000) {
            System.out.println("Entered number's unit is hundreds");
        }else if (a < 100000) {
            System.out.println("Entered number's unit is thousands");
        } else {
            System.out.println("Sorry try again.");
        }
    }
}
