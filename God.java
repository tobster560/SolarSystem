
public class God extends SolarSystem {
    
     public God(int width, int height){
        super(width, height);
    } 
    
      
public static void Run (God solarSystem, Planet Earth, Moon Moon, Sun sun){
      Earth.angle += 1;
      Moon.angle += 1;
      solarSystem.drawSolarObject(0,0,sun.diameter, sun.col);
      solarSystem.drawSolarObject(Earth.distance,Earth.angle,Earth.diameter, Earth.col);
      solarSystem.drawSolarObjectAbout(Moon.distance, Moon.angle, Moon.diamater, Moon.col, Moon.centerOfRotationDistance, Earth.angle);
      solarSystem.finishedDrawing();

    }
    
    public static void main(String[] args) {
      Sun sun = new Sun(100, "YELLOW");
      Planet Earth = new Planet(200, 1, 50, "BLUE");
      Moon Moon = new Moon(50.0, 1.0, 30.0, "BLUE", Earth.distance, Earth.angle);
      God solarSystem = new God(800, 800);
  
      while(true){
          Run(solarSystem,Earth,Moon,sun);
      }
      }

}

    
