package Figures;

public class Rectangle extends TwoDShapes {
    public Rectangle() {
        super();
    }

    public Rectangle(double width, double height) {
        super(width, height,"Прямоугольник");
    }

    public Rectangle(double x) {
        super(x, "Прямоугольник");
    }

    public Rectangle(TwoDShapes ob) {
        super(ob);
    }

    boolean isSquare() {
        if (getWidth() == getHeight()) return true;
        else return false;
    }
    @Override
    double area() {
        return getHeight() * getWidth();
    }
}
