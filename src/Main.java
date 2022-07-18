public class Main {
    public static void main(String[] args) {
        var bus1 = new Bus();
        var bus2 = new Bus();

        bus1.AddPassengers(2);
        bus1.ConsumeGas(50);
        bus1.ChangeState(Transport.State.garage);
        bus1.RefuelGas(10);
        bus1.ChangeState(Transport.State.running);
        bus1.AddPassengers(45);
        bus1.AddPassengers(5);
        bus1.ConsumeGas(55);

        System.out.println("----------------------------------");

        var taxi = new Taxi();
        var taxi2 = new Taxi();

        taxi.AddPassengers(2, "서울역", 2);
        taxi.ConsumeGas(80);
        taxi.AddPassengers(5);
        taxi.AddPassengers(3, "구로디지털단지역", 12);
        taxi.ConsumeGas(20);
    }
}
