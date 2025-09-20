public class Main{
  public static int sumSequence(int n){
    if(n == 1){
      return 1*2;
    }
    int previusSum = sumSequence(n-1);
    if(n%2 == 0){
      return previusSum + (n * n);
    }
    else{
      return previusSum + (n*2);
    }
  }
  public static void main(String [] args)
  {
    int n = 7;
    int result = sumSeuence(n);
    System.out.println("Sum of the sequence up to " + n + " is " + result);
  }
}

public class Main{
  public static double sumOfExpression(int n){
    return sumOfExpressionHelper(n, 1, true);
  }
  private static double sumOfExpressionHelper(int n, int currentOdd, boolean addOdd){
    if(n == 0){
      return 0;
    }
    if(addOdd){
      return currentOdd + sumOfExpressionHelper(n-1, currentOdd + 2, false);
    }
    else{
      return -Math.sqrt(currentOdd) + sumOfExpressionHelper(n - 1, currentOdd + 2, true);
    }
  }
  public static void main(String [] args){
    int n = 6;
    double result = sumOfExpression(n);
    System.out.println("Sum of first " + n " term is " + result);
  }
}

public class Main{
  public static int sumMultiples(int n1, int n2){
    return sumMultiplesHelper(n1, n2, n1);
  }
  private static int sumMultiplesHelper( int n1, int n2, int currentMultiple){
    if*currentMultiple >= n2){
      return 0;
    }
    return currentMultiple + sumMultiplesHelper(n1, n2, currentMultiple + n1);
  }

  public static void main(String [] args){
    int n1=3;
    int n2 = 10;
    int result = sumMultiples(n1, n2);
    int result = sumMultiples(n1, n2);
    System.out.println("Sum of multiples of " + n1 + " smaller than " + n2 + " is " + result);
  }
}
  
