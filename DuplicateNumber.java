import java.util.*;

public class DuplicateNumber {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,1,7,8,2,0,9,7};
        HashSet<Integer> set = new HashSet<>();
        System.out.println("The duplicate Elements in the array of Integers is:");
        for (int i : arr) {
            if (set.contains(i)) {
                System.out.print(i + " ");
            } else {
                set.add(i);
            }
        }
    }
}
