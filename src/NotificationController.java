import java.util.ArrayList;
import java.util.List;
public class NotificationController extends Observable {
    private List<SaleAlert> alertHistory = new ArrayList<>();

    public NotificationController(){

    }
    public void addAlert(SaleAlert alert) {
        alertHistory.add(alert);
    }

    public void informAlerts() {
        for (SaleAlert alert : alertHistory) {
            notifyObservers(alert);
        }
    }
}