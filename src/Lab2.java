import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double z1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double z2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double z3 = sc.nextDouble();
        Point3d p1 = new Point3d(x1, y1, z1);
        Point3d p2 = new Point3d(x2, y2, z2);
        Point3d p3 = new Point3d(x3, y3, z3);
        if (p1.Equals(p2) == false && p2.Equals(p3) == false && p3.Equals(p1) == false) {
            System.out.println("Площадь треугольника: " + computeArea(p1, p2, p3));
        } else {
            System.out.println("Точки имеют одинаковые координаты");
        }


    }
    public static Double computeArea(Point3d object1, Point3d object2, Point3d object3) {
        double a = object1.distanceTo(object2);
        double b = object2.distanceTo(object3);
        double c = object3.distanceTo(object1);
        double p = (a + b + c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
