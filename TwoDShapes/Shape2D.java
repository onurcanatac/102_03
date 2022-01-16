package TwoDShapes;

/**
 * This class is an abstract superclass for 2D shape classes.
 * @author Onurcan Ataç
 */
public abstract class Shape2D {

    //properties

    protected int x;
    protected int y;

    //constructors

    /**
     * A super constructor for all 2D shapes.
     * @param x coordinate x of the center of a 2D shape
     * @param y coordinate y of the center of a 2D shape
     */
    public Shape2D( int x, int y) 
    {

        this.x = x;
        this.y = y;
    }

    //methods

    /**
     * Returns perimeter of a 2D shape. This is an abstract method.
     * @return perimeter of a 2D shape
     */
    public abstract double calculatePerimeter();

    /**
     * Returns area of a 2D shape. This is an abstract method.
     * @return area of a 2D shape
     */
    public abstract double calculateArea();

    /**
     * returns the euclidean distance between the centers of two Shape2D objects.
     * @param anyShape an object
     * @return euclidean distance between the centers of two Shape2D objects,
     * -1 if the object isn't a Shape2D object.
     */
    public double calculateDistance( Object anyShape)
    {
        if ( anyShape instanceof Shape2D )
        {
            double distance;
            Shape2D newAnyShape = (Shape2D) anyShape;
            //apply euclid's formula
            distance = Math.sqrt(Math.pow(this.x - (double)(newAnyShape.x), 2) + Math.pow(this.y - (double)(newAnyShape.y), 2));
            return distance; 
        }
        else
        {
            return -1;
        }
    }

    /**
     * Returns a string representation of two properties x and y coordinates of its center.
     * @return string representation of two properties x and y 
     */
    @Override
    public String toString()
    {
        return "x = " + this.x + ", " + "y = " + this.y;
    }

    /**
     * Returns whether the objects are equal or not. 
     * @param o object
     * @return true if given object is a Shape2D object that is equal to this one; false otherwise
     */
    @Override
    public boolean equals( Object o)
    {
        if( o instanceof Shape2D )
        {
            Shape2D shapeO = (Shape2D) o;
            return this.x == shapeO.x && this.y == shapeO.y;     
        }
        else
        {
            return false;
        }
    }
       
}

