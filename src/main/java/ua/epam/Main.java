package ua.epam;

public class Main {

    public static void main(String[] args) {
        operationsArray oper = new operationsArray();
        int size = 10;
        int[] arr = oper.createArray(size);
        oper.printArray(arr);
        int[] inv_arr = oper.invertArray(arr);
        oper.printArray(inv_arr);

    }
}

