// WAJP to check whether the number is Armstrong or not.
package day10;

public class P51 {

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }

        return count;
    }

    public static int power(int number, int power) {

        int pow = 1;
        for (int i = 1; i <= power; i++) {
            pow = pow * number;
        }

        return pow;
    }

    public static void main(String[] args) {

        int n = 153, temp = n, sum = 0;
        int power = countDigits(n);
        while (n != 0) {
            int d = n % 10;
            sum = sum + power(d, power);
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }

    }

}
