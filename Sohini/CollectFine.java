import java.util.Scanner;

public class CollectFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int date = sc.nextInt();
        int fine = sc.nextInt();
        if (checkEven(date)) {
            System.out.println(countOdd(arr) * fine);
        } else {
            System.out.println(countEven(arr) * fine);
        }
        sc.close();

    }

    private static int countEven(int[] arr) {
        int countEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            }
        }
        return countEven;
    }

    private static int countOdd(int[] arr) {
        int countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                countOdd++;
            }
        }
        return countOdd;
    }

    private static boolean checkEven(int date) {
        if (date % 2 == 0)
            return true;
        else
            return false;
    }
}
