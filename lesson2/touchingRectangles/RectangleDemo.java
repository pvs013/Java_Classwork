// BlueJ project: lesson2/touchingRectangles
//
// You need to construct and draw two rectangles for this quiz.
//
// Both rectangles have width 20 and height 30. The first rectangle
// has top left corner at (60, 90). The bottom right corner of the 
// first rectangle should be the top left corner of the second 
// rectangle. 

public class RectangleDemo
{
    public static void main(String[] args)
    {
        // TODO: Construct and draw the rectangles
        Rectangle rect1 = new Rectangle(20,70,40,30);
        rect1.setColor(Color.BLUE);   // BLUE
        rect1.draw();
        rect1.fill();
        
        Rectangle rect2 = new Rectangle(60,70,40,30);
        rect2.setColor(Color.MAGENTA);   // Magenta
        rect2.draw();
        rect2.fill();
        
        Rectangle rect3 = new Rectangle(100,70,40,30);
        rect3.setColor(Color.CYAN);   // Cyan
        rect3.draw();
        rect3.fill();
        
        Rectangle rect4 = new Rectangle(40,40,40,30);
        rect4.setColor(Color.RED);   // Red
        rect4.draw();
        rect4.fill();
        
        Rectangle rect5 = new Rectangle(80,40,40,30);
        rect5.setColor(Color.PINK);   // Pink
        rect5.draw();
        rect5.fill();
        
        Rectangle rect6 = new Rectangle(60,10,40,30);
        rect6.setColor(new Color(125,125,255));  // custom
        rect6.draw();
        rect6.fill();
    }
}
