import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,
            (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        ArrayList<Integer> new_arr_list = new ArrayList<>();
        new_arr_list.add(intervals[0][0]);
        new_arr_list.add(intervals[0][1]);

        result.add(new_arr_list);

        for (int i = 1; i < intervals.length; i++) {

            ArrayList<Integer> last =
                result.get(result.size() - 1);

            if (intervals[i][0] <= last.get(1)) {

                last.set(1,
                    Math.max(intervals[i][1], last.get(1)));

            } else {

                ArrayList<Integer> temp = new ArrayList<>();

                temp.add(intervals[i][0]);
                temp.add(intervals[i][1]);

                result.add(temp);
            }
        }

        return result.stream()
                .map(list -> new int[]{list.get(0), list.get(1)})
                .toArray(int[][]::new);
    }
}
