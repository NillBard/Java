import java.util.Scanner;
public class Point3d extends Point2d {

    static double sqr(double val){
        return val*val;
    }
    private double zCoord;
    public Point3d(double x, double y, double z){
        zCoord = z;
    }

    public double getZ(){
        return zCoord;
    }

    public void setZ(double val){
        zCoord = val;
    }

    public Point3d(){
      this(0.0,0.0,0.0);
    }

    public static boolean compare(Point3d first, Point3d second){
        return first.getX()== second.getX() && first.getZ() == second.getY() && first.getZ() == second.getZ();
    }

    public static double distanceTo(Point3d first, Point3d second){
        double Round = Math.sqrt(sqr(second.getX() - first.getX())+ sqr(second.getY()- first.getY())+sqr(second.getZ()- first.getZ()));
        Round*=100;
        return Round = ((int) Round)/100;

    }

}
