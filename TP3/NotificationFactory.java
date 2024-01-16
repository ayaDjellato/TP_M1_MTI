public class NotificationFactory {
    
    public Notification getNotification(String op){


        if(op == "Email"){
            return new Emailnotif();
        }else if(op == "SMS"){
            return new Smsnotif();
        }else if(op == "Message"){
            return null;
        }

       return null;
    }
    
}
