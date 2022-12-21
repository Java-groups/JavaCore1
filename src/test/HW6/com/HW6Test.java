package HW6.com;

import HW6.com.model.passangers.flyingVehicle.Helicopter;
import HW6.com.model.passangers.waterVehicle.Liner;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HW6Test {
    Liner liner = new Liner(5);




    @Test
    public void getPassangers(){
        assertTrue(liner.getPassangers() == 5);

    }

    @Test
    public void getFloors(){
        liner.setFloors(5);
        assertTrue(liner.getFloors() == 5);

    }

    @Test
    public void isSailing(){
        liner.setFloors(15);
        String isSailing = "I am not sailing I have " + liner.getFloors() + " floors" + " and can have "+ liner.getPassangers()+ " passangers";
        String testString = "I am not sailing I have 15 floors and can have 5 passangers";
        assertTrue(isSailing.equals(testString));
    }
}
