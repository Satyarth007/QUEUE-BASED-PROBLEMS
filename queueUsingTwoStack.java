import java.util.*;
public class queueUsingTwoStack {
	static Stack<Integer> s1=new Stack<>();
	static Stack<Integer> s2=new Stack<>();
	
	static void enQueue(int x) {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s1.push(x);
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	static int deQueue() {
		if(s1.isEmpty()) {
			System.out.println("Q IS EMPTY");
			System.exit(0);
		}
		int x=s1.peek();
		s1.pop();
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queueUsingTwoStack q=new queueUsingTwoStack();
		q.enQueue(5);
		q.enQueue(6);
		q.enQueue(7);
		
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());

	}

}
