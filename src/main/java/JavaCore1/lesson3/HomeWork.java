package JavaCore1.lesson3;


public class HomeWork {
    public static void main(String[] args) {

//        switchArrayNumbers();
//        emptyArray();
//        multiplicationArray();
//        fillingArray();
//        createArray(5,10);
//        checkingArrayNumbers();
        int[] arr = {1,1,1,2,1,2};
        int sum = 0;
        boolean check;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum %2 == 0) {
            check = true;
        } else {
            check = false;
        }
        System.out.println(check);
    }

    private static void checkingArrayNumbers() {
        int[] arr = {1, 4, 1, 4, 6, 9, 15, 87, 123, 5, 7};
        MyUtil.printArray(arr);
        MyUtil.checkMinNumber(arr);
        MyUtil.checkMaxNumber(arr);
    }


    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        MyUtil.printArray(arr);
        return arr;
    }


    public static void fillingArray() {
        int[][] arr = new int[3][3];
        MyUtil.printArray(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i][j] = 1;
                }
            }
        }
        MyUtil.printArray(arr);
    }


    public static void multiplicationArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        MyUtil.printArray(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        MyUtil.printArray(arr);
    }


    public static void switchArrayNumbers() {
        int[] arr = {
                1, 1, 0, 1, 0, 0, 1, 0, 1
        };
        MyUtil.printArray(arr);
        MyUtil.switchArray(arr);
        MyUtil.printArray(arr);
    }


    public static void emptyArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        MyUtil.printArray(arr);
    }

}
