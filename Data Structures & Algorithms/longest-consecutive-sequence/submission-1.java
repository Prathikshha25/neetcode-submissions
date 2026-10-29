class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> s= new HashSet<>();
        for(int num:nums){
            s.add(num);
        }
        int l=0;
        for(int num:s){
            if(!s.contains(num-1)){
                int count=1;
                int curr=num;
                while(s.contains(curr+1)){
                    curr++;
                    count++;
                }
                l=Math.max(l,count);
            }
        }return l;
    }
}
