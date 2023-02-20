import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * Return the maximum amount of water a container can store.
 * Notice that you may not slant the container.
 */
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea1(height));
        System.out.println(maxArea2(height));

    }

    public static int maxArea1(int[] height) {
        int l = 0, r = height.length - 1;
        int maxArea = 0;
        while (l < r) {
            int area = (r - l) * Math.min(height[l], height[r]);
            int minH = Math.min(height[l], height[r]);
            maxArea = Math.max(maxArea, area);
            // 快速跳过这步可太妙了
            while (height[l] <= minH && l < r) {
                l++;
            }
            while (height[r] <= minH && l < r) {
                r--;
            }
        }
        return maxArea;
    }

    public static int maxArea2(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }
}
