import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var bus1 = new Bus();
        var bus2 = new Bus();

        bus1.AddPassengers(2);
        bus1.ChangeGas(-50);
        bus1.ChangeState(Transport.State.parking);
        bus1.ChangeGas(10);
        bus1.ChangeState(Transport.State.running);
        bus1.AddPassengers(45);
        bus1.AddPassengers(5);
        bus1.ChangeGas(-55);

        System.out.println("----------------------------------");

        var taxi = new Taxi();
        var taxi2 = new Taxi();

        taxi.AddPassengers(2, "서울역", 2);
        taxi.ChangeGas(-80);
        taxi.AddPassengers(5);
        taxi.AddPassengers(3, "구로디지털단지역", 12);
        taxi.ChangeGas(-20);
    }
}
