package project;

class Shape {
    
    
    public int area(int side) {
        return side * side;
    }

    
    public int area(int length, int breadth) {
        return length * breadth;
    }

   
    public int perimeter(int side) {
        return 4 * side;
    }

    
    public int perimeter(int length, int breadth) {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        
        
        int squareSide = 5;
        
       
        int rectLength = 4;
        int rectBreadth = 6;

        // Square
        System.out.println("Square Area: " + shape.area(squareSide));
        System.out.println("Square Perimeter: " + shape.perimeter(squareSide));

        // Rectangle
        System.out.println("Rectangle Area: " + shape.area(rectLength, rectBreadth));
        System.out.println("Rectangle Perimeter: " + shape.perimeter(rectLength, rectBreadth));
    }
}

/*Square Area: 25
Square Perimeter: 20
Rectangle Area: 24
Rectangle Perimeter: 20
*/
