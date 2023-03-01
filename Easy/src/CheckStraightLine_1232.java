import java.util.Arrays;

/**
 * 给定一个数组coordinates，其中coordinates[i] = [x, y]，[x, y]表示横坐标为 x、纵坐标为 y的点。请你来判断，这些点是否在该坐标系中属于同一条直线上。
 */

public class CheckStraightLine_1232 {
    public static void main(String[] args) {
        int[][] coordinates = {{0, 0}, {0, 1}, {0, -1}};
        System.out.println(checkStraightLine(coordinates));

    }

    public static boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        if (n == 2) { // 只有两个点一定在同一条直线上
            return true;
        }
        int dx = coordinates[1][0] - coordinates[0][0];
        int dy = coordinates[1][1] - coordinates[0][1];
        for (int i = 2; i < n; i++) {
            int dx1 = coordinates[i][0] - coordinates[i - 1][0];
            int dy1 = coordinates[i][1] - coordinates[i - 1][1];
            if (dx1 * dy != dx * dy1) { // 判断斜率是否相等
                return false;
            }
        }
        return true;
    }
}
/**
 * 可以通过计算每个点与前一个点的斜率是否相等来判断它们是否在同一条直线上。具体地，如果点 $(x_1, y_1)$ 和点 $(x_2, y_2)$ 在同一条直线上，
 * 那么它们的斜率相等，即 $(y_2 - y_1) / (x_2 - x_1)$ 相等。
 * 需要注意的是，如果两个点在同一条竖直线上，即它们的横坐标相同，那么它们的斜率不存在，需要特殊处理。
 */
