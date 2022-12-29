class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        int ans=0;
        for(int x:piles) p.add(x);
        while(k>0){
            int a=p.poll();
            a-=a/2;
            p.add(a);
            k--;
        }
        for(Integer x:p){
            ans+=x;
        }
        
        return ans;
    }
}
