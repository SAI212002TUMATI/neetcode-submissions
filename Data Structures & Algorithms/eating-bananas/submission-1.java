class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left=1;  //both left,right are intially eating speeds                
        int right=0; 

        //find the largest pile
        for(int pile:piles){
            right=Math.max(right,pile);
        }
        int answer=right;   //assume the largest value of right is the intial speed

        while(left<=right){   //find min eating speed
            int mid =left+(right-left)/2;   // mid is banana koko eat per hour
            int hours=0;

            for(int pile:piles){
                hours+=(pile+mid-1)/mid;    //cal hours total hours needed at speed mid
            }
            if(hours<=h){
                answer=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        
        
        }
        return answer;
        
        
    }
}
