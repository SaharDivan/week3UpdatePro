package w3pExe2;

import w3pExe1.Costumer;

public class InsuranceApplication {

    public static void main(String[] args) {

        Costumer costumer1=new Costumer("Mr. John Smith");
        Costumer costumer2=new Costumer("Ms. Ann Smith ");
        Costumer costumer3=new Costumer("Mr. John Hokopoko ");
        Costumer costumer4=new Costumer("John Smith ");
        TemplateChooser templateChooser=new TemplateChooser();
        String template1=templateChooser.chooseTemplate(costumer1);
        String template2=templateChooser.chooseTemplate(costumer2);
        String template3=templateChooser.chooseTemplate(costumer3);
        String template4=templateChooser.chooseTemplate(costumer4);
        System.out.println(template1);
        System.out.println(template2);
        System.out.println(template3);
        System.out.println(template4);

    }
}
