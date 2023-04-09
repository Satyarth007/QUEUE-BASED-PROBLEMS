import java.util.*;
public class kThLargestElement {

	public static void main(String[] args) {
		int arr[]= {7,10,4,3,20,15};
		int k=3;
		PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
		for(int e:arr) {
			pq.offer(e);
			if(pq.size()>k) pq.poll();
		}
	    System.out.println(pq.peek());

	}

}
