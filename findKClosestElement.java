class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((Integer t , Integer o) ->{
            if(Math.abs(t - x) == Math.abs(o-x)){
                return o-t;
            }
            return (Math.abs(o-x) - Math.abs(t-x));
        });
        for(int e:arr){
            pq.offer(e);
            if(pq.size()>k) pq.poll();
        }
        while(k-->0) ans.add(pq.poll());
        Collections.sort(ans);
        return ans;
        
    }
}
