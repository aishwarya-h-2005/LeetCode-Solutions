import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        // Store nums1 elements in HashSet
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        // Find common elements
        for (int j = 0; j < nums2.length; j++) {
            if (set.contains(nums2[j])) {
                result.add(nums2[j]);
            }
        }

        // Convert HashSet to int array
        int[] answer = new int[result.size()];
        int index = 0;

        for (int x : result) {
            answer[index] = x;
            index++;
        }

        return answer;
    }
}
