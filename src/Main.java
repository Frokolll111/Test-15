import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> result = processArrayy(numbers);
        System.out.println(result);
    }

    public static List<Integer> processArrayy(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == 0) {
                inputArray[i]++;
            }
        }
        List<Integer> resultList = new ArrayList<>();
        for (int i = 2; i <7 && i<inputArray.length ; i++) {
            resultList.add(inputArray[i]);
        }
        return resultList;
   }
 }