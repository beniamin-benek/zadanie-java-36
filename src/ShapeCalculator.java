class ShapeCalculator implements Calc2D, Calc3D {

    @Override
    public double circleArea(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(),2);
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        return rectangle.getA() * rectangle.getB();
    }

    @Override
    public double shapeArea(GeometricShape shape) {
        if (shape instanceof Circle) //jeśli figura jest kolem
            return Math.PI * Math.pow(((Circle) shape).getRadius(),2);
        else //jeśli figura jest prostokątem
            return ((Rectangle)shape).getA() * ((Rectangle)shape).getB();
    }

    @Override
    public double ballVolume(Ball ball) {
        return (double) 4/3 * Math.PI * Math.pow(ball.getRadius(),3);
    }

    @Override
    public double cubeVolume(Cube cube) {
        return Math.pow(cube.getA(),3);
    }

    @Override
    public double volume(Shape3D shape) {
        if (shape instanceof Ball) //jeśli figura jest kulą
            return (double) 4/3 * Math.PI * Math.pow(((Ball) shape).getRadius(),3);
        else //jeśli figura jest sześcianem
            return Math.pow(((Cube)shape).getA(),3);
    }
}