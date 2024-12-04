public class PhoneNotifier implements Observer {
    private String phoneNumber;

    public PhoneNotifier(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(SaleAlert alert) {
        System.out.println("Notification to phone number: " + "'" + phoneNumber + "'" + " \nnotification: " + alert);
        System.out.println();
    }
}