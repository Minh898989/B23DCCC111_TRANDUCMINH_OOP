
    public class Circle1 extends Shape {
        private double radius;
    
        public Circle1(double radius) {
            this.radius = radius;
        }
    
        @Override
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    
        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

