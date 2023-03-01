public class countOdds_1523 {
    public static void main(String[] args) {
        System.out.println(countOdds(8, 10));
        System.out.println(countOdds2(8, 10));
    }

    public static int countOdds(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }
    //优化
    public static int countOdds2(int low, int high) {
        return pre(high) - pre(low - 1);
    }

    public static int pre(int x) {
        return (x + 1) >> 1;
    }

}
