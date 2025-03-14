
public class Main {
    public static void main(String[] args) {

        Form form = new Form();
        Triangle triangle1 = new Triangle("red", 10, 5);
        Triangle triangle2 = new Triangle("red", 10, 5);
        Triangle triangle3 = new Triangle("blue", 6, 3);
        Circle circle = new Circle("green", 7);
        Square square = new Square("yellow", 4);

        System.out.println(form);
        System.out.println(triangle1 + " with area: " + triangle1.getArea());
        System.out.println(circle + " with area: " + circle.getArea());
        System.out.println(square + " with area: " + square.getArea());
        System.out.println("triangle1 equals triangle2? " + triangle1.equals(triangle2));
        System.out.println("triangle1 equals triangle3? " + triangle1.equals(triangle3));
        System.out.println("nr de forme instantiate "+form.getter());
    }
}