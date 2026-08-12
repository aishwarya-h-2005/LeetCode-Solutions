class Solution {
    public int[] rearrangeArray(int[] nums) {

        int pos = 0;
        int neg = 1;
        int[] result = new int[nums.length];

        for (int j = 0; j < nums.length; j++) {

            if (nums[j] > 0) {
                result[pos] = nums[j];
                pos += 2;
            }
            else if (nums[j] < 0) {
                result[neg] = nums[j];
                neg += 2;
            }
        }

        return result;
    }
}
