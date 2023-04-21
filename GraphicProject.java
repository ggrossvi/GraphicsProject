import java.awt.Color;
import java.awt.Graphics;


public class GraphicProject
{
        // when do I write prive in front of constants
        static final int LINE_LENGTH = 200; 
        static final int INCREMENT = 10; 
        static final int PANEL_X_COORDINATE = 400;
        static final int PANEL_Y_COORDINATE = 400;
        static final int CENTER_X_COORDINATE = PANEL_X_COORDINATE/2 -1;
        static final int CENTER_Y_COORDINATE = PANEL_Y_COORDINATE/2 -1;

        static final int PANEL2_WIDTH = 600;
        static final int PANEL2_HEIGHT = 600;
        static final int PANEL2_CENTER_X_COORDINATE = PANEL2_WIDTH/2 -1;
        static final int PANEL2_CENTER_Y_COORDINATE = PANEL2_HEIGHT/2 -1;
        
        static final int CIRCLE1_DIAMETER = 20; 
         static final int CIRCLE2_DIAMETER = (int)CIRCLE1_DIAMETER/2; 
        
        static final int CIRCLE1INCREMENT = 10; 
        // static final int PANEL2_X_COORDINATE = 400;
        // static final int PANEL2_Y_COORDINATE = 400;
       
        
    
    // https://stackoverflow.com/questions/42855224/how-to-add-rgb-values-into-setcolor-in-java
    public static final Color VERY_LIGHT_GRAY = new Color(238,238,238);
    
    
    
    public static void main (String[] args) {
                
        DrawingPanel panel = 
           new DrawingPanel(PANEL_X_COORDINATE,PANEL_Y_COORDINATE); // window
        
        panel.setBackground(Color.BLACK);
        
        Graphics gr = panel.getGraphics(); // line paintbrush
        Color myFavColor1 = new Color(200,13,255);
        gr.setColor(myFavColor1);
        
        // north line
        gr.drawLine(CENTER_X_COORDINATE,CENTER_Y_COORDINATE, CENTER_X_COORDINATE,CENTER_Y_COORDINATE - LINE_LENGTH); 
        
        // south line
        gr.drawLine(CENTER_X_COORDINATE,CENTER_Y_COORDINATE, CENTER_X_COORDINATE,(CENTER_Y_COORDINATE + LINE_LENGTH)); 
        gr.setColor(Color.GREEN);
        
        // east line
        gr.drawLine(CENTER_X_COORDINATE,CENTER_Y_COORDINATE, (CENTER_X_COORDINATE + LINE_LENGTH),CENTER_Y_COORDINATE); 
        
        // west line
        gr.drawLine(CENTER_X_COORDINATE,CENTER_Y_COORDINATE, (CENTER_X_COORDINATE - LINE_LENGTH),CENTER_Y_COORDINATE); 
        
        int lineLengthAdjacent = Math.round((int)GraphicProject.getA(LINE_LENGTH));
        int incrementLengthAdjacent = Math.round((int)(GraphicProject.getA(INCREMENT)));
        
        
        // Part 2 of assignment
        
        DrawingPanel panel2 = 
           new DrawingPanel(PANEL2_WIDTH,PANEL2_HEIGHT); // window
           
        panel2.setBackground(Color.WHITE);
        
        Graphics gr2 = panel2.getGraphics();
        
        gr2.setColor(Color.YELLOW);
        gr2.drawOval(PANEL2_CENTER_X_COORDINATE, PANEL2_CENTER_Y_COORDINATE, CIRCLE1_DIAMETER,CIRCLE1_DIAMETER);
        gr2.fillOval(PANEL2_CENTER_X_COORDINATE,PANEL2_CENTER_Y_COORDINATE,CIRCLE1_DIAMETER,CIRCLE1_DIAMETER);
        System.out.println(PANEL2_CENTER_X_COORDINATE + " " + PANEL2_CENTER_Y_COORDINATE);
        // gr2.drawRect(PANEL2_CENTER_X_COORDINATE, PANEL2_CENTER_Y_COORDINATE, CIRCLE1_DIAMETER, CIRCLE1_DIAMETER);
        
        gr2.setColor(Color.BLUE);
        // gr2.drawRect(PANEL2_CENTER_X_COORDINATE + CIRCLE1_DIAMETER, PANEL2_CENTER_Y_COORDINATE, CIRCLE2_DIAMETER, CIRCLE2_DIAMETER);
        gr2.drawOval(PANEL2_CENTER_X_COORDINATE + CIRCLE1_DIAMETER,PANEL2_CENTER_Y_COORDINATE, CIRCLE2_DIAMETER,CIRCLE2_DIAMETER);
        gr2.fillOval(PANEL2_CENTER_X_COORDINATE + CIRCLE1_DIAMETER,PANEL2_CENTER_Y_COORDINATE, CIRCLE2_DIAMETER,CIRCLE2_DIAMETER);
        // gr2.drawRect(PANEL2_CENTER_X_COORDINATE + CIRCLE1_DIAMETER, PANEL2_CENTER_Y_COORDINATE + CIRCLE2_DIAMETER, 
                    // CIRCLE2_DIAMETER, CIRCLE2_DIAMETER);
        gr2.drawOval(PANEL2_CENTER_X_COORDINATE + CIRCLE1_DIAMETER, PANEL2_CENTER_Y_COORDINATE + CIRCLE1_DIAMETER/2, 
                    CIRCLE2_DIAMETER,CIRCLE2_DIAMETER);
        gr2.fillOval(PANEL2_CENTER_X_COORDINATE + CIRCLE1_DIAMETER, PANEL2_CENTER_Y_COORDINATE + CIRCLE1_DIAMETER/2, 
                    CIRCLE2_DIAMETER,CIRCLE2_DIAMETER);            
        
        
                    
        // gr2.setColor(Color.RED); 
        // gr2.drawRect(PANEL2_CENTER_X_COORDINATE + CIRCLE1_DIAMETER/2, PANEL2_CENTER_Y_COORDINATE - CIRCLE2_DIAMETER, 
                    // CIRCLE2_DIAMETER, CIRCLE2_DIAMETER);
        gr2.drawOval(PANEL2_CENTER_X_COORDINATE + CIRCLE1_DIAMETER/2, PANEL2_CENTER_Y_COORDINATE - CIRCLE1_DIAMETER/2, 
                    CIRCLE2_DIAMETER,CIRCLE2_DIAMETER);  
        gr2.fillOval(PANEL2_CENTER_X_COORDINATE + CIRCLE1_DIAMETER/2, PANEL2_CENTER_Y_COORDINATE - CIRCLE1_DIAMETER/2, 
                    CIRCLE2_DIAMETER,CIRCLE2_DIAMETER);  
                               
        // gr2.drawRect(PANEL2_CENTER_X_COORDINATE, PANEL2_CENTER_Y_COORDINATE - CIRCLE2_DIAMETER, 
                    // CIRCLE2_DIAMETER, CIRCLE2_DIAMETER);
        gr2.drawOval(PANEL2_CENTER_X_COORDINATE, PANEL2_CENTER_Y_COORDINATE - CIRCLE1_DIAMETER/2, 
                    CIRCLE2_DIAMETER,CIRCLE2_DIAMETER);  
                    
        gr2.fillOval(PANEL2_CENTER_X_COORDINATE, PANEL2_CENTER_Y_COORDINATE - CIRCLE1_DIAMETER/2, 
                    CIRCLE2_DIAMETER,CIRCLE2_DIAMETER);  
                    
                    
        // gr2.setColor(Color.ORANGE);            
        // gr2.drawRect(PANEL2_CENTER_X_COORDINATE - CIRCLE2_DIAMETER, PANEL2_CENTER_Y_COORDINATE, 
                    // CIRCLE2_DIAMETER, CIRCLE2_DIAMETER);
        gr2.drawOval(PANEL2_CENTER_X_COORDINATE - CIRCLE2_DIAMETER, PANEL2_CENTER_Y_COORDINATE, 
                    CIRCLE2_DIAMETER,CIRCLE2_DIAMETER);
        gr2.fillOval(PANEL2_CENTER_X_COORDINATE - CIRCLE2_DIAMETER, PANEL2_CENTER_Y_COORDINATE, 
                    CIRCLE2_DIAMETER,CIRCLE2_DIAMETER);
                    
        // gr2.drawRect(PANEL2_CENTER_X_COORDINATE - CIRCLE1_DIAMETER/2, PANEL2_CENTER_Y_COORDINATE + CIRCLE1_DIAMETER/2, 
                    // CIRCLE2_DIAMETER, CIRCLE2_DIAMETER);
        gr2.drawOval(PANEL2_CENTER_X_COORDINATE - CIRCLE1_DIAMETER/2, PANEL2_CENTER_Y_COORDINATE + CIRCLE1_DIAMETER/2, 
                    CIRCLE2_DIAMETER,CIRCLE2_DIAMETER);
        gr2.fillOval(PANEL2_CENTER_X_COORDINATE - CIRCLE1_DIAMETER/2, PANEL2_CENTER_Y_COORDINATE + CIRCLE1_DIAMETER/2, 
                    CIRCLE2_DIAMETER,CIRCLE2_DIAMETER);

                    
        // gr2.setColor(Color.RED);
        // gr2.drawRect(PANEL2_CENTER_X_COORDINATE, PANEL2_CENTER_Y_COORDINATE + CIRCLE1_DIAMETER, 
                    // CIRCLE2_DIAMETER, CIRCLE2_DIAMETER);
        gr2.drawOval(PANEL2_CENTER_X_COORDINATE, PANEL2_CENTER_Y_COORDINATE + CIRCLE1_DIAMETER,  
                    CIRCLE2_DIAMETER,CIRCLE2_DIAMETER);
                    
        gr2.fillOval(PANEL2_CENTER_X_COORDINATE, PANEL2_CENTER_Y_COORDINATE + CIRCLE1_DIAMETER,  
                    CIRCLE2_DIAMETER,CIRCLE2_DIAMETER);
                    
        // gr2.drawRect(PANEL2_CENTER_X_COORDINATE + CIRCLE1_DIAMETER/2, PANEL2_CENTER_Y_COORDINATE + CIRCLE1_DIAMETER, 
                    // CIRCLE2_DIAMETER, CIRCLE2_DIAMETER);
        gr2.drawOval(PANEL2_CENTER_X_COORDINATE + CIRCLE1_DIAMETER/2, PANEL2_CENTER_Y_COORDINATE + CIRCLE1_DIAMETER,  
                    CIRCLE2_DIAMETER,CIRCLE2_DIAMETER);
        gr2.fillOval(PANEL2_CENTER_X_COORDINATE + CIRCLE1_DIAMETER/2, PANEL2_CENTER_Y_COORDINATE + CIRCLE1_DIAMETER,  
                    CIRCLE2_DIAMETER,CIRCLE2_DIAMETER);
                    
        
                    
        
                    
        
                    
        
        
        
        
        
        // gr2.drawOval(409 + Math.round((int)(120/Math.sqrt(2))), 301 + Math.round((int)(120/Math.sqrt(2))), 100,100);
        // int X_Coordinate = 409 + Math.round((int)(120/Math.sqrt(2)));
        // int Y_Coordinate = 301 + Math.round((int)(120/Math.sqrt(2)));
        // int X_Coordinate = 410 + Math.round((int)(CIRCLE1_DIAMETER/Math.sqrt(2)));
        // int Y_Coordinate = 301 + Math.round((int)(CIRCLE1_DIAMETER/Math.sqrt(2)));
        // double circle1AdjacentSide = GraphicProject.getA(CIRCLE1_DIAMETER);
        // gr2.drawLine(PANEL2_CENTER_X_COORDINATE, PANEL2_CENTER_Y_COORDINATE,
                    //PANEL2_CENTER_X_COORDINATE + (int)circle1AdjacentSide, PANEL2_CENTER_Y_COORDINATE + (int)circle1AdjacentSide);
        
        // gr2.drawOval(PANEL2_CENTER_X_COORDINATE + (int)circle1AdjacentSide, PANEL2_CENTER_Y_COORDINATE + (int)circle1AdjacentSide, 100,100);
        
        // gr2.drawRect(PANEL2_CENTER_X_COORDINATE, PANEL2_CENTER_Y_COORDINATE, CIRCLE1_DIAMETER, CIRCLE1_DIAMETER);
        
        
      
        
        
        
        
        
        
        
        //drawRect(int x, int y, int width, int height)
        //Draws the outline of the specified rectangle.
        
        //fillOval(int x, int y, int width, int height)
        //Fills an oval bounded by the specified rectangle with the current color.
        
        
        
        
        
        
        
        
        
    
        //panel.sleep(60);
        
        // northhwest 45 line
        gr.setColor(Color.YELLOW);
        gr.drawLine(CENTER_X_COORDINATE ,CENTER_Y_COORDINATE, (CENTER_X_COORDINATE - lineLengthAdjacent),(CENTER_Y_COORDINATE - lineLengthAdjacent));
        
        // southhwest 45 line
        gr.setColor(Color.BLUE);
        gr.drawLine(CENTER_X_COORDINATE,CENTER_Y_COORDINATE, (CENTER_X_COORDINATE - lineLengthAdjacent),(CENTER_Y_COORDINATE + lineLengthAdjacent)); 
        
        // southeast 45 line - YES
        gr.setColor(Color.WHITE);
        gr.drawLine(CENTER_X_COORDINATE,CENTER_Y_COORDINATE, (CENTER_X_COORDINATE + lineLengthAdjacent),(CENTER_Y_COORDINATE + lineLengthAdjacent)); 
        
        // northeast 45 line -YES
        gr.setColor(Color.RED);
        gr.drawLine(CENTER_X_COORDINATE ,CENTER_Y_COORDINATE, (CENTER_X_COORDINATE + lineLengthAdjacent),(CENTER_Y_COORDINATE - lineLengthAdjacent));
    
        
        
        for (int multiplier = 1; multiplier <=LINE_LENGTH/INCREMENT ; multiplier++) {
            // section 1
            gr.setColor(Color.YELLOW);
            gr.drawLine(CENTER_X_COORDINATE ,(CENTER_Y_COORDINATE - LINE_LENGTH + (INCREMENT * multiplier)), CENTER_X_COORDINATE + (incrementLengthAdjacent * multiplier), 
                CENTER_Y_COORDINATE - (incrementLengthAdjacent * multiplier));
                
            // section 2   
            gr.setColor(Color.RED);
            gr.drawLine(CENTER_X_COORDINATE + LINE_LENGTH - INCREMENT * multiplier,CENTER_Y_COORDINATE, CENTER_X_COORDINATE + (incrementLengthAdjacent * multiplier), 
                CENTER_Y_COORDINATE - (incrementLengthAdjacent * multiplier));
                
            // section 3
            gr.setColor(Color.GREEN);
            gr.drawLine(CENTER_X_COORDINATE + LINE_LENGTH - (INCREMENT * multiplier), CENTER_Y_COORDINATE, 
                CENTER_X_COORDINATE + (incrementLengthAdjacent * multiplier),CENTER_Y_COORDINATE + (incrementLengthAdjacent * multiplier)); 
                
            // section 4
            gr.setColor(Color.BLUE);
            gr.drawLine(CENTER_X_COORDINATE, CENTER_Y_COORDINATE + LINE_LENGTH - (INCREMENT * multiplier), 
                CENTER_X_COORDINATE + (incrementLengthAdjacent * multiplier), CENTER_Y_COORDINATE + (incrementLengthAdjacent * multiplier)); 
                
            // section 5
            gr.setColor(Color.YELLOW);
            gr.drawLine(CENTER_X_COORDINATE, CENTER_Y_COORDINATE + LINE_LENGTH - (INCREMENT * multiplier), 
                CENTER_X_COORDINATE - (incrementLengthAdjacent * multiplier), CENTER_Y_COORDINATE + (incrementLengthAdjacent * multiplier)); 
            
            // section 6
            gr.setColor(Color.RED);
            gr.drawLine(CENTER_X_COORDINATE - LINE_LENGTH + (INCREMENT * multiplier), CENTER_Y_COORDINATE, 
                CENTER_X_COORDINATE - (incrementLengthAdjacent * multiplier),CENTER_Y_COORDINATE + (incrementLengthAdjacent * multiplier)); 
            
            // section 7
            gr.setColor(Color.GREEN);
            gr.drawLine(CENTER_X_COORDINATE - LINE_LENGTH + (INCREMENT * multiplier), CENTER_Y_COORDINATE, 
                CENTER_X_COORDINATE - (incrementLengthAdjacent * multiplier),CENTER_Y_COORDINATE - (incrementLengthAdjacent * multiplier));  
            
            // section 8
            gr.setColor(Color.BLUE);
            gr.drawLine(CENTER_X_COORDINATE, CENTER_Y_COORDINATE - LINE_LENGTH + (INCREMENT * multiplier), 
                CENTER_X_COORDINATE - (incrementLengthAdjacent * multiplier), CENTER_Y_COORDINATE - (incrementLengthAdjacent * multiplier)); 
    
        }
        
        
    }  
    
      public static double getA(int c) {
          double adjacent = c/Math.sqrt(2);
          System.out.println("c:" + c);
          System.out.println("adjacent:" + adjacent);
          return adjacent;
      }
      
      public static int getXCoordinate(int startingX, int hypotenuse){    //  
          int XCoordinate = startingX + Math.round((int)(hypotenuse/Math.sqrt(2)));
          return XCoordinate;
      }
      
      public static int getYCoordinate(int startingY, int hypotenuse){    //  
          int XCoordinate =  startingY + Math.round((int)(hypotenuse/Math.sqrt(2)));
          return XCoordinate;
      }
          
    
}
