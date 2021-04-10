package Figures;

public class Hexagon extends TwoDShapes implements Shapes{

    private double side;
    private double howManySides;
    private String Style;

    public Hexagon() {
        super();
    }

    public Hexagon(double side, double howManySides, String Style) {
        super(side, "Ромб");
        this.side = side;
        this.howManySides = howManySides;
        this.Style = Style;
    }

    public Hexagon(double side, double howManySides) {
        super(side, "Ромб");
        this.side = side;
        this.howManySides = howManySides;
        this.Style = "Закрашеный";
    }


    @Override
    public void showDim() {

        System.out.println("Кол-во сторон и ширина - " + howManySides+ " и " + side);

    }

    @Override
    public double area() {
        return howManySides*side*side/(4 * Math.tan(Math.toRadians(180/howManySides)));
    }
}
