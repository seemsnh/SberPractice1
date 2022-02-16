public class Circle {
    private double radius;
    private String color;

    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double Area(){
        return radius*radius* Math.PI;
    }

    public double Perimeter(){
        return 2*Math.PI*radius;
    }

    public String toString(){
        return String.format("радиус %f, цвет %s, площадь %f, периметр %f", radius, color, Area(), Perimeter());
    }
}
