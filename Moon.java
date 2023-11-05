
class Moon extends CelestialObject {
    private double centreOfRotationDistance;
    private double centreOfRotationAngle;
    Planet planet;
    int x = 0;

    public Moon(double distance, double angle, double diameter, String color, double centreOfRotationDistance, double centreOfRotationAngle, double speed, Planet planet) {
        super(distance, angle, diameter, color, speed);
        this.centreOfRotationDistance = centreOfRotationDistance;
        this.centreOfRotationAngle = centreOfRotationAngle;
        this.planet = planet;
    }

    public double getCentreOfRotationDistance() {
        return centreOfRotationDistance;
    }

    public double getCentreOfRotationAngle() {
        return centreOfRotationAngle;
    }

    @Override
    public void update() {
        // Implement Moon-specific update logic
        centreOfRotationAngle = planet.getAngle();
        
        angle += speed;
    }
}