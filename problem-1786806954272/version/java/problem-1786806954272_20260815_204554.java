// Last updated: 8/15/2026, 8:45:54 PM
1class Solution {
2    public int minOperations(String s) {
3        int n=s.length();
4        int minOps=Integer.MAX_VALUE;
5        for(int r=0;r<n;r++){
6            int currentOps=r;
7            for(int i=0;i<n/2;i++){
8                char c1=s.charAt((i+r)%n);
9                char c2= s.charAt((n-1-i+r)%n);
10                int d1=(c1-c2+26)%26;
11                int d2=(c2-c1+26)%26;
12                currentOps+=Math.min(d1,d2);
13                
14                
15            }
16            minOps=Math.min(minOps,currentOps);
17        }
18        return minOps;
19    }
20}