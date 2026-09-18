class Solution {
    public int maxProfit(int[] prices) {
        int minp=prices[0],mp=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minp){
                minp=prices[i];
            }
            int profit=prices[i]-minp;
            if(profit>mp){
                mp=profit;
            }
        }return mp;
    }
}
