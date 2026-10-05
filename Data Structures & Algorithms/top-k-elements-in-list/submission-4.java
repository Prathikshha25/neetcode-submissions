class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] freq=new int[20001];

        for(int i=0;i<nums.length;i++){
            freq[nums[i]+10000]++;
        }

        int[] ans=new int[k];

        for(int i=0;i<k;i++){
            int max=0;
            int in=0;

            for(int j=0;j<20001;j++){
                if(freq[j]>max){
                    max=freq[j];
                    in=j;
                }
            }

            ans[i]=in-10000;
            freq[in]=0;
        }

        return ans;
    }
}