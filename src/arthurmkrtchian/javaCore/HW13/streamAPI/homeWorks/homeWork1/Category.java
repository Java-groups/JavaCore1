package arthurmkrtchian.javaCore.HW13.streamAPI.homeWorks.homeWork1;

import java.util.Random;

public enum Category {
    PHONE, LAPTOP, BLASETER, TAB, GRINDER;


    private static final Random RNDCT = new Random();

    public static Category randomCategory()  {
        Category[] category= values();
        return category[RNDCT.nextInt(category.length)];
    }
}
