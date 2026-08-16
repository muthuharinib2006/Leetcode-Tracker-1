// Last updated: 8/16/2026, 8:50:24 AM
1class Solution {
2    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
3        int maxL=0;
4        for(int light:lights){
5            maxL=Math.max(maxL,light);
6            
7        }
8        int maxP=0;
9        for(int t:arrivalTime){
10            int r=t%period;
11            int cw=0;
12            if(r>=maxL){
13                cw=period-r;
14            }
15            maxP=Math.max(maxP,cw);
16        }
17        return maxP;
18    }
19}