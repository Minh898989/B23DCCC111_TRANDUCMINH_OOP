
interface Payment {
    void processPayment(double amount);
}

class CardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
     
        System.out.println("Thanh toán bằng thẻ thành công: " + amount + " VND");
    }
}

class EWalletPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        
        System.out.println("Thanh toán bằng ví điện tử thành công: " + amount + " VND");
    }
}

class CashPayment implements Payment {
    @Override
    public void processPayment(double amount) {
      
        System.out.println("Thanh toán bằng tiền mặt thành công: " + amount + " VND");
    }
}
public class b01 {
    public static void main(String[] args) {
        Payment cardPayment = new CardPayment();
        Payment eWalletPayment = new EWalletPayment();
        Payment cashPayment = new CashPayment();
        cardPayment.processPayment(100000);
        eWalletPayment.processPayment(50000);
        cashPayment.processPayment(20000);
    }
}
