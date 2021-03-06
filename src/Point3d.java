import java.util.Objects;
public class Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;
    public Point3d ( double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    public Point3d () {
        this(0, 0,0);
    }
    public double getX () {
        return xCoord;
    }
    public double getY () {
        return yCoord;
    }

    public double getZ () {
        return zCoord;
    }
    public void setX ( double val) {
        xCoord = val;
    }
    public void setY ( double val) {
        yCoord = val;
    }

    public void setZ ( double val) {
        zCoord = val;
    }

    public boolean Equals( Point3d object) {
        return Objects.equals(this.xCoord, object.xCoord);
    }
    public Double distanceTo(Point3d object) {
        return Math.floor(Math.sqrt(Math.pow(object.xCoord - this.xCoord, 2) + Math.pow(object.yCoord - this.yCoord, 2) + Math.pow(object.zCoord - this.zCoord, 2)) * 100)/100;
    }
}
