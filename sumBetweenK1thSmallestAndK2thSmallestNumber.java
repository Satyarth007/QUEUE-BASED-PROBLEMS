import java.util.*;
public class sumBetweenK1thSmallestAndK2thSmallestNumber {

	public static void main(String[] args) {
		int arr[]= {1,3,12,5,15,11};
		// sorted :- 1 3 5 11 12 15  then answer is :- 11 + 12 = 23
		int k1 = 3;
		int k2 = 6;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int e:arr) {
			pq.offer(e);
			if(pq.size()>k1) pq.poll();		
		}
		int a = pq.peek();
		System.out.println(a);
		pq.clear();
		
		for(int e:arr) {
			pq.offer(e);
			if(pq.size()>k2) pq.poll();		
		}
		int b = pq.peek();
		System.out.println(b);
		
		int ans = 0;
		for(int e:arr) if(e > a && e < b) ans+=e;
		
		System.out.println(ans);
		

	}

}
