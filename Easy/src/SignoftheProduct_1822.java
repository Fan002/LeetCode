public class SignoftheProduct_1822 {
    public static void main(String[] args) {
        int [] nums = {9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
        System.out.println(arraySign(nums));

    }
    public static int arraySign(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length;i++){
           if (nums[i] < 0){
               count++;
           }
           if (nums[i] == 0){
               return 0;
           }
        }
        if (count % 2 == 0){
            return 1;
        }else {
            return -1;
        }
    }
}
