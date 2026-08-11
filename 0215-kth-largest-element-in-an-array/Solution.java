class Solution {
    public int findKthLargest(int[] nums, int k) {
        int target = nums.length - k;
        return quickSelect(nums, 0, nums.length - 1, target);
    }

    public int quickSelect(int[] nums, int begin, int end, int target) {
        int pivot = nums[end];
        int i = begin - 1;

        for (int j = begin; j < end; j++) {
            if (nums[j] < pivot) {
                i++;
                swap(nums, i, j);
            }
        }

        swap(nums, i + 1, end);

        int pivotIndex = i + 1;

        if (pivotIndex == target) {
            return nums[pivotIndex];
        }

        if (pivotIndex < target) {
            return quickSelect(nums, pivotIndex + 1, end, target);
        }

        return quickSelect(nums, begin, pivotIndex - 1, target);
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
