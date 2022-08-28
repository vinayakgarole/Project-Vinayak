import java.util.Scanner;
public class Arithmetic_Operation_Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();
        int equation1 = a + b * c;
        int equation2 = c + a / b;
        int equation3 = a % b + c;
        int equation4 = a * b + c;
        int max = Math.max(Math.max(equation1, equation2), Math.max(equation3, equation4));
        if (equation1 == max) {
            System.out.println("equation1 is maximum.");
        } else if (equation2 == max) {
            System.out.println("equation2 is maximum.");
        } else if (equation3 == max) {
            System.out.println("equation3 is maximum.");
        } else System.out.println("equation4 is maximum.");

        int min = Math.min(Math.min(equation1, equation2), Math.min(equation3, equation4));
        if (equation1 == min) {
            System.out.println("equation1 is minimum.");
        } else if (equation2 == min) {
            System.out.println("equation2 is minimum.");
        } else if (equation3 == min) {
            System.out.println("equation3 is minimum.");
        } else System.out.println("equation4 is minimum.");
    }
}
