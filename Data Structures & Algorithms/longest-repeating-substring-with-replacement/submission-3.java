class Solution {
    public int characterReplacement(String s, int k) {

        int left=0;
        int maxFrequency=0;
        int maxLength=0;
        int []freq=new int[26];

        for(int right=0; right<s.length(); right++){
            int index=s.charAt(right)-'A';
            freq[index]++;

            maxFrequency=Math.max(maxFrequency,freq[index]);
            int windowLength=right-left+1;
            int replacement=windowLength-maxFrequency;

            if(replacement>k){
                int leftIndex=s.charAt(left)-'A';
                freq[leftIndex]--;
                left++;
            }
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
        
    }
}
