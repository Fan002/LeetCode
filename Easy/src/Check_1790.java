public class Check_1790 {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abdc";
        System.out.println(areAlmostEqual(s1,s2));
    }
    public static boolean areAlmostEqual(String s1, String s2) {
        int diffCount = 0;
        int i1 = -1, i2 = -1;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffCount++;
                if (diffCount == 1) {
                    i1 = i;
                } else if (diffCount == 2) {
                    i2 = i;
                } else {
                    return false;
                }
            }
        }
        if (diffCount == 0) {
            return true;
        } else if (diffCount == 2) {
            char c1 = s1.charAt(i1), c2 = s1.charAt(i2);
            if (c1 == s2.charAt(i2) && c2 == s2.charAt(i1)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}

/**
 * 给你长度相等的两个字符串 s1 和 s2 。一次字符串交换 操作的步骤如下：选出某个字符串中的两个下标（不必不同），并交换这两个下标所对应的字符。
 * 如果对 其中一个字符串 执行 最多一次字符串交换 就可以使两个字符串相等，返回 true ；否则，返回 false 。
 */