//Create a Polygon class. A polygon is a closed shape with lines joining the corner points.
//You will keep the points in an array list. Use object of java.awt.Point for the point.

//Polygon will have as an instance variable an ArrayList of Points to hold the points
//The constructor takes no parameters but initializes the instance variable
//
//The add method adds a Point to the polygon
//
//The perimeter method returns the perimeter of the polygon
//
//The draw method draws the polygon by connecting consecutive points and then
//connecting the last point to the first.
//
//No methods headers or javadoc is provided this time. You get to try your hand at writing a class almost from scratch
//
//For the draft, finish the constructor.
//Have the perimeter method return 0 and have the draw mwthod draw a
//line from point 0, 0 to point 30, 40
//

import java.util.ArrayList;
import java.awt.Point;
public class Polygon
{
    // Instance Variable
    private ArrayList<Point> points;
    
    /**
     * Contructor for the objects of class Polygon
     */
    public Polygon()
    {
        // initialize instance variables
        points = new ArrayList<Point>();
    }
    
    /**
     * Adds a point to the polygon
     * @param point to be added to the polygon
     */
    public void addPoint(Point point)
    {
        this.points.add(point);
        return;
    }
    
    /**
     * Returns the perimeter of the polygon
     * - sum of the length of all the lines in the polygon
     */
    public double perimeter()
    {
        double p = 0.0;
        
        double px1 = 0.0;
        double py1 = 0.0;
        double px2 = 0.0;
        double py2 = 0.0;
        int size = points.size();
        
        //if not enough Points to calc anything
        if (size < 2)
        {
            // nothing to calculate
            return p;
        }
        // Loop thru lines to calc length
        //   only if more that 2 points - otherwise just a line segment
        if (size > 2)
        {
            for (int i = 1; i < points.size(); i++)
            {
                px1 = points.get(i-1).getX();
                py1 = points.get(i-1).getY();
                px2 = points.get(i).getX();
                py2 = points.get(i).getY();
                
                p = p + Math.sqrt((Math.pow((px1 - px2), 2)) + (Math.pow((py1 - py2),2)));
                
            }
        }
        
        // calc length of last line and any single line
        px1 = points.get(size-1).getX();
        py1 = points.get(size-1).getY();
        px2 = points.get(0).getX();
        py2 = points.get(0).getY();
        
        p = p + Math.sqrt((Math.pow((px1 - px2), 2)) + (Math.pow((py1 - py2),2)));
        
        return p;
    }
    
    /**
     * draws the current polygon
     * drawing lines between each point and then the last one back to the first
     * 
     */
    public void draw()
    {
        
        
        double px1 = 0.0;
        double py1 = 0.0;
        double px2 = 0.0;
        double py2 = 0.0;
        int size = points.size();
        
        //if not enough Points to draw anything
        if (size < 2)
        {
            // nothing to draw
            return;
        }
        // Loop thru lines to draw
        //   only if more that 2 points - otherwise just a line segment
        if (size > 2)
        {
            for (int i = 1; i < points.size(); i++)
            {
                px1 = points.get(i-1).getX();
                py1 = points.get(i-1).getY();
                px2 = points.get(i).getX();
                py2 = points.get(i).getY();
                
                Line line = new Line(px1, py1, px2, py2);
                line.draw();
            }
        }
        
        // Draw last line and any single line
        px1 = points.get(size-1).getX();
        py1 = points.get(size-1).getY();
        px2 = points.get(0).getX();
        py2 = points.get(0).getY();
        
        Line line = new Line(px1, py1, px2, py2);
        line.draw();
        
        return;
    }
        
}
