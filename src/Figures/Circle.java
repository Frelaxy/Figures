package Figures;

public class Circle extends TwoDShapes{

    private double radius;
    private String style;

    public Circle() {
        super();
        this.radius = 0.0;
        this.style = "none";
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
    double area() {
        return radius * radius * 3.14;
    }

    @Override
    void showDim() {
        System.out.println("Круг " + style);;
    }
}
