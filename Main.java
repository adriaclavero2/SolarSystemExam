package Main;

import Figures.Moon;
import Figures.Planet;
import Figures.Star;
import Interface.Habitable;
import Print.HabitabilityPrinter;
import SystemService.SolarSystemService;

public class Main {
    public static void main(String[] args) {

        SolarSystemService service = new SolarSystemService();

        service.register(new Planet("Earth", 12742, 24, 1, true));
        service.register(new Star("Sun", 1391000, 600, 5778, "G2V"));
        service.register(new Moon("Moon", 3474, 708, "Earth", true));

        service.listAll().forEach(b -> System.out.println(b.getScientificDescription()));

        HabitabilityPrinter printer = new HabitabilityPrinter();
        printer.printReport((Habitable) service.listAll().get(0));

        System.out.println("Moons that orbit Earth:");
        service.filterMoonsByPlanet("Earth")
                .forEach(m -> System.out.println(m.getName()));
    }
}
