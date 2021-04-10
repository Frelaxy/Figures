package Figures;

public class Triangle extends TwoDShapes{
    private String style;

    Triangle(){
        super();
    }

    public Triangle(double width, double height, String style) {
        super(width, height,"треугольник");
        this.style = style;
    }

    public Triangle(double x) {
        super(x, "треугольник");
        this.style = "закрашенный";
    }

    public Triangle(Triangle ob) {
        super(ob);
        this.style = ob.style;
    }

    @Override
    public double area() {
        return getWidth() * getHeight() / 2;
    }

    @Override
    public void showDim() {
        System.out.println("Треугольник " + style);
    }
}
