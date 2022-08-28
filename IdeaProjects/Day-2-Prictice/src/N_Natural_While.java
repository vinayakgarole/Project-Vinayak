import java.util.Scanner;

public class N_Natural_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        int sum=0;
        int i =1;
        while (i<=a){
            sum +=i;
            i++;
        }
        System.out.println("The result is: "+sum);
    }
}