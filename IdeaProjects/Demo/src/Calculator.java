public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int addition = calculator.add(10, 20);
        System.out.println("Sum of two number is: " + addition);
    }


    public int add(int number1, int number2) {
        return number1 + number2;
    }
}
