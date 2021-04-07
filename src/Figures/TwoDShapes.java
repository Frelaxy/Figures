package Figures;

abstract class TwoDShapes {
    private double width;
    private double height;
    private String name;

    public TwoDShapes() {
        width = height = 0.0;
        name = "none";
    }

    public TwoDShapes(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public TwoDShapes(double x, String name) {
        this.height = this.width = x;
        this.name = name;
    }
    public TwoDShapes(TwoDShapes ob){
        this.height = ob.height;
        this.width = ob.width;
        this.name = ob.name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void showDim(){
        System.out.println("Ширина и высота - " + width + " и " + height);
    }

    abstract double area();
}
