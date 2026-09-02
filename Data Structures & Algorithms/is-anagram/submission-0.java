class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[]sai=new int[26];
        for(int i=0;i<s.length();i++) {
            sai[s.charAt(i)-'a']++;
            sai[t.charAt(i)-'a']--;
        }
        for(int num:sai){
            if(num!=0){
                return false;
            }
        }
        return true;

    }
}
