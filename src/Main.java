class Main {

    public static void main(String[] args) {

        ShapeCalculator shapeCalculator = new ShapeCalculator();
        LineCalc lineCalc = new LineCalc();

        GeometricShape rectangle = new Rectangle(2,2);
        GeometricShape circle = new Circle(2);
        Shape3D ball = new Ball(3);
        Shape3D cube = new Cube(4);
        Shape2D line = new Line2D(3,4,0,0);

        //pole prostokąta:
        System.out.println(shapeCalculator.rectangleArea((Rectangle) rectangle));
        //pole koła:
        System.out.println(shapeCalculator.circleArea((Circle) circle));
        //objętość kuli:
        System.out.println(shapeCalculator.ballVolume((Ball) ball));
        //objętość sześcianu:
        System.out.println(shapeCalculator.cubeVolume((Cube) cube));
        //długość odcinka:
        System.out.println(lineCalc.lineLength((Line2D) line));


    }
}