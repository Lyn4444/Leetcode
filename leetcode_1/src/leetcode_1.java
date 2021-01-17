/**
 * @ProjectName leetcode_1
 * @ClassName leetcode_1
 * @Description TODO
 * @Author Lyn
 * @Date 2021/1/17 22:04
 * @Version 1.0
 * @Function
 */

public class leetcode_1 {

    public static void main(String[] args) {

    }

}

class Solution {
    /**
     *  两数之和
     *
     * @param nums
     * @param target
     * @return {@link int[]}
     */
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++ ) {
            for (int j = i + 1; j < nums.length; j++ ) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return null;
    }
}
