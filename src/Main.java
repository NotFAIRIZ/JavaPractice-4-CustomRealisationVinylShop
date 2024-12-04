import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

        EmailNotifier not1 = new EmailNotifier("testmail@gmail.com");
        PhoneNotifier not2 = new PhoneNotifier("+05012312312");
        TelegramNotifier not4 = new TelegramNotifier("@usertest");

        SaleAlert alert1 = new SaleAlert(NotificationType.SALE, "Black Friday sale!", 75
                , LocalDate.now(), "2024-01-01", "Pink Floyd - The dark side of the moon");

        NotificationController systemController = new NotificationController();

        systemController.addAlert(alert1);

        systemController.subscribe(not1);
        systemController.subscribe(not2);
        systemController.subscribe(not4);

        systemController.informAlerts();
    }
}