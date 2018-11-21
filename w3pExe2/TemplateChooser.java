package w3pExe2;

import w3pExe1.Costumer;

public class TemplateChooser {

    public String chooseTemplate(Costumer costumer) {
        String name = costumer.getName().trim();

        if (name.contains("Hokopoko")) {
            return "Privileged";
        }
        if (name.startsWith("Mr.")) {
            return "Man";
        }
        if (name.startsWith("Ms.") || name.startsWith("Mrs.")) {
            return "Woman";
        }
        return "Default";
    }
}
