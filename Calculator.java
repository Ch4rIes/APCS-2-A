public class Calculator {

    public double slope(double x1 , double x2 , double y1 , double y2){
        // y_diff represents y coordinate's difference
        // x_diff represents x coordinate's difference
        // the slope is y_diff / x_diff
        double y_diff = y2 - y1;
        double x_diff = x2 - x1;
        return y_diff / x_diff;
    }

    public double quadratic_formula_adding(double a , double b , double c){
        // a is the coefficient of X^2
        // b is the coefficient of X
        // c is the coefficient of 1
        // to calculate the roots we use the quadratic formula
        double r1 = (((-b + Math.sqrt(b * b - 4 * a * c)) / 2 / a));
        return r1;
    }
    public double quadratic_formula_sub(double a , double b , double c){
        // a is the coefficient of X^2
        // b is the coefficient of X
        // c is the coefficient of 1
        // to calculate the roots we use the quadratic formula
        double r2 = (((-b - Math.sqrt(b * b - 4 * a * c)) / 2 / a));
        return r2;
    }
    public double mid_point_X_cordindate(double x1 , double x2){
        // (x1 , y1) are the coordinate of the first point
        // (x2 , y2) are the coordinate of the second point
        double mid_x = (x2 - x1) / 2 + x1;
        // mid_x is the x coordinate of the midpoint
        return mid_x;
    }
    public double mid_point_Y_cordindate(double y1 , double y2){
        // (x1 , y1) are the coordinate of the first point
        // (x2 , y2) are the coordinate of the second point
        double mid_y = (y2 - y1) / 2 + y1;
        // mid_y is the y coordinate of the midpoint
        return mid_y;
    }
    public double arithmetic(double f , double diff , double k){
        // f is the first term of the arithmetic series
        // diff is the difference between terms
        // k is the number of terms in the series
        double sum = ((f + f + (k - 1) * diff) * k / 2);
        // the "sum" is the sum of the arithmetic series
        return sum;
    }
    public double geometric(double g1 , double r , double k){
        // g1 is the first term of the geometric series
        // r is the rate of change between terms
        // k is the number of cases we will calculate sum
        double sum = g1 * (1 - Math.pow(r , k)) / (1 - r);
        // the "sum" is the sum of the geometric series
        return sum;
    }
    public void display(double a , double b , double c , double mpx1 , double mpx2 , double mpy1 , double mpy2 , double ar1 , double ardiff , double ark , double gf , double gr , double gk){
        // quadratic formula
        System.out.println("QUADRATIC FORMULA");
        System.out.println("The solutions for " + a + " x^2 + " + b + "x +" + c +" are " + quadratic_formula_adding(a , b ,c) + " and " + quadratic_formula_sub(a , b , c));
        // slope formula
        System.out.println("SLOPE FORMULA");
        System.out.println("A line connecting the points (" + mpx1 +", " + mpy1 +") and (" + mpx2 +", " + mpy2 +") has a slope of "+ slope(mpx1 , mpx2 , mpy1 ,mpy2));
        // midpoint formula
        System.out.println("MIDPOINT FORMULA");
        System.out.println("The midpoint between ("+ mpx1 +", " + mpy1 +") and (" + mpx2 +", " +mpy2 +") " + "is " + "(" + mid_point_X_cordindate(mpx1 , mpx2) + ", "+ mid_point_Y_cordindate(mpy1 , mpy2) + ")");
        // arithmetic
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.println("The sum of the first 5 terms of an arithmetic series that starts with " + ar1 + " and increases by " + ardiff + " is " + arithmetic(ar1 , ardiff , ark));
        // geometric sum
        System.out.println("SUM OF AN GEOMETRIC SERIES");
        System.out.println("The sum of the first " + gk + " terms of an geometric series that starts with " + gf + " and increases by a rate of " + gr + " is " + geometric(gf , gr ,gk));
    }
}
