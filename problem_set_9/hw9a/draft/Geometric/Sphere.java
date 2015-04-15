// formulas for surface area and volume
// http://math.about.com/od/formulas/ss/surfaceareavol.htm
//
// TODO: complete the code so that Shpere implements the GeometricSolid interface
//
public class Sphere implements GeometricSolid
{
    private double radius;

    /**
     * Constructor for objects of class Sphere
     */
    public Sphere()
    {
        radius = 0;
    }

    /**
     * Constructs a Sphere with the given radius
     * @param r the radius
     */
    public Sphere( double r)
    {
        radius = r;
    }

    public void setRadius(double r)
    {
        radius = r;
    }

    public double getRadius()
    {
        return radius;
    }

   /**
    * get the volume of the sphere
    * @return a double with the volume
    */
   public double getVolume()
   {
       return ((Math.PI * Math.pow(radius, 3) * 4)/3);
   }
   
   /**
    * get the Surface Area of the sphere
    * @return double containing the surface area
    * 
    */
   public double getSurfaceArea()
   {
       return(4 * Math.PI * Math.pow(radius, 2));
   }
}

      
