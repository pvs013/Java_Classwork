public class Flower
{
   private int x;  // x coord
   private int y;  // y coord

   public Flower(int theX, int theY)
   {
         x = theX;
         y = theY;
   }

   public void draw()
   {
         // start with top
         int Diam = 20;
         
         Ellipse TopPetal = new Ellipse(x+Diam, y, Diam, Diam);
         TopPetal.setColor(Color.PINK);
         TopPetal.fill();
         
         Ellipse LeftPetal = new Ellipse(x, y+Diam, Diam, Diam);
         LeftPetal.setColor(Color.PINK);
         LeftPetal.fill();
         
         Ellipse Center = new Ellipse(x+Diam, y+Diam, Diam, Diam);
         Center.setColor(Color.YELLOW);
         Center.fill();
         
         Ellipse RightPetal = new Ellipse(x+(2*Diam), y+Diam, Diam, Diam);
         RightPetal.setColor(Color.PINK);
         RightPetal.fill();
         
         Ellipse BottomPetal = new Ellipse(x+Diam, y+(2*Diam), Diam, Diam);
         BottomPetal.setColor(Color.PINK);
         BottomPetal.fill();
         
         // Stem
         Line stem = new Line(x+(1.5*Diam), y+(3*Diam), x+(1.5*Diam), y+(3*Diam+3*Diam));
         stem.setColor(Color.GREEN);
         stem.draw();

   }
}
