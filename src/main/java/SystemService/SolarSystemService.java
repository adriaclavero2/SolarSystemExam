package SystemService;

import Figures.CelestialBody;
import Figures.Moon;
import Figures.Planet;

import java.util.ArrayList;
import java.util.List;

public class SolarSystemService {

    private List<CelestialBody> bodies = new ArrayList<>();

    public void register(CelestialBody body) {
        bodies.add(body);
    }

    public List<CelestialBody> listAll() {
        return bodies;
    }

    public List<Planet> filterPlanetsWithAtmosphere() {
        List<Planet> resultado = new ArrayList<>();

        for (CelestialBody body : bodies) {
            if (body instanceof Planet) {
                Planet p = (Planet) body;

                if (p.isHasAtmosphere()) {
                    resultado.add(p);
                }
            }
        }
        return resultado;
    }

    public List<Moon> filterMoonsByPlanet(String planetName) {
        List<Moon> result = new ArrayList<>();

        for (CelestialBody body : bodies) {
            if (body instanceof Moon) {
                Moon m = (Moon) body;

                if (m.getOrbitsPlanet().equalsIgnoreCase(planetName)) {
                    result.add(m);
                }
            }
        }
        return result;
    }
}