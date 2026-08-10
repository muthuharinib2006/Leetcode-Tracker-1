// Last updated: 8/10/2026, 6:27:19 PM
import java.util.Arrays;
class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
        int n=tasks.length;
        int m=shifts.length;
        int[] result=new int[m];

        long[] pref=new long[n+1];
        for(int i=0;i<n;i++){
            pref[i+1]=pref[i]+tasks[i];
        }
        boolean allCompletedBefore=true;
        int currIdx=0;
        long currRemTime=0;
        for(int i=0;i<m;i++){
            long shiftTime=shifts[i];
            if(allCompletedBefore){
                currIdx=0;
                currRemTime=tasks[0];
            }
            if(shiftTime<currRemTime){
                currRemTime-=shiftTime;
                result[i]=n-currIdx;
                allCompletedBefore=false;
            }
            else{
                shiftTime-=currRemTime;
                long targetPref=pref[currIdx+1]+shiftTime;

                int insertPos=Arrays.binarySearch(pref,targetPref);
                if(insertPos<0){
                    insertPos=-insertPos-2;
                }

                int completedUpto=insertPos-1;
                if(completedUpto>=n-1){
                    result[i]=0;
                    allCompletedBefore=true;
                }
                else{
                    currIdx=completedUpto+1;
                    long timeSpentOnNext=targetPref-pref[currIdx];
                    currRemTime=tasks[currIdx]-timeSpentOnNext;
                    result[i]=n-currIdx;
                    allCompletedBefore=false;
                }
            }
        }
        return result;
    }
}