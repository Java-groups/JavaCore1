package HW12.practical_tasks.task1;

import java.time.LocalDate;

public class Task1 {
	
    /**
     *  Show which today is a day of a week
     */
	
    public static void main(String[] args) {
        System.out.println(LocalDate.now().getDayOfWeek());
    }
}
