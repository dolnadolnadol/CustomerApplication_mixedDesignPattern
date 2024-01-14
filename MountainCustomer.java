//make this class a subclass of customer
public class MountainCustomer extends Customer {
    static Customer cus = new MountainCustomer();
    public static Customer getCustomer(){
        return cus;
    }
    @Override
    public String createMail() {
        return "Mountain Customer Mail";
    }
    @Override
    public String createBrochure() {
        return "Mountain Customer Brochure";
    }
}
