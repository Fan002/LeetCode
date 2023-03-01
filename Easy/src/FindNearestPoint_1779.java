/**
 * 给你两个整数x和y，表示你在一个笛卡尔坐标系下的(x, y)处。同时，在同一个坐标系下给你一个数组points，其中points[i] = [ai, bi]表示在(ai, bi)处有一个点。当一个点与你所在的位置有相同的 x 坐标或者相同的 y 坐标时，我们称这个点是 有效的 。
 * 请返回距离你当前位置曼哈顿距离最近的有效点的下标（下标从 0 开始）。如果有多个最近的有效点，请返回下标最小的一个。如果没有有效点，请返回-1。
 * 两个点(x1, y1)和 (x2, y2)之间的 曼哈顿距离为abs(x1 - x2) + abs(y1 - y2)。
 */
public class FindNearestPoint_1779 {
    public static void main(String[] args) {
        int [][] points = {{1,2},{3,1},{2,4},{2,3},{4,4}};
        System.out.println(nearestValidPoint(3,4,points));
    }

    public static int nearestValidPoint(int x, int y, int[][] points) {
        int minDist = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < points.length; i++) {
            int[] point = points[i];
            int pointX = point[0];
            int pointY = point[1];

            if (pointX == x || pointY == y) {
                int dist = Math.abs(pointX - x) + Math.abs(pointY - y);
                if (dist < minDist) {
                    minDist = dist;
                    index = i;
                }
            }
        }
        return index;
    }

}
