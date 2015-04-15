// formulas for surface area and volume
// http://math2.org/math/geometry/areasvols.htm
//
// TODO: complete the code so that Cube implements the GeometricSolid interface
//
public class Cube implements GeometricSolid
{
    private double side;

    public Cube(double s)
    {
        side = s;
    }

    /**
    * get the volume of the cube
    * @return a double with the volume
    */
   public double getVolume()
   {
       return (Math.pow(side, 3));
   }
   
   /**
    * get the Surface Area of the cube
    * @return double containing the surface area
    * 
    */
   public double getSurfaceArea()
   {
       return(6 * Math.pow(side, 2));
   }


}
