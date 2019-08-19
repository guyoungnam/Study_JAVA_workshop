package workshop07.shape;

import java.util.ArrayList;

public class ShapeTest {
	public static void main(String[] args) {
        ArrayList<Shape> list = new ArrayList<Shape>();
        
        Rectangle r1 = new Rectangle(4,7,5);
        Rectangle r2 = new Rectangle(5,4,6);
        Circle c1 = new Circle(6,6,7);
        Circle c2 = new Circle(7,8,3);
        
        list.add(r1);
        list.add(r2);
        list.add(c1);
        list.add(c2);
        
        System.out.println("구분 \t\t 길이 \t X좌표 \t Y좌표 \t Area \t Circumference");
        
        for(int i = 0; i < list.size(); i++) {
            Shape s = (Shape)list.get(i);
            
            if(s instanceof Rectangle){
                Rectangle r = (Rectangle)s;
                System.out.println("Rectangle \t" + r.getWidth() + "\t" + s.getPoint().getX() + "\t" + s.getPoint().getY() + "\t" + Math.round(s.getArea()) + "\t" + Math.round(s.getCircumference()));
                
            } else if(s instanceof Circle) {
                Circle c = (Circle)s;
                System.out.println("Circle \t\t" + c.getRadius() + "\t" + s.getPoint().getX() + "\t" + s.getPoint().getY() + "\t" + Math.round(s.getArea()) + "\t" + Math.round(s.getCircumference()));
            }
        }
        
        System.out.println("이동 후...");
        
        for(int i = 0; i < list.size(); i++) {
            Shape s = (Shape)list.get(i);
            
            if(s instanceof Rectangle) {
                Rectangle r = (Rectangle)s;
                r.move(10,10);
                System.out.println("Rectangle \t" + r.getWidth() + "\t" + s.getPoint().getX() + "\t" + s.getPoint().getY());
                
            } else if(s instanceof Circle) {
                Circle c = (Circle)s;
                c.move(10,10);
                System.out.println("Circle \t\t" + c.getRadius() + "\t" + s.getPoint().getX() + "\t" + s.getPoint().getY());
            }
        }
    }

}
