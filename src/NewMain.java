class NewMain {

    public static void main(String[] args) {

        ShapeCalculator shapeCalculator = new ShapeCalculator();
        LineCalc lineCalc = new LineCalc();

        Shape[] shapes = new Shape[5];

        shapes[0] = new Line2D(4,4,-2,-5);
        shapes[1] = new Rectangle(3,5);
        shapes[2] = new Cube(4);
        shapes[3] = new Circle(3);
        shapes[4] = new Ball(3);

        double lineLength;
        double rectangleArea;
        double circleArea;
        double cubeVolume;
        double ballVolume;

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Line2D) {
                lineLength = lineCalc.lineLength((Line2D) shapes[i]);
                System.out.println("Odcinek wyznaczony przez współrzędne " + shapes[i].toString() + " ma długość " + lineLength + ".");
            }
            if (shapes[i] instanceof Rectangle) {
                rectangleArea = shapeCalculator.shapeArea((GeometricShape) shapes[i]);
                System.out.println("Prostokąt o długościach boków " + shapes[i].toString() + " ma pole, które wynosi " + rectangleArea + ".");
            }
            if (shapes[i] instanceof Circle) {
                circleArea = shapeCalculator.shapeArea((GeometricShape) shapes[i]);
                System.out.println("Okrąg o promieniu równym " + shapes[i].toString() + " ma pole, które wynosi " + circleArea + ".");
            }
            if (shapes[i] instanceof Cube) {
                cubeVolume = shapeCalculator.volume((Shape3D) shapes[i]);
                System.out.println("Sześcian o boku równym " + shapes[i].toString() + " ma objętość, które wynosi " + cubeVolume + ".");
            }
            if (shapes[i] instanceof Ball) {
                ballVolume = shapeCalculator.volume((Shape3D) shapes[i]);
                System.out.println("Kula o promieniu równym " + shapes[i].toString() + " ma objętość, które wynosi " + ballVolume + ".");
            }
        }
    }

}
