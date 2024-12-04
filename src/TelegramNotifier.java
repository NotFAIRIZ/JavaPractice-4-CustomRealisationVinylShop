public class TelegramNotifier implements Observer {

    private String userID;

    public TelegramNotifier(String userID) {
        this.userID = userID;
    }

    @Override
    public void notify(SaleAlert alert) {
        System.out.println("Telegram notification to user: " + "'" + userID + "'" + " \nnotification: " + alert);
        System.out.println();
    }

}
