// Interface EmailSender
 interface EmailSender {
    void sendEmail();
}

// Interface Programmer
 interface Programmer {
    void writeCode();
}

// Interface Salesperson
 interface Salesperson {
    void sellProduct();
}

// Lớp nvvanphong kế thừa interface EmailSend
 class vanphong implements EmailSender {
    private String name;

    public vanphong(String name) {
        this.name = name;
    }

    @Override
    public void sendEmail() {
        System.out.println(name + " is sending an email.");
    }
}

// Lớp nvkythuat kế thừa interface Programmer
 class kythuat implements Programmer {
    private String name;

    public kythuat(String name) {
        this.name = name;
    }

    @Override
    public void writeCode() {
        System.out.println(name + " is writing code.");
    }
}

// Lớp SalesEmployee kế thừa interface Salesperson
 class SalesEmployee implements Salesperson {
    private String name;

    public SalesEmployee(String name) {
        this.name = name;
    }

    @Override
    public void sellProduct() {
        System.out.println(name + " is selling a product.");
    }
}

// Lớp Main để thực thi chương trình
public class index1 {
    public static void main(String[] args) {
        // Tạo đối tượng nhân viên
        vanphong officeEmp = new vanphong("Alice");
        kythuat techEmp = new kythuat("Bob");
        SalesEmployee salesEmp = new SalesEmployee("Charlie");

        // Sử dụng các chức năng của nhân viên
        officeEmp.sendEmail();      // Alice is sending an email.
        techEmp.writeCode();       // Bob is writing code.
        salesEmp.sellProduct();    // Charlie is selling a product.
    }
}

