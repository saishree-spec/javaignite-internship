package day15assignments;
interface NotificationService {
    void sendMessage();
}

class EmailNotification implements NotificationService {
    public void sendMessage() {
        System.out.println("Email Notification Sent");
    }
}

class SMSNotification implements NotificationService {
    
    public void sendMessage() {
        System.out.println("SMS Notification Sent");
    }
}

class OrderService {
    private NotificationService notificationService;

    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void placeOrder() {
        System.out.println("Order Confirmed");
        notificationService.sendMessage();
    }
}

public class Main {
    public static void main(String[] args) {

        NotificationService email = new EmailNotification();
        OrderService order1 = new OrderService(email);
        order1.placeOrder();

        System.out.println();
        NotificationService sms = new SMSNotification();
        OrderService order2 = new OrderService(sms);
        order2.placeOrder();
    }
}