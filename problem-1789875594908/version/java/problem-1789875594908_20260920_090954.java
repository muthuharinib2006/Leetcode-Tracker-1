// Last updated: 9/20/2026, 9:09:54 AM
1import java.util.Arrays;
2
3class Solution {
4    public long countIntersectingIntervals(int[][] intervals) {
5        int n = intervals.length;
6        if (n < 2) return 0;
7        
8        // Extract and sort all start times
9        int[] starts = new int[n];
10        for (int i = 0; i < n; i++) {
11            starts[i] = intervals[i][0];
12        }
13        Arrays.sort(starts);
14        
15        long nonIntersectingPairs = 0;
16        
17        // Count how many intervals start strictly after each interval's end time
18        for (int[] interval : intervals) {
19            int end = interval[1];
20            int count = countGreater(starts, end);
21            nonIntersectingPairs += count;
22        }
23        
24        // Total pairs can be up to ~5 * 10^9, requiring long calculations
25        long totalPairs = (long) n * (n - 1) / 2;
26        
27        return totalPairs - nonIntersectingPairs;
28    }
29    
30    // Binary search to find the number of elements strictly greater than 'target'
31    private int countGreater(int[] arr, int target) {
32        int low = 0;
33        int high = arr.length;
34        
35        while (low < high) {
36            int mid = low + (high - low) / 2;
37            if (arr[mid] <= target) {
38                low = mid + 1;
39            } else {
40                high = mid;
41            }
42        }
43        return arr.length - low;
44    }
45}