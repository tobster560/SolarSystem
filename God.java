
public class God extends SolarSystem {
    
     public God(int width, int height){
        super(width, height);
    } 
    public static void main(String[] args) {
        int i =0;
        int ii=0;
        God solarSystem = new God(500, 500);
        solarSystem.drawSolarObject(0, 0, 50, "YELLOW"); // Example: Draw a solar object
        solarSystem.drawSolarObject(100, 20, 20, "BLUE");
        while (true){
          i++;
          ii += 3;
          solarSystem.drawSolarObject(0, 0, 50, "YELLOW");
          solarSystem.drawSolarObject(150, i, 20, "BLUE");
          solarSystem.drawSolarObjectAbout(50, ii, 10,"PINK", 150, i);
          solarSystem.finishedDrawing();
        }
       
        
   }
}

    
