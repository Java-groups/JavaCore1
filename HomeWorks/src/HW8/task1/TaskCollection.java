package HW8.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TaskCollection implements Cloneable {
	private List<Integer> myCollection;

	public List<Integer> getRandomList(int quantity) {
		myCollection = new ArrayList<>();
		Random random = new Random();
		int r;
		for (int i = 0; i < quantity; i++) {
			r = random.nextInt(25 + 15) - 15;
			myCollection.add(r);
		}
		return myCollection;
	}

	public List<Integer> swapMinMax(List<Integer> collection) {
		int min[] = getMin(collection);
		int max[] = getMax(collection);
		collection.set(max[0], min[1]);
		collection.set(min[0], max[1]);
		return collection;
	}

	public List<Integer> insertToList(List<Integer> list, int amount) {
		List<Integer> listToBeInserted = new ArrayList<>();
		listToBeInserted = getRandomList(amount);
		System.out.println("Inserted list: " + listToBeInserted + "\n");

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < 0) {
				list.addAll(i, listToBeInserted);
				break;
			} else
				continue;
		}
		return list;
	}

	public List<Integer> insertZero(List<Integer> list) {
		List<Integer> newCollection = new ArrayList<>();
		newCollection.addAll(list);

		for (int i = 1; i < newCollection.size(); i++) {
			if (newCollection.get(i - 1) != newCollection.get(i) && newCollection.get(i - 1) != 0) {
				newCollection.add(i, 0);
			}
		}
		return newCollection;
	}

	public List<List<Integer>> divideList(List<Integer> list, int amount) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			if (i <= amount) {
				list1.add(list.get(i));
			} else
				list2.add(list.get(i));
		}
		System.out.println("First list: " + list1);
		System.out.println("Second list: " + list2);

		return List(list1, list2);
	}
	
	public List<Integer> removeLastEven(List<Integer> list) {
		int index = -1;
		for (int i = list.size()-1; i > 0; i--) {
			if (list.get(i) % 2 == 0) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("There is no even elements in list!");
		} else list.remove(index);
		
		return list;
	}
	
    public List<Integer> removeLastMin(List<Integer> list) {
        int index = list.indexOf(Collections.min(list));
        System.out.println("Minimum element: " + Collections.min(list));
        if (index < list.size() - 1) {
            list.remove(index + 1);
        }
        return list;

    }

	private List<List<Integer>> List(List<Integer> list1, List<Integer> list2) {
		List<List<Integer>> mergedList = new ArrayList<>();
		mergedList.add(list1);
		mergedList.add(list2);
		return mergedList;
	}

	private int[] getMax(List<Integer> collection) {
		int max = collection.get(0);
		int index = 0;
		int i = 0;
		while (i < collection.size()) {
			if (collection.get(i) > max) {
				max = collection.get(i);
				index = i;
			}
			i++;
		}
		return new int[] { index, max };
	}

	private int[] getMin(List<Integer> collection) {
		int min = collection.get(0);
		int index = 0;
		int i = 0;
		while (i < collection.size()) {
			if (collection.get(i) < min) {
				min = collection.get(i);
				index = i;
			}
			i++;
		}
		return new int[] { index, min };
	}

}
