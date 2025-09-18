public class Main {

    public static int multiplyOddNumbers(int n) {
        if (n <= 0) {
            return 1;
        }
        if (n == 1) 
        {
            return 1;
        }

        if (n % 2 == 0) {
            return multiplyOddNumbers(n - 1);
        } 
        else 
        {
            return n * multiplyOddNumbers(n - 2);
        }
    }

    public static void main(String[] args) 
  {
        int n = 7;
        long product = multiplyOddNumbers(n);
        System.out.println("Product of odd numbers from 1 to " + n + " is " + product);
    }
    
    public class DigitCounter {

    public static int countDigits(int n) {
        if (n < 0) {
            n = -n;
        }

        if (n < 10) {
            return 1;
        }

        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        int number = 12345;
        int digits = countDigits(number);
        System.out.println("Number of digits in " + number + " is " + digits);
    }
    public class RecursiveDivision {

    public static int divide(int dividend, int divisor) 
      {

        if (dividend < 0 && divisor < 0) {
            return divideHelper(-dividend, -divisor);
        } 
        else if (dividend < 0) 
        {
            return -divideHelper(-dividend, divisor);
        } 
        else if (divisor < 0) 
        {
            return -divideHelper(dividend, -divisor);
        } 
        else 
        {
            return divideHelper(dividend, divisor);
        }
    }

    private static int divideHelper(int dividend, int divisor) 
      {
        if (dividend < divisor) 
        {
            return 0;
        }
        return 1 + divideHelper(dividend - divisor, divisor);
    }

    public static void main(String[] args) {
        System.out.println("17 / 3 = " + divide(17, 3));
        System.out.println("-17 / 3 = " + divide(-17, 3));
        System.out.println("17 / -3 = " + divide(17, -3));
        System.out.println("-17 / -3 = " + divide(-17, -3));
        System.out.println("5 / 10 = " + divide(5, 10));
    }
}
