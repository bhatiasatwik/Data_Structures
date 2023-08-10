package hashmaps;

public class MapUse {

	public static void main(String[] args) {
		/*Map<Integer,Integer> m = new Map<>();
		m.insert(100,1);
		System.out.println(m.size());
		m.insert(10101,3);
		System.out.println(m.size());
		m.insert(100,99);
		System.out.println(m.size());
		m.insert(100,73);
		System.out.println(m.size());
		m.insert(200, 99);
		System.out.println(m.size());*/
		
		Map<String,Integer> m = new Map<>();
		m.insert("def", 10);
		System.out.println(m.size());
//		System.out.println();
		m.insert("deff", 30);
		System.out.println(m.size());
//		System.out.println();
		m.insert("defg", 90);
		System.out.println(m.size());
//		System.out.println();
		m.insert("def", 100);
		System.out.println(m.size());
//		System.out.println();
//		m.insert("def", 111);
	}

}
