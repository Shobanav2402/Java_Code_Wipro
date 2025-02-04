abstract class Shape {
    abstract void draw();
}
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
class ShapedrawingApplication {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(), new Rectangle(), new Circle(), new Rectangle() };
        System.out.println("--- Shape Drawing ---");
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
