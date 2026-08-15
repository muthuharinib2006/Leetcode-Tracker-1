// Last updated: 8/15/2026, 8:30:14 PM
1class Solution {
2    public int elevatorRequests(int n, int[] requests) {
3        int cF=0;
4        int tT=0;
5        for(int floor:requests){
6            tT+=Math.abs(floor-cF);
7            cF=floor;
8        }
9        return tT;
10    }
11}