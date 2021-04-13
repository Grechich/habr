package OOP_Basics;
import java.util.Random;

public class randomElementByWeight {

    public static void main (String[]args){
        int arr1[] = {1, 2, 3};
        int arr2[] = {10, 6, 1};

        getRandomElementByWeight elem = new getRandomElementByWeight(arr1, arr2);
        for (int i = 0; i<100; i++) {
            System.out.print(elem.getRandom());
        }
    }
}

class getRandomElementByWeight{
    private int arr1[];
    private int arr2[];
    private int arr3[];
    private int sumWeights = 0;
    final Random random = new Random();
    private int cursor = 0;

    getRandomElementByWeight(int[] arr1, int[] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;

        //founding length of extended array
        for (int i = 0; i<arr2.length; i++) {
            sumWeights += arr2[i];
        }

        //create an extended array
        arr3 = new int[sumWeights];
        for (int j = 0; j<arr2.length; j++){
            for (int i = 0; i<arr2[j]; i++) {
                arr3[cursor] = arr1[j];
                cursor++;
            }
        }
    }

    public int getRandom() {
            return arr3[random.nextInt(sumWeights)];
        }


    }

