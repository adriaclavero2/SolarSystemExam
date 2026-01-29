package Figures;

public abstract class CelestialBody {
        private final String name;
        private final double diameter;
        private final double dayDuration;

        public CelestialBody(String name, double diameter, double dayDuration) {
            this.name = name;
            this.diameter = diameter;
            this.dayDuration = dayDuration;
        }

        public String getName() {
            return name;
        }

        public double getDiameter() {
            return diameter;
        }

        public double getDayDuration() {
            return dayDuration;
        }

        public abstract String getScientificDescription();
    }

