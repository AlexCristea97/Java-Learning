import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,5,3,6,11,8,25};

        System.out.println("array = " + Arrays.toString(array));

        reverse(array);

        System.out.println("reversed array = " + Arrays.toString(array));

    }

    private static void reverse(int[] array){

        int maxIndex = array.length - 1;
        int halfLength = array.length/2;
        for(int i=0; i<halfLength; i++){
            int temp = array[i];
            array[i]=array[maxIndex -i];
            array[maxIndex-i] = temp;

        }
    }
}