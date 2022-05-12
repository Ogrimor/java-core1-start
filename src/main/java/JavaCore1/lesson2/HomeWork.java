package JavaCore1.lesson2;

public class HomeWork {

    private static String s;

    public static void main(String[] args) {
        System.out.println(checkSum(4,15));
        checkNumber(0);
        System.out.println(checkNumberBool(5));
        printWord("people", 1);
        System.out.println(checkYear(545));

    }

    public static boolean checkYear(int year) {
        if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printWord (String s, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }
    }

    public static boolean checkNumberBool (int a) {
          if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkSum (int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkNumber (int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
}
