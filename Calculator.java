
public class Calculator {
    public double slope(double x1 , double x2 , double y1 , double y2){
        // x1 , y1 are coordinates of the first point
        // x2 , y2 are coordinates of the second point
        double y_diff = y2 - y1;
        // y_diff represents y coordinate's difference
        double x_diff = x2 - x1;
        // x_diff represents x coordinate's difference
        // the slope is y_diff / x_diff
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
    public void display(){
        // quadratic formula
        int a = 1 , b = 5 , c = 6;
        // a is the coefficient of X^2
        // b is the coefficient of X
        // c is the coefficient of 1
        System.out.println("QUADRATIC FORMULA");
        System.out.println("The solutions for " + a + " x^2 + " + b + "x +" + c +" are " + quadratic_formula_adding(a , b ,c) + " and " + quadratic_formula_sub(a , b , c));


        // slope formula
        int x1 = 0 , y1 = 0 , x2 = 2 , y2 = 3;
        // (x1 , y1) are the coordinate of the first point
        // (x2 , y2) are the coordinate of the second point
        System.out.println("\nSLOPE FORMULA");
        System.out.println("A line connecting the points (" + x1 +", " + y1 +") and (" +x2 +", " + y2 +") has a slope of "+ slope(x1 , x2 , y1 ,y2));


        // midpoint formula
        x1 = 0;
        y1 = 0;
        x2 = 2;
        y2 = 3;
        // (x1 , y1) are the coordinate of the first point
        // (x2 , y2) are the coordinate of the second point
        System.out.println("\nMIDPOINT FORMULA");
        System.out.println("The midpoint between ("+ x1 +", " + y1 +") and (" + x2 +", " +y2 +") " + "is " + "(" + mid_point_X_cordindate(x1 , x2) + ", "+ mid_point_Y_cordindate(y1 , y2) + ")");


        // arithmetic
        double f  = 1, diff  = 1, k = 5;
        // f is the first term of the arithmetic series
        // diff is the difference between terms
        // k is the number of terms in the series
        System.out.println("\nSUM OF AN ARITHMETIC SERIES");
        System.out.println("The sum of the first " + (int)k + " terms of an arithmetic series that starts with " + f + " and increases by " + diff + " is " + arithmetic(f , diff , k));


        // geometric sum
        double g1 = 3;
        k = 3;
        double r = 2;
        // g1 is the first term of the geometric series
        // r is the rate of change between terms
        // k is the number of cases we will calculate sum
        System.out.println("\nSUM OF A FINITE GEOMETRIC SERIES");
        System.out.println("The sum of the first " + (int)k + " terms of an geometric series that starts with " + g1 + " and increases by a rate of " + r + " is " + geometric(g1 , r ,k));
    }
}
