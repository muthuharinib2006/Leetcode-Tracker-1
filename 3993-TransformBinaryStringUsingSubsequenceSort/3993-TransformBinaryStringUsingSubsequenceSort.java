// Last updated: 8/10/2026, 6:27:22 PM
class Solution {
    public boolean[] transformStr(String s, String[] strs) {
        int n=s.length();
        int[] sPrefix=new int[n];
        int targetZeros=0;

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                targetZeros++;
            }
                sPrefix[i]=targetZeros;
            }
        boolean[] ans=new boolean[strs.length];

        for(int i=0;i<strs.length;i++){
            String str=strs[i];
            int fZ=0;
            int wc=0;
            for(int j=0;j<n;j++){
                char c=str.charAt(j);
                if(c=='0')
                    fZ++;
                else if(c=='?')
                    wc++;
            }
            if(fZ>targetZeros || fZ+wc<targetZeros){
                ans[i]=false;
                continue;
            }
            int nZ=targetZeros-fZ;
            int zP=0;
            int tZ=0;
            boolean possible=true;

            for(int j=0;j<n;j++){
                char c=str.charAt(j);
                if(c=='0'){
                    tZ++;
                    
                }
                else if(c=='?'){
                    if(zP<nZ){
                        tZ++;
                        zP++;
                    }
                }
                if(tZ<sPrefix[j]){
                    possible=false;
                    break;
                }
            }
            ans[i]=possible;
        }
        return ans;
        }
    }