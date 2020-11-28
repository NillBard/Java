import java.util.Scanner;

public class Lab1 extends Point3d {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите по очереди координаты для первой точки: " + "\n");
        double a = in.nextInt();
        double b = in.nextInt();
        double c = in.nextInt();
        System.out.print("Введите по очереди координаты для второй точки: " + "\n");
        double a1 = in.nextInt();
        double b1 = in.nextInt();
        double c1 = in.nextInt();
        System.out.print("Введите по очереди координаты для третьей точки: " + "\n");
        double a2 = in.nextInt();
        double b2 = in.nextInt();
        double c2 = in.nextInt();
        Point3d Point = new Point3d(a,b,c);
        Point3d Point1 = new Point3d(a1,b1,c1);
        Point3d Point2 = new Point3d(a2,b2,c2);

        Point.setX(a);
        Point1.setX(a1);
        Point2.setZ(a2);

        Point.setY(b);
        Point1.setY(b1);
        Point2.setY(b2);

        Point.setZ(c);
        Point1.setZ(c1);
        Point2.setZ(c2);

        in.close();                                             //Останавливаем работу Scanner

        if(compare(Point, Point1) || compare(Point1, Point2) || compare(Point, Point2) || existance(Point, Point1, Point2) )                              //Сравниваем координаты точек
            System.out.println("Точки имеют одинаковые координаты или треугольник не существует");
        else {
            System.out.println("Площадь треугольника равна = 1" + Lab1.Area(Point, Point1, Point2));
        }
    }
    public static double Area(Point3d first, Point3d second, Point3d third){
        double lenght1 = distanceTo(first, second), lenght2 = distanceTo(first, third), lenght3 = distanceTo(second, third);
        double per = (lenght1 + lenght2 + lenght3) / 2;
        return Math.sqrt(per * (per - lenght1) * (per - lenght2) * (per - lenght3));
    }

    public static boolean existance (Point3d first, Point3d second, Point3d third){
        if (distanceTo(first, second)>distanceTo(first, third)+distanceTo(second, third)) return false;
        if (distanceTo(third, second)>distanceTo(first, third)+distanceTo(first, second)) return false;
        if (distanceTo(first, third)>distanceTo(first, second)+distanceTo(second, third)) return false;
            else return true;
    }
}
