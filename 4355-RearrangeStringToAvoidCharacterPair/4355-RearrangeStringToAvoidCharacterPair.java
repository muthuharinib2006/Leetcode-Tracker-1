// Last updated: 8/10/2026, 6:27:08 PM
class Solution {
    public String rearrangeString(String s, char x, char y) {
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)(i+'a');
            if(ch!=x && ch!=y){
                while(freq[i]--> 0){
                    ans.append(ch);
                }
            }
        }
        while(freq[y-'a']-->0){
            ans.append(y);
        }
        while(freq[x-'a']--> 0){
            ans.append(x);
        }
        return ans.toString();
    }
}