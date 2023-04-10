import java.util.*;
public class frequencySort {

	public static void main(String[] args) {
		int arr[]= {1,1,1,3,2,2,4,5,5,5,5,5,5};
		HashMap<Integer,Integer> hm= new HashMap<>();
		for(int e:arr) hm.put(e,hm.getOrDefault(e,0)+1);
	
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(hm.get(b)-hm.get(a)));
		pq.addAll(hm.keySet());
		int ans[]= new int[arr.length];
		int idx=0;
		while(!pq.isEmpty()) {
			int ele = pq.poll();
			int x = hm.get(ele);
			while(x-->0) ans[idx++] = ele;
		}
		for(int e:ans) System.out.print(e+" ");

	}

}
