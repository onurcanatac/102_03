package TwoDShapes;

/**
 * This class helps with creating squares and applying functions with them
 * @author Onurcan Ataç
 */
public class Square extends Shape2D {

    //properties

    private int sideLength;

    //constructors

    /**
     * Gets required values and creates a square with them.
     * @param x coordinate x of the center of the square
     * @param y coordinate y of the center of the square
     * @param sideLength length of the side of the square
     */
    public Square( int x, int y, int sideLength)
    {
        super(x, y);
        this.sideLength = sideLength;
    }

    /**
     * Calculates and returns parameter of the given square.
     * @return parameter of the square
     */
    @Override
    public double calculatePerimeter() 
    {
        return 4 * sideLength;
    }

    /**
     * Calculates and returns the area of the given square.
     * @return the area of the square
     */
    @Override
    public double calculateArea() 
    {
        return sideLength * sideLength;
    }

    /**
     * Returns string version of properties of the square.
     * @return string version of properties of the square
     */
    @Override
    public String toString()
    {
        return "[class Square]" + super.toString() + " side = " + this.sideLength;
    }

    /**
     * Checks if given square and o object are equal or not.
     * @param o an object
     * @return true if they are equal, false if they aren't
     */
    @Override
    public boolean equals( Object o)
    {
        if( o instanceof Square)
        {
            Square squareO = (Square) o;
            return super.equals(squareO) && this.sideLength == squareO.sideLength;
        }
        else
        {
            return false;
        }

    }
    
}

