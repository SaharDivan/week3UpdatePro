package w3pExe1;

public class ScreenApplication {


    public static void main(String[] args) {


        Costumer costumerBusiness =new Costumer("Mona Lisa");
        Costumer costumerEconomy =new Costumer("Sara Smith");

        costumerBusiness.setCategory("Business");
        costumerEconomy.setCategory("Economy");

        Screen screen=new Screen();

        screen.displayCustomerName(costumerBusiness);
        screen.displayCustomerName(costumerEconomy);

    }
}
