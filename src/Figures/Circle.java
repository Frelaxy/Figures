package Figures;

public class Circle extends TwoDShapes implements Shapes{

    private double radius;
    private String style;

    public Circle() {
        super();
    }

    public Circle(int radius) {
        super(radius*2,radius*2, "Круг");
        this.radius = radius;
        this.style = "Закрашенный";
    }

    public Circle(double radius, String style) {
        super(radius*2,radius*2, "Круг");
        this.radius = radius;
        this.style = style;
    }

    @Override
    public double area() {
        return radius * radius * 3.14;
    }

    @Override
    public void showDim() {
        System.out.println("Круг " + style);
    }
}
