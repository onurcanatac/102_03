package TwoDShapes;
/**
 * This class helps with creating circles and applying functions with them.
 * @author Onurcan Ataç 
*/
public class Circle extends Shape2D {

    //properties

    private double radius;

    //constructors

    /**
     * Takes required values and creates a circle.
     * @param x coordinate x of the center of the circle
     * @param y coordinate y of the center of the circle
     * @param radius radius of circle
     */
    public Circle( int x, int y, double radius)
    {
        super( x, y);
        this.radius = radius;
    }

    //methods

    /**
     * Calculates perimeter of the given circle.
     * @return perimeter perimeter of the circle
     */
    @Override
    public double calculatePerimeter() 
    {  
        double perimeter;

        perimeter = 2 * Math.PI * radius; 
        return perimeter;
    }

    /**
     * Calculates area of the given circle.
     * @return area area of the circle
     */
    @Override
    public double calculateArea()
    {
        double area;

        area = Math.PI * Math.pow(radius, 2);
        return area;
    }    
    
    /**
     * Returns properties of the circle in String form.
     * @return properties of the circle in String form
     */
    @Override
    public String toString()
    {
        return "[class Circle]" + super.toString() + " and radius = " + this.radius;
    }

    /**
     * Checks if a circle and an object are equal.
     * @param o an object
     * @return true if they are equal, false if they aren't
     */
    @Override
    public boolean equals( Object o)
    {
        if( o instanceof Circle)
        {
            Circle circleO = (Circle) o;
            return super.equals(circleO) && this.radius == circleO.radius;
        }
        else
        {
            return false;
        }

    }
}
