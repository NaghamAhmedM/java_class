package ShapeInheritance;

public class App {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();

        r1.setLength(5);
        r1.setWidth(2);

        System.out.println("The Rectangle with Length: " + r1.getLength() + " and Width: " + r1.getWidth());
        System.out.println("Has Area: " + r1.getArea());
        System.out.println("And has Perimeter: " + r1.getParameter());
    }
}
