package project;

//Interface: Drawable
interface Drawable {
 void drawingColor();
 void thickness();
}

//Interface: Fillable
interface Fillable {
 void fillingColor();
 void size();
}

//Class: Line
class Line implements Drawable, Fillable {
 public void drawingColor() {
     System.out.println("Line drawing color: Black");
 }

 public void thickness() {
     System.out.println("Line thickness: 2px");
 }

 public void fillingColor() {
     System.out.println("Line filling color: None (not applicable)");
 }

 public void size() {
     System.out.println("Line size: Length = 100 units");
 }
}

//Class: Circle
class Circle implements Drawable, Fillable {
 public void drawingColor() {
     System.out.println("Circle drawing color: Blue");
 }

 public void thickness() {
     System.out.println("Circle thickness: 3px");
 }

 public void fillingColor() {
     System.out.println("Circle filling color: Yellow");
 }

 public void size() {
     System.out.println("Circle size: Radius = 50 units");
 }
}

//Class: Square
class Square implements Drawable, Fillable {
 public void drawingColor() {
     System.out.println("Square drawing color: Green");
 }

 public void thickness() {
     System.out.println("Square thickness: 4px");
 }

 public void fillingColor() {
     System.out.println("Square filling color: Red");
 }

 public void size() {
     System.out.println("Square size: Side = 40 units");
 }
}

//Main class
public class InterfaceExample {
 public static void main(String[] args) {
     System.out.println("--- Line ---");
     Line line = new Line();
     line.drawingColor();
     line.thickness();
     line.fillingColor();
     line.size();

     System.out.println("\n--- Circle ---");
     Circle circle = new Circle();
     circle.drawingColor();
     circle.thickness();
     circle.fillingColor();
     circle.size();

     System.out.println("\n--- Square ---");
     Square square = new Square();
     square.drawingColor();
     square.thickness();
     square.fillingColor();
     square.size();
 }
}
/*--- Line ---
Line drawing color: Black
Line thickness: 2px
Line filling color: None (not applicable)
Line size: Length = 100 units

--- Circle ---
Circle drawing color: Blue
Circle thickness: 3px
Circle filling color: Yellow
Circle size: Radius = 50 units

--- Square ---
Square drawing color: Green
Square thickness: 4px
Square filling color: Red
Square size: Side = 40 units*/