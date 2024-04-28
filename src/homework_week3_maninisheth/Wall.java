package homework_week3_maninisheth;

/**
 * Write a class with the name Wall. The class needs two fields (instance variables) with name width
 * and height of type double.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg
 * constructor). The second constructor has parameters width and height of type double and it needs to
 * initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the
 * height parameter is less than 0 it needs to set the height field value to 0.
 */
public class Wall {
    public static void main(String[] args) {
        Wall wall = new Wall (5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
    public double width;
    public double height;

    // First constructor (no-arg constructor)
    public Wall() {
        // Default values for width and height will be 0.0
    }

    // Second constructor with parameters
    public Wall(double width, double height) {
        // Setting width and height with validation
        setWidth(width);
        setHeight(height);
    }

    //1  Method to get the width
    public double getWidth() {
        return width;
    }

    //2  Method to get the height
    public double getHeight() {
        return height;
    }

    //3  Method to set the width
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    //4  Method to set the height
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // 5 Method to calculate the area of the wall
    public double getArea() {
        return width * height;
    }
}

