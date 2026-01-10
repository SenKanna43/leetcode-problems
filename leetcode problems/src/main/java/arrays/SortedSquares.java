package arrays;

public class SortedSquares
{
    public int[] sortedSquares(int[] numbers){
        int left = 0;
        int right = numbers.length - 1;
        int index = numbers.length - 1;
        int[] result = new int[numbers.length];
        while(left <= right){
            int leftSquare = numbers[left] * numbers[left];
            int rightSquare = numbers[right] * numbers[right];
            if (leftSquare > rightSquare){
                result[index] = leftSquare;
                left++;
            }
            else {
                result[index] = rightSquare;
                right--;
            }
            index--;
        }
        return result;
    }
}
