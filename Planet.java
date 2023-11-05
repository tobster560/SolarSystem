class Planet extends CelestialObject {
    public Planet(double distance, double angle, double diameter, String color, double speed) {
        super(distance, angle, diameter, color, speed);
    }
    
    @Override
    public void update() {
        // Implement Planet-specific update logic
      angle += speed;
    }
}