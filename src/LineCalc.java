import static java.lang.Math.*;

class LineCalc extends ShapeCalculator {

    double lineLength(Line2D line) {
        return abs(sqrt(pow(line.getX1() - line.getX0(), 2) + pow(line.getY1() - line.getY0(), 2)));
    }

}