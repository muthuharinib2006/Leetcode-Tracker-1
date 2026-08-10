// Last updated: 8/10/2026, 6:27:09 PM
import java.util.ArrayList;
import java.util.List;

class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        int n=parent.length;

        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=1;i<n;i++){
            adj.get(parent[i]).add(i);
        }
        int[] depths=new int[n];
        int maxDepth=findDepths(0,1,adj,depths);

        long totalSum=0;
        for(int i=0;i<n;i++){
            long weight=(long)nums[i]*(maxDepth-depths[i]+1);
            totalSum+=weight;
        }
        return totalSum;
    }
    private int findDepths(int node,int currentDepth,List<List<Integer>>adj,int[] depths){
        depths[node]=currentDepth;
        int maxdepth=currentDepth;

        for(int neighbor:adj.get(node)){
            maxdepth=Math.max(maxdepth,findDepths(neighbor,currentDepth+1,adj,depths));
        }
        return maxdepth;
    }
}