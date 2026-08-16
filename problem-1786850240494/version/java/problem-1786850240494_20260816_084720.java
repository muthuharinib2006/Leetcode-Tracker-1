// Last updated: 8/16/2026, 8:47:20 AM
1class Solution {
2    public int nearestDrone(int[][] drones, int[] target) {
3        int minD=Integer.MAX_VALUE;
4        int bestIndex=-1;
5        int tx=target[0];
6        int ty=target[1];
7
8        for(int i=0;i<drones.length;i++){
9            int dx=drones[i][0];
10            int dy=drones[i][1];
11            int range=drones[i][2];
12
13            int d=Math.abs(dx-tx)+Math.abs(dy-ty);
14            if(d<=range){
15                if(d<minD){
16                    minD=d;
17                    bestIndex=i;
18                }
19            }
20        }
21        return bestIndex;
22    }
23}