import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(solution.majorityElement(a, size));
        sc.close();
    }

}

class Solution {
    int majorityElement(int a[], int size) {
        // your code here
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < size; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }

        for (int i = 0; i < size; i++) {
            if (map.get(a[i]) > size / 2) {
                return a[i];
            }
        }

        return -1;
    }
}
