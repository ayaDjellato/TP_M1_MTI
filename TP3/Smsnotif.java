public class Smsnotif implements Notification{

    String txt = "SMS: please resubscribe";
    @Override
    public String getMessage() {
        
        return txt;
    }
}
