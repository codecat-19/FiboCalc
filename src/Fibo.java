public class Fibo {

    public static void main(String[] args) {

        int count = 10;
        int num1 = 0;
        int num2 = 1;

        System.out.print("Fibonacci series of " + count + " numbers ");

        for(int i = 1;i <= count;i++) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}
