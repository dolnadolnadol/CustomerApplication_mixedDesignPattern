public class CustomerFactory {
    public static Customer createCustomer(String customer){
        if(customer.equals("Regular")){
            return RegularCustomer.getCustomer();
        }else if(customer.equals("Delinquent")){
            return DelinquentCustomer.getCustomer();
        }else if(customer.equals("Mountain")){
            return MountainCustomer.getCustomer();
        }else{
            return null;
        }
    }
}
