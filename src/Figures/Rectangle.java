package Figures;

public class Rectangle extends TwoDShapes implements Shapes {

    public Rectangle() {
        super();
    }

    public Rectangle(double width, double height) {
        super(width, height, "Прямоугольник");
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
    public double area() {
        return getHeight() * getWidth();
    }

    @Override
    public void showDim() {
        System.out.println("Ширина и высота - " + getWidth() + " и " + getHeight());
    }
}