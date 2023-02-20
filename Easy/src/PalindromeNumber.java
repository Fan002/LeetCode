public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12521));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int digit = (int) (Math.log(x) / Math.log(10) + 1);//总位数
        int revert = 0;
        int pop = 0;
        //倒置右半部分
        for (int i = 0; i < digit / 2; i++) {
            pop = x % 10;
            revert = revert * 10 + pop;
            x /= 10;
        }
        if (digit % 2 == 0 && x == revert) {
            return true;
        }
        //奇数情况
        if (digit % 2 != 0 && x / 10 == revert) {
            return true;
        }
        return false;
    }
}
