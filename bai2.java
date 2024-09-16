public class bai2 {
    public static void main(String[] args) {

        Rectangle1 myRectangle = new Rectangle1(5, 10);
        System.out.println("Chu vi hình chữ nhật: " + myRectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật: " + myRectangle.getArea());
    }
}
class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }


    public double getArea() {
        return this.width * this.height;
    }
}
