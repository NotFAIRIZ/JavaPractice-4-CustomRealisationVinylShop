public class EmailNotifier implements Observer {
    private String uniqueName;

    public EmailNotifier(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    @Override
    public void notify(SaleAlert alert) {
        System.out.println("Mail notification to mail adress:  " + "'" + uniqueName + "'" + " \nnotification: " + alert);
        System.out.println();
    }
}
