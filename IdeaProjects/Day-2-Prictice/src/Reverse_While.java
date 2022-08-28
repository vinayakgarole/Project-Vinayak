import java.util.Scanner;

public class Reverse_While {
    public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = obj.nextInt();
        int sum = 0;
        while(num > 0)
        {
            int r = num %10;
            System.out.println(r);
            sum = sum * 10 + r;
            num= num/10;
        }
        System.out.println(sum);
    }
}