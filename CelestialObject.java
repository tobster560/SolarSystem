class CelestialObject {
    double distance;
    double angle;
    double diameter;
    String color;
    double centreOfRotationDistance;
    double centreOfRotationAngle;
    double speed;

    public CelestialObject(double distance, double angle, double diameter, String color, double speed) {
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.color = color;
        this.speed = speed;
        
    }

    public double getDistance() {
        return distance;
    }

    public double getAngle() {
        return angle;
    }

    public double getDiameter() {
        return diameter;
    }

    public String getColor() {
        return color;
    }

    public double getSpeed() {
        return speed;
    }
    public void update() {
        // Implement specific update logic in subclasses
    }
}