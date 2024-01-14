//make this class a subclass of customer
public class RegularCustomer extends Customer {
    static Customer cus = new RegularCustomer();
    public static Customer getCustomer(){
        return cus;
    }
    @Override
    public String createMail() {
        return "Regular Customer Mail";
    }
    @Override
    public String createBrochure() {
        return "Regular Customer Brochure";
    }
    
}
