class Solution {
    public int numIdenticalPairs(int[] nums) {

        HashMap<Integer,Integer> map=new HashMap<>();

        int count=0;

        for(int num:nums){
            count+=map.getOrDefault(num,0);     //Num of Previous occurrences

            map.put(num,map.getOrDefault(num,0)+1);     //Increase the frequency of this num
        }
        return count;
        
    }
}