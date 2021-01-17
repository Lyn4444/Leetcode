/**
 * @ProjectName leetcode_1720
 * @ClassName leetcode_1720
 * @Description TODO
 * @Author Lyn
 * @Date 2021/1/17 22:16
 * @Version 1.0
 * @Function
 */

public class leetcode_1720 {

    public static void main(String[] args) {
        int[] encoded = {6, 2, 7, 3};
        int first = 4;
        int[] arr = Solution.decode(encoded, first);
        for (int e:
             arr) {
            System.out.print(e + " ");
        }
    }
}


class Solution {
    /**
     * 解码 a ^ b = c , a ^ c = b
     *
     * @param encoded
     * @param first
     * @return {@link int[]}
     */
    public static int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        arr[0] = first;
        int i = 1;
        for (int e:
             encoded) {
            arr[i] = arr[i -1] ^ e;
            i++;
        }
        return arr;
    }
}