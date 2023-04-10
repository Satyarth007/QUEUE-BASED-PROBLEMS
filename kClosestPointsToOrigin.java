import java.util.*;
public class kClosestPointsToOrigin {

	public static void main(String[] args) {
		int arr[][]= {{1,3},{-2,2},{5,8},{0,1}};
		int k=2;
		HashMap<List<Integer>,Integer> hm= new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int dis = (int)(Math.pow(arr[i][0], 2)+Math.pow(arr[i][1], 2));
			List<Integer> temp = new ArrayList<>();
			temp.add(arr[i][0]);
			temp.add(arr[i][1]);
			hm.put(temp, dis);
		}
		PriorityQueue<List<Integer>> pq= new PriorityQueue<>((a,b)->(hm.get(b)-hm.get(a)));
		for(List<Integer> e:hm.keySet()) {
			pq.offer(e);
			if(pq.size()>k) pq.poll();
		}
		
		while(k-->0) System.out.println(pq.poll());
		

	}

}
