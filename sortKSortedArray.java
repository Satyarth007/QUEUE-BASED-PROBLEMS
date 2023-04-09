package heap;
import java.util.*;
public class sortKSortedArray {

	public static void main(String[] args) {
		// the array depends on k
		int arr[]= {6,5,3,2,8,10,9};
		int k=3;
		int idx=0;
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int e:arr) {
			pq.offer(e);
			if(pq.size()>k) arr[idx++]=pq.poll();
		}
		
		while(k-->0) arr[idx++]=pq.poll();
		
		for(int e:arr) System.out.print(e+" ");   //TC:- O(nlogk)

	}

}
