class Solution {
    public long maxKelements(int[] nums, int k) {
        long score=0;
        PriorityQueue<Integer> pq=new PriorityQueue(Collections.reverseOrder());
        for(int e:nums) pq.add(e);
        while(k-->0){
            score+=pq.peek();
            int e=pq.poll();
            pq.add((int)Math.ceil((double)e/3));
        }
        return score;

        
    }
}
