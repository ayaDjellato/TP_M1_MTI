public class Main{
        public static void main(String[] args){
        NotificationFactory factory = new NotificationFactory();
        Notification notification = factory.getNotification("Email");


         System.out.println("-----------------------------------------------\n");
         System.out.println("your message :  " + notification.getMessage());
         System.out.println("\n-----------------------------------------------");

        }
     }
