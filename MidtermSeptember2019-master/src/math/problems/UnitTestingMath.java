package math.problems;

public class UnitTestingMath {

    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        int a = 5;

        Factorial factorial = new Factorial();
        Factorial.iterationFactorial(a);
        Factorial.recursionFactorial(a);

        System.out.println("the factorial of 5 is :" + Factorial.iterationFactorial(a));
        System.out.println("the factorial of 5 is :" + Factorial.recursionFactorial(a));

        Fibonacci fabonacci = new Fibonacci();
        FindLowestDifference findLowestDifference = new FindLowestDifference();
        FindMissingNumber findMissingNumber = new FindMissingNumber();
        LowestNumber lowestNumber =new LowestNumber();
        Pattern pattern = new Pattern();
        PrimeNumber primeNumber = new PrimeNumber();

    }

    }
