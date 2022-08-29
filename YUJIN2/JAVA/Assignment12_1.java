class Shape {}

class Rectangle extends Shape {}

class Circle extends Shape {}

public class Assignment12 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        try {
            casting(r);
        } catch (ClassCastException e) {
            System.out.println("예외 발생");
        }
    }

    static void casting(Shape s) throws ClassCastException {
        Circle c = (Circle) s;
    }
}
