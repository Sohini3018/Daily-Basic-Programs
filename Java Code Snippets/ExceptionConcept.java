public class ExceptionConcept {
    public static void main(String[] args) {
        int i = 4;
        int j = 0;
        int[] nums = {1 ,2, 3};
        
        try {
            int result = i / j;
            // only this /0 exception will be catched as this one is invoked first
            System.out.println(nums[5]); // in case result is perfect second this index oob will invoke
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Divide by 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally{
            System.out.println("In finally block");
        }
    }
}
