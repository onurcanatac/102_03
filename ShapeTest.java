import java.util.Arrays;
import TwoDShapes.*;

/**
 * This class tests the functions of TwoDShapes package.
 * @author Onurcan Ataç
 */
public class ShapeTest {

    public static void main(String[] args)
    {
        //Create objects and array.
        Rectangle rec1 = new Rectangle(2 ,3 ,8 , 15);
        
        Circle circl = new Circle(13, 15, 7);//radius was 3 but I changed it to 7 so that circles area can be the biggest. 
        
        Square sq = new Square(-2, -5, 5);
        Square sq2 = new Square(-2, -5, 5);
        Square sq3 = new Square(-1, -5, 5);
        Square sq4 = null;

        Shape2D[] shapesArray = { rec1, circl, sq2};

        Shape2D shapeWithLargestArea;
        Shape2D shapeWithLongestPerimeter;

        //Display toString method for objects.
        System.out.println( rec1);
        
        System.out.println( circl);

        System.out.println( "sq: " + sq);
        System.out.println( "sq2: " + sq2);
        System.out.println( "sq3: " + sq3);
        System.out.println( "sq4: " + sq4);

        //Check some equalities using equals method.
        System.out.println( "sq.equals( sq2 ) is " + sq.equals(sq2));
        System.out.println( "sq.equals( sq3 ) is " + sq.equals(sq3));
        System.out.println( "sq.equals( sq4 ) is " + sq.equals(sq4));
        System.out.println( "sq.equals( circl ) is " + sq.equals(circl));

        //Print out the shapesArray.
        System.out.print( "The shape array: ");
        System.out.println(Arrays.toString(shapesArray));

        //Find the 2D shape with the largest area, and report 
        //which kind of shape has the biggest area among shapesArray.
        shapeWithLargestArea = findLargestArea(shapesArray);

        if( shapeWithLargestArea instanceof Circle)
        {
            System.out.println( "Circle has largest area");
        }
        else if( shapeWithLargestArea instanceof Rectangle)
        {
            System.out.println( "Rectangle has largest area");
        }
        else if( shapeWithLargestArea instanceof Square)
        {
            System.out.println( "Square has largest area");
        }

        //Find the 2D shape with the longest perimeter, and report 
        //which kind of shape has the biggest perimeter among shapesArray.
        shapeWithLongestPerimeter = findLongestPerimeter(shapesArray);
        
        if( shapeWithLongestPerimeter instanceof Circle)
        {
            System.out.println( "Circle has longest perimeter");
        }
        else if( shapeWithLongestPerimeter instanceof Rectangle)
        {
            System.out.println( "Rectangle has longest perimeter");
        }
        else if( shapeWithLongestPerimeter instanceof Square)
        {
            System.out.println( "Square has longest perimeter");
        }

        //Display and demonstrate the calculateDistance method by finding distances of different shape objects.
        System.out.println( "Distance between shape 1 and shape 2 is " + rec1.calculateDistance(circl));
        System.out.println( "Distance between shape 1 and shape 3 is " + rec1.calculateDistance(sq));
        System.out.println( "Distance between shape 2 and shape 3 is " + circl.calculateDistance(sq));
    }

    /**
     * Finds the Shape2D object with the largest area and returns it.
     * @param shapesArray array with some shapes inside
     * @return Shape2D object with the largest area
     */
    public static Shape2D findLargestArea( Shape2D[] shapesArray )
    {
        double largestArea;

        //find the maximum area among the objects in the array
        largestArea = 0;
        for(int shapeCounter = 0; shapeCounter < shapesArray.length; shapeCounter++ )
        {
            if( shapesArray[shapeCounter].calculateArea() > largestArea)
            {
                largestArea = shapesArray[shapeCounter].calculateArea();
            }
        }

        //take and return the first shape with the maximum area
        for(int shapeCounter = 0; shapeCounter < shapesArray.length; shapeCounter++)
        {
            if( shapesArray[shapeCounter].calculateArea() == largestArea)
            {
                return shapesArray[shapeCounter];
            }
        }
        return null;
    }

    /**
     * Finds the Shape2D object with the longest perimeter and returns it.
     * @param shapesArray array with some shapes inside
     * @return Shape2D object with the longest perimeter
     */
    public static Shape2D findLongestPerimeter( Shape2D[] shapesArray )
    {
        double longestPerimeter;

        longestPerimeter = 0;
        for(int shapeCounter = 0; shapeCounter < shapesArray.length; shapeCounter++ )
        {
            if( shapesArray[shapeCounter].calculatePerimeter() > longestPerimeter)
            {
                longestPerimeter = shapesArray[shapeCounter].calculatePerimeter();
            }
        }

        for(int shapeCounter = 0; shapeCounter < shapesArray.length; shapeCounter++)
        {
            if( shapesArray[shapeCounter].calculatePerimeter() == longestPerimeter)
            {
                return shapesArray[shapeCounter];
            }
        }
        return null;

    }
    
}
