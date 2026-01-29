package Figures;

import Interface.Habitable;

public class Planet extends CelestialBody implements Habitable {

    private final int moonCount;
    private final boolean hasAtmosphere;

    public Planet(String name, double diameter, double dayDuration,
                  int moonCount, boolean hasAtmosphere) {
        super(name, diameter, dayDuration);
        this.moonCount = moonCount;
        this.hasAtmosphere = hasAtmosphere;

    }

    public boolean isHasAtmosphere() {
        return hasAtmosphere;
    }

    @Override
    public String getScientificDescription() {
        String textAtmosfera = "does not have";

        if (hasAtmosphere) {
            textAtmosfera = "has";
        }

        return getName() + " has a diameter of " + (int)getDiameter() + " km and " + textAtmosfera +
                " atmosphere. It has " + moonCount + " moons.";
    }

    @Override
    public String getHabitabilityReport() {
        if (hasAtmosphere && getDiameter() > 3000) {
            return "This planet could be habitable.";
        }
        return "This planet does not appear to be habitable.";
    }
}
