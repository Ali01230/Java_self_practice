package m32_arrays_part2;

public class SumOfOddNumbers {
    public static void main(String[] args) {

        int[] x = {2, 5, 7, 2, 3};
        int[] y = {3, 3, 2, 3, 2, 3};

        System.out.println(sumOfOddNumbers(x));
        System.out.println(sumOfOddNumbers(y));

    }

    public static int sumOfOddNumbers(int[] numbers){
        int sum = 0;

        for (int number : numbers){
            if (number % 2 != 0){
                sum += number;

            }

        }

        return sum;
    }
}
