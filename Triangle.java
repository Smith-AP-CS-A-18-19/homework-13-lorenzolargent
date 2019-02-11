import java.awt.geom.Rectangle2D;
/* All SmithShape triangles have one edge that is on
 * the horizontal and are defined by the angle (in degrees)
 * of the lower left corner.
 */
public class Triangle implements SmithShape{
  private int x;
  private int y;
  private int w;
  private int h;
  private double a;
/* The constructor for the Triangle object should be as below.
 * You may change the names of the parameters, but their order
 * must remain the same for the assignment to be scored
 * correctly
 */
public Triangle(int x1, int y1, int w1, int h1, double a1){
  x=x1;
  y=y1;
  w=w1;
  h=h1;
  a=a1;
}

// public Triangle(int x, int y, int width, int height, double angle)

/* You will need to add a getAngle() method that returns
 * the angle of the triangle
 */
public int getX(){
  return x;
}

public int getY(){
  return y;
}

public int getWidth(){
  return w;
}

public int getHeight(){
  return h;
}

public double getArea(){
  return w*h/2;
}

public double getAngle(){
  return a;
}
/* Add the method toSquare() to the Triangle class. This creates
 * and returns a new Rectangle2D object. The x and y of the new
 * Rectangle should be the same as the Triangle. The width and
 * height of the Rectangle2D should be the same (it is a square)
 * and the area should be equal to the area of the Triangle
 */
public Rectangle2D toSquare(){
  Rectangle2D r1 = new Rectangle2D.Double();
  double l2 = Math.sqrt(getArea());
  r1.setRect(x,y,l2,l2);
  return r1;
}
/* Override the method toString(). It should return
 * the String:
 * Width: width
 * Height: height
 * Angle: angle
 * Remember that to insert a new line into a String,
 * use \n
 */
 @Override
 public String toString(){
   String xx = "Width: " + w + "\nHeight: " + h + "\nAngle: " + a;
   return xx;
 }
}
