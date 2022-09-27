import java.util.Arrays;

public class MainProgram {
    public static void main(String[] args) {
        int[] array = {30, 2, 4, 99, 3, 1};
        System.out.println(MainProgram.smallest(array));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
        
        System.out.println(MainProgram.indexOfSmallestFrom(array, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(array, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(array, 2));
        
        
        System.out.println(Arrays.toString(array));
        MainProgram.swap(array, 1, 0);
        System.out.println(Arrays.toString(array));

        MainProgram.swap(array, 0, 3);
        System.out.println(Arrays.toString(array));
        
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers));
        MainProgram.sort(numbers);
     
    }
    
    // finding the smallest value of an array
    public static int smallest(int[] array) {
        int smallest = 100000;
        for(int i = 0; i < array.length; ++i) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    // finding the index of the smallest value of an array
    public static int indexOfSmallest(int[] array) {     
        int index = 0;
        for(int i = 0; i < array.length; ++i) {
            if(array[i] == smallest(array)) {
                break;
            }
            ++index;
        }
        return index;
    }
    
    // finding the index in a given range of the smallest value of an array
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = 10000;
        int index = startIndex;
        for(int i = startIndex; i <= array.length-1; ++i) {
            if(array[i] < smallest) {
                smallest = array[i];
            }
        }
        for(int i = startIndex; i <= array.length; ++i) {
            if(array[i] == smallest) {
                break;
            }
            ++index;
        }
        return index;
    }
    
    // swapping the numbers of given indicies in an array
    public static void swap(int[] array, int index1, int index2) {
        for(int i = 0; i < array.length; ++i) {
            if(i == index1) {
                int savedValue = array[index1];
                array[index1] = array[index2];
                array[index2] = savedValue;
            }
        }
    }
    
    // sort an array using "selection sort"
    
    public static void sort(int[] array) {
        for(int i = 0; i < array.length; ++i) {
            int smallest = indexOfSmallestFrom(array, i);
            if(array[smallest] < array[i]) {
                swap(array, smallest, i);
                System.out.println(Arrays.toString(array));
            }
        }
    }
}
