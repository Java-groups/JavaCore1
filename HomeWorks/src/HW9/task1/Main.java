package HW9.task1;

import java.util.Set;

public class Main {

	public static void main(String args[]) {
		UnionIntersect ui = new UnionIntersect();
		Set<Integer> set1 = ui.generateSet(5);
		Set<Integer> set2 = ui.generateSet(5);

		System.out.println("Set number one: " + set1);
		System.out.println("Set number two: " + set2);

//    Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2),
//	  realizing the operations of union and intersection of two sets. Test the operation of
//	  these techniques on two pre-filled sets. 
		System.out.println("\n============ UNION ============\n");
		ui.union(set1, set2);

		System.out.println("\n======== INTERSECTION =========\n");
		ui.intersect(set1, set2);

	}

}
