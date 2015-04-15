public class ColorIntro
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(60, 90, 20, 30);
        Rectangle box2 = new Rectangle(80, 120, 20, 30);
        box.draw();
        box2.draw();

        box.setColor(new Color(255, 0, 0));
        box.draw();
        box2.setColor(new Color(0, 255, 0));
        box2.fill();
        
        box2.setColor(new Color(0, 255, 255));  // Color Cyan
        box2.fill();
        //box2.setColor(new Color(255, 255, 0));  // Color Yellow
        //box2.fill();
        //box2.setColor(new Color(255, 0, 255));  // Color Magenta
        //box2.fill();
        //box2.setColor(new Color(255, 255, 255));  // Color White
        //box2.fill();
    }
}
