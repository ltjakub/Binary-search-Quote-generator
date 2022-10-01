package pl.envelo.NumberSearch;

public class NumberSearch {
    private boolean search(int[] numbers, int x) {

        int lowestNumber = numbers.length;
        int middleNumber;
        int highestNumber = 0;

        while (lowestNumber >= highestNumber) {
            middleNumber = (lowestNumber + highestNumber) / 2;

            if(x == numbers[middleNumber]) {
                return true;
            }

             if(x > numbers[middleNumber]) {
                 lowestNumber = middleNumber - 1;

            } else if (x < numbers[middleNumber]) {
                 highestNumber = middleNumber + 1;
            }

        }
        return false;
    }
}
