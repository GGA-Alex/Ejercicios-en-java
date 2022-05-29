package exercises;

public class Exercises1 {
    // Exercise 1:
    // Write a java program tha calculates the factorial of 10

    public int factorial()
    {
        int result = 1;
        for (int i = 1 ; i <=10 ; i++)
        {
            result *= i;
        }
        return result;
    }

    // Exercise 2:
    // Write a java program tha compares 2 numbers

    public String equalNumbers(int a, int b)
    {
        if(a > b) {
            return a + " is greater than " + b;
        } else if (b > a){
            return b + " is greater than " + a;
        } else{
            return a + " and " + b + " are equals";
        }
    }

    // Exercise 3:
    // Write a java program tha compute the sum of digits of a number

    public int sumOfDigits(int number)
    {
        // 456 = 400 + 50 + 6 = 4 + 5 + 6

        int sum = 0;

        while (number != 0)
        {
            sum = sum + number % 10;
            // sum = 0 + 6 = 6
            // sum = 6 + 5 = 11
            // sum = 11 + 4 = 15 <- Result


            number = number / 10;
            // number = 45
            // number = 4
            // number = 0
        }

        return sum;
    }

    // Exercise 4:
    // Write a java program that convert a string to integer and vice versa

    public int stringToInt(String number) {
        return Integer.parseInt(number);
    }

    public String intToString(int number) {
        return String.valueOf(number);
    }

    // Exercise 5:
    // Write a java program to display prime numbers from 1 to n

    public String primeNumbers(int number) {
        String result = "";
        for (int i = 1; i < number; i++) {
            int count = 0;
            for (int j = i ; j >= 1; j--) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                result = result + i + " ";
            }
        }
        return result;
    }
}
