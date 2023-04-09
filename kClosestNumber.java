
import java.util.*;
public class kClosestNumber {

	public static void main(String[] args) {
		int arr[]= {5,6,7,8,9,10,11};
		int x = 9;
		int k = 3;
		HashMap<Integer,Integer> hm= new HashMap<>();
		for(int e:arr) hm.put(e,Math.abs(e-x));
		System.out.println(hm);
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(hm.get(b)-hm.get(a)));
		for(Integer e:hm.keySet()) {
			pq.offer(e);
			if(pq.size()>k) pq.poll();
		}
		while(k-->0) System.out.println(pq.poll());

	}

}
