package TwoDShapes;

/**
 * This class helps with creating rectangles and applying functions with them
 * @author Onurcan Ataç
 */
public class Rectangle extends Shape2D {

    //properties

    private int height;
    private int width;

    //constructors

    /**
     * Takes required values and creates a rectangle with them.
     * @param x coordinate x of the center of the rectangle
     * @param y coordnate y of the center of the square
     * @param height height of the rectangle
     * @param width width of the rectangle
     */
    public Rectangle( int x, int y, int height, int width)
    {
        super(x,y);
        this.height = height;
        this.width = width;
    }

    /**
     * Calculates and returns the perimeter of the given rectangle.
     * @return perimeter perimeter of the given rectangle
     */
    @Override
    public double calculatePerimeter() 
    {
        double perimeter;

        perimeter = 2 * ( height + width );
        return perimeter; 
    }

    /**
     * Calculates and returns the area of given rectangle.
     * @return area area of the given rectangle
     */
    @Override
    public double calculateArea()
    {
        double area;

        area = height * width;
        return area;
    }

    /**
     * Returns properties of given rectangle in String form.
     * @return  properties of given rectangle in String form
     */
    @Override
    public String toString()
    {
        return "[class Rectangle]" + super.toString() + " height = " + this.height + " and width = " + this.width;
    }
    
    /**
     * Checks if a rectangle and an object are equal.
     * @param o an object
     * @return true if they are equal, false if they aren't
     */
    @Override
    public boolean equals( Object o)
    {
        if( o instanceof Rectangle)
        {
            Rectangle recO = (Rectangle) o;
            return super.equals(recO) && this.height == recO.height && this.width == recO.width;
        }
        else
        {
            return false;
        }
    }
    
}

