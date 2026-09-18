class Solution {
    public int maxProfit(int[] prices) {
        int minprice=prices[0],mp=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }
            int profit=prices[i]-minprice;
            if(profit>mp){
                mp=profit;
            }
        }return mp;
    }
}
