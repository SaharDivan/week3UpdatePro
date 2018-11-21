package w3pExe1;


public class Screen {

    public String displayCustomerName(Costumer costumer){
        String name="This seat is empty";

        if(costumer.getCategory().isEmpty() ||costumer.getName().isEmpty() ){

            name="";
        }

        if(costumer.getCategory().equalsIgnoreCase("Business")){

             name=costumer.getName().toUpperCase();
        }

        if(costumer.getCategory().equalsIgnoreCase("Economy")){

             name=costumer.getName().toLowerCase();
        }


        System.out.println(name);
        return name;
    }



}
