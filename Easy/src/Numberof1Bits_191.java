/**
 * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
 */
public class Numberof1Bits_191 {
    public static void main(String[] args) {
        int n = 0B00000000000000000000000000001011;
        System.out.println(hammingWeight(n));

    }
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0){
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }
}
