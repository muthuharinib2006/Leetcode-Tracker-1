// Last updated: 8/10/2026, 6:26:57 PM
class Solution {
    public boolean canReach(int[] start, int[] target) {
        int startColor=(start[0] +start[1]) %2;
        int targetColor=(target[0]+target[1])%2;
        return startColor==targetColor;
    }
}