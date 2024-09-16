public class Circle {
    
        private double radius;
    
        public double getRadius() {
            return radius;
        }
    
        public void setRadius(double radius)   
     {
            if (Common.isValidRadius(radius)) {
                this.radius = radius;
            } else {
                System.out.println("Bán kính phải là số nguyên dương.");
            }
        }
    
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

