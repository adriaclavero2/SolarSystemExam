package Figures;

import Interface.Habitable;

public class Moon extends CelestialBody implements Habitable {

    private final String orbitsPlanet;
    private final boolean rockySurface;

    public Moon(String name, double diameter, double dayDuration,
                String orbitsPlanet, boolean rockySurface) {
        super(name, diameter, dayDuration);
        this.orbitsPlanet = orbitsPlanet;
        this.rockySurface = rockySurface;
    }

    public String getOrbitsPlanet() {
        return orbitsPlanet;
    }

    @Override
    public String getScientificDescription() {
        String surfaceType = "not rocky";

        if (rockySurface) {
            surfaceType = "rocky";
        }

        return getName() + " orbits around " + orbitsPlanet + ". Its surface is "
                + surfaceType + " and its diameter is " + (int)getDiameter() + " km.";
    }

    @Override
    public String getHabitabilityReport() {
        if (rockySurface && getDiameter() > 1000) {
            return "This moon could be habitable.";
        }
        return "This moon does not appear to be habitable.";
    }
}
