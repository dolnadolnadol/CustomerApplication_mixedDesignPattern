//make this class a subclass of customer
public class DelinquentCustomer extends Customer {
    static Customer cus = new DelinquentCustomer();
    public static Customer getCustomer(){
        return cus;
    }
    @Override
    public String createMail() {
        return "Delinquent Customer Mail";
    }
    @Override
    public String createBrochure() {
        return "Delinquent Customer Brochure";
    }
}
