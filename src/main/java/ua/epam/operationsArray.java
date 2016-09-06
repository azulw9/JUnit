package ua.epam;

/**
 * Created by supervisor on 06.09.2016.
 */
public class operationsArray {

    public static int[] invertArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;

    }

    public static void printArray(int[] arr) {
        System.out.println();
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] createArray(int n) {
        int[] arr;
        arr = new int[n];

        for (int i=0; i<arr.length; i++)
        {
            arr[i] = (int)(Math.random()*100+1);
        }
        return arr;
    }
}

