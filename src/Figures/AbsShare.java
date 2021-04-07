package Figures;

class AbsShare {
    public static void main(String[] args) {
        TwoDShapes shapes[] = new TwoDShapes[7];
        shapes[0] = new Triangle(8.0, 12.0, "контурный");
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle(7);
        shapes[4] = new Circle(3);
        shapes[5] = new Circle(4, "В полоску");
        shapes[6] = new Rectangle();

        for (int i = 0; i < shapes.length; i++) {

            System.out.println("Объект - " + shapes[i].getName());
            shapes[i].showDim();
            System.out.println("Площадь - " + shapes[i].area());


        }
    }
}
