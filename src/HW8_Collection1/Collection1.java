package HW8_Collection1;

import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class Collection1 {

    public void fillList(LinkedList<Integer> list) {
        for (int i = 0; i < 10; i++) {
            int znak = Math.random() < 0.5 ? 1 : -1;
            list.add((int) ((Math.random() * 30 + 1) * znak));
        }
    }

    public void minMaxChaing(LinkedList<Integer> list) {
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < list.get(minIndex)) {
                minIndex = i;
            } else if (list.get(i) > list.get(maxIndex)) {
                maxIndex = i;
            }
        }
//        int tmp = list.get(minIndex);
//        list.set(minIndex, list.get(maxIndex));
//        list.set(maxIndex, tmp);
        Collections.swap(list,minIndex,maxIndex);
    }
    public void insertNumber(LinkedList<Integer> list) {
        int negativeIndex = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                negativeIndex = i;
                break;
            }
        }
        if (negativeIndex == -1) {
            System.out.println("No negative element");
        } else {
            list.add(negativeIndex, (int) (Math.random() * 400));
        }
    }

    public void differentSigns(LinkedList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i - 1) < 0 && list.get(i) > 0 || list.get(i - 1) > 0 && list.get(i) < 0 ) {
                list.add(i,0);
            }
        }
    }

    public void copyList(LinkedList<Integer> list) {
        int k = 5;
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i < k) {
                list1.add(list.get(i));
            } else {
                list2.add(list.get(i));
            }
        }
        System.out.println("list 1  " + list1);
        Collections.reverse(list2);
        System.out.println("list 2  " + list2);
    }

    public void evenElement(LinkedList<Integer> list) {
        int eventIndex = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                eventIndex = i;
            }
        }
        if (eventIndex == -1) {
            System.out.println("There is no  even element");
        } else {
            list.remove(eventIndex);
        }
    }

    public void minList(LinkedList<Integer> list) {
        int indexMin = list.indexOf(Collections.min(list));
        if (indexMin < list.size() - 1) {
            list.remove(indexMin + 1);
        }

    }

}
