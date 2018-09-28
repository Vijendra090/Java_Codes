
class Operation{
    int square(int n){
        return n*n;
    }
}

class Circle{
    Operation op;   //aggregation
    double pi=3.14;

    double area(int radius){
        op = new Operation();
        int rsquare= op.square(radius);
        return pi*rsquare;
    }
    public static void main(String args[]){
        Circle c = new Circle();
        double area_of_circle = c.area(5);
        System.out.println("Area of circle :"+area_of_circle);
    }
}
