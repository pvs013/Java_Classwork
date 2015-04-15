//Implement a class Balloon that models a spherical balloon that is being filled with air.  
//The constructor constructs an empty balloon (That is, the volume is 0).

//Supply these methods: 
//  void addAir(double amount) adds the given amount of air
//  double getVolume() gets the current volume
//  double getSurfaceArea() gets the current surface area
//  double getRadius() gets the current radius

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 3 - Question 3" for some tips on 
// how to begin. 

//See this link for formulas for volume and surface area: 
//    http://math.about.com/od/formulas/ss/surfaceareavol.htm 

//Hints
//  You can find the nth root of a number by using the pow method from the Math class 
//  where the exponent is 1/n.
//  You will need to solve the volume formula for radius.


/**
 * models a spherical balloon that is being filled with air
 *
 * @author KOBrien
 */
public class Balloon
{
    private double volume;   // volume of the balloon
    
    /**
     * Constructor for objects of class Balloon
     */
    public Balloon()
    {
        volume = 0.0;
    }

    /**
     * Gets the volume of the Balloon
     *
     * @return    the volume of this balloon
     */
    public double getVolume()
    {
        return volume;
    }
    
    
    /**
     * Adds air to the Balloon
     *
     * @param    amount of air to add to ballon
     */
    public void addAir(double amount)
    {
        volume = volume + amount;
    }

    /**
     * Gets the Surface Area of the Balloon
     * A = 4 * PI * r2
     *
     * @return    the surface area of this balloon
     */
    public double getSurfaceArea()
    {
        double surfacearea = (4 * Math.PI * Math.pow(getRadius(), 2));
        return surfacearea;
    }

    /**
     * Gets the radius of the Balloon
     * V = 4/3 PI r3
     * r3 = V * 3/4 * 1/PI
     *
     * @return    the radius of this balloon
     */
    public double getRadius()
    {
        double work = (volume * (3.0 / (Math.PI * 4.0)));
        double radius = Math.pow(work, (1.0/3.0));
        return radius;
    }
}
