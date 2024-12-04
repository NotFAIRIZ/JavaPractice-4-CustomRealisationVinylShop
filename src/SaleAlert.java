import java.time.LocalDate;

public class SaleAlert {
    private NotificationType notificationType;
    private String message;
    private int discountPracentage;
    private LocalDate dateWhenSended;
    private String discountEndDate;
    private String vinylRecordName;

    public SaleAlert(NotificationType notificationType, String message, int discountPracentage,
                     LocalDate dateWhenSended, String discountEndDate, String vinylRecordName) {
        this.notificationType = notificationType;
        this.message = message;
        this.discountPracentage = discountPracentage;
        this.dateWhenSended = dateWhenSended;
        this.discountEndDate = discountEndDate;
        this.vinylRecordName = vinylRecordName;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public String getMessage() {
        return message;
    }

    public int getDiscountPracentage() {
        return discountPracentage;
    }

    public LocalDate getDateWhenSended() {
        return dateWhenSended;
    }

    public String getDiscountEndDate() {
        return discountEndDate;
    }

    public String getVinylRecordName() {
        return vinylRecordName;
    }

    @Override
    public String toString() {
        return "SaleAlert{" +
                "notificationType=" + notificationType +
                ", message='" + message + '\'' +
                ", discountPracentage=" + discountPracentage +
                ", dateWhenSended=" + dateWhenSended +
                ", discountEndDate='" + discountEndDate + '\'' +
                ", vinylRecordName='" + vinylRecordName + '\'' +
                '}';
    }
}
