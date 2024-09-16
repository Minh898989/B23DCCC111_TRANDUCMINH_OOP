public class bai3 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);

        System.out.println("Bán kính: " + circle.getRadius());
        System.out.println("Chu vi: " + circle.getPerimeter());
        System.out.println("Diện tích: " + circle.getArea());
    }
}
