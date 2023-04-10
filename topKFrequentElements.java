import java.util.*;
public class topKFrequentElements {

	public static void main(String[] args) {
		int arr[]= {1,1,1,3,2,2,5,4,4,4,4,4,4};
		int k=2;
		HashMap<Integer,Integer> hm= new HashMap<>();
		for(int e:arr) hm.put(e,hm.getOrDefault(e,0)+1);
		//System.out.println(hm);
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(hm.get(a)-hm.get(b)));
		for(Integer e:hm.keySet()) {
			pq.offer(e);
			if(pq.size()>2) pq.poll();
		}
		//System.out.println(pq);
		while(k-->0) System.out.println(pq.poll());
		

	}

}
