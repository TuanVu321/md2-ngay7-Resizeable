public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println(circle);
        circle.resize(200);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle(1,2);
        System.out.println(rectangle);
        rectangle.resize(200);
        System.out.println(rectangle);
        Square square = new Square(5);
        System.out.println(square);
        square.resize(200);
        System.out.println(square);
    }
}
