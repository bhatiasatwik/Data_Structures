package priorityQueue;

public class PQ_use {
	public static void main(String[] args) {
		PQ<Integer> p= new PQ<Integer>();
		p.insert(3,3);
		p.insert(4, 4);
		p.insert(63	, 63);
		p.insert(21, 21);
		p.insert(9, 9);
		System.out.println(p.getMin());
		System.out.println(p.removeMin());
		p.insert(7, 7);
		System.out.println(p.getMin());
		System.out.println(p.removeMin());
		System.out.println(p.getMin());

	}

}
