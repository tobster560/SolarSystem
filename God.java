
public class God extends SolarSystem {
    public God(int width, int height) {
        super(width, height);
    }

    public static void run(God solarSystem, CelestialObject[] celestialObjects) {
        for (CelestialObject object : celestialObjects) {
            object.update();
            if(object instanceof Moon){
                Moon moon = (Moon) object;
              solarSystem.drawSolarObjectAbout(object.getDistance(), object.getAngle(), object.getDiameter(), object.getColor(), moon.getCentreOfRotationDistance(), moon.getCentreOfRotationAngle());
            }
            else
            solarSystem.drawSolarObject(object.getDistance(),object.getAngle(), object.getDiameter(), object.getColor());
        }
        solarSystem.finishedDrawing();
    }

    public static void main(String[] args) {
        Sun sun = new Sun(125, "YELLOW");
        Planet mecury = new Planet(80, 200, 12, "RED",0.5);
        Planet venus = new Planet(100, 30, 24, "ORANGE",0.4);
        Planet earth = new Planet(150, 140, 25, "BLUE",0.3);
        Moon moon = new Moon(30, 0 ,10, "#808080", earth.getDistance(), 0 ,0.5, earth);
        Planet mars = new Planet(175, 50,  20, "RED",0.2);
        Planet jupiter = new Planet(250, 230, 90, "RED",0.15);
        Moon ganymede = new Moon(125, 0 , 25, "#808080", jupiter.getDistance(), 0 ,0.4, jupiter);
        Moon europa = new Moon(65, 100 ,10, "#696112.", jupiter.getDistance(), 0 ,1, jupiter);
        Moon io = new Moon(80, 0 ,14, "#adff2f", jupiter.getDistance(), 0 ,0.8, jupiter);
        Moon callisto = new Moon(100, 50 ,22, "#9CACA5", jupiter.getDistance(), 0 ,0.55, jupiter);
        Planet saturn = new Planet(300, 100, 80, "YELLOW",0.1);
        Moon titan = new Moon(80, 0 ,20, "FFEA97", saturn.getDistance(), 0 ,0.5, saturn);
        Planet uranus = new Planet(350, 30, 40, "BLUE",0.08);
        Planet neptune = new Planet(350, 210, 38, "#68BBE3",0.05);
        Moon titania = new Moon(51, 90 ,14, "#808080", uranus.getDistance(), 0 ,0.5, uranus);
        Moon oberon = new Moon(50, 270 ,13, "#808080", uranus.getDistance(), 0 ,0.5, uranus);
        Moon umbriel = new Moon(50, 0 ,12, "#808080", uranus.getDistance(), 0 ,0.5, uranus);
        Moon ariel = new Moon(49, 180 ,12, "#808080", uranus.getDistance(), 0 ,0.5, uranus);
        Moon triton = new Moon(50, 0 ,15, "#808080", neptune.getDistance(), 0 ,0.5, neptune);


        God solarSystem = new God(900, 900);

        CelestialObject[] celestialObjects = {sun, mecury, venus, earth, moon,mars ,jupiter, ganymede, europa, io, callisto, saturn, titan, uranus, neptune,triton, titania, oberon, umbriel, ariel};
        
        while (true) {
            run(solarSystem, celestialObjects);
        }
    }
}

    
