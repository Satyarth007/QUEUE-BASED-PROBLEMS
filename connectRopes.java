import java.util.*;
public class connectRopes {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int sum=0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int e:arr) pq.add(e);
		while(pq.size()>=2) {
			int a = pq.poll();
			int b = pq.poll();
			sum+= a+b;
			pq.offer(a+b);
		}
		System.out.println(sum);
		

	}

}
