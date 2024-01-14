public class Sent {
    public static String sentMail(Customer customer){
        return customer.createMail();
    }
    public static String sentBrochure(Customer customer){
        return customer.createBrochure();
    }
}