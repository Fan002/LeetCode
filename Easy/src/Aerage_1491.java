import java.util.Arrays;

/**
 * 去掉最低工资和最高工资后的工资平均值
 */
public class Aerage_1491 {
    public static void main(String[] args) {
        int[] salary = {4000, 3000, 1000, 2000};
        System.out.println(average(salary));

    }

    public static double average(int[] salary) {
        Arrays.sort(salary);
        int ave = 0, sum = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
        }
        ave = sum / (salary.length - 2);
        return ave;
    }
}
