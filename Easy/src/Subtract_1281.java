/**
 * 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 */
public class Subtract_1281 {
    public static void main(String[] args) {
        int n = 4421;
        System.out.println(subtractProductAndSum(n));

    }

    public static int subtractProductAndSum(int n) {
        int sum = 0; //数字之和
        int pro = 1; //数字之积
        while (n != 0) {
            sum += n % 10;
            pro *= n % 10;
            n = n / 10;
        }
        return pro - sum;
    }
}
