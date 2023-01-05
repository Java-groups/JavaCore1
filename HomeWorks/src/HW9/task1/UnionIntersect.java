package HW9.task1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class UnionIntersect {
	
    public Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
    	Set<Integer> union = new HashSet<>();
        union.addAll(set1);
        union.addAll(set2);
        System.out.println("Union of unique elements of both sets: " + union);
		return union;
    }

    public Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
    	Set<Integer> intersect = new HashSet<>(set1);
    	intersect.retainAll(set2);
        System.out.println("Intersected elements of both sets: " + intersect);

    	return intersect;
    }
    
    public Set<Integer> generateSet(int quantity) {
    	Set<Integer> generatedSet = new HashSet<>();

		Random random = new Random();
		int r;
		for (int i = 0; i <= quantity; i++) {
			r = random.nextInt(10);
			generatedSet.add(r);
			
		}
		return generatedSet;
    }
}
