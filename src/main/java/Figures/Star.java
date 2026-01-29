package Figures;

public class Star extends CelestialBody {

    private final double temperature;
    private final String spectralType;

    public Star(String name, double diameter, double dayDuration,
                double temperature, String spectralType) {
        super(name, diameter, dayDuration);
        this.temperature = temperature;
        this.spectralType = spectralType;
    }

    @Override
    public String getScientificDescription() {
        return String.format(
                "%s is a %s type star with a surface temperature of %.0f K.",
                getName(), spectralType, temperature
        );
    }
}
