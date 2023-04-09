import java.util.*;
public class kLargestElements {

	public static void main(String[] args) {
		// k largest elements
		int arr[]= {7,10,4,3,20,15};
		int k=3;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int e:arr) {
			pq.offer(e);
			if(pq.size()>k) pq.poll();
		}
		while(k-->0) System.out.println(pq.poll());

	}

}
