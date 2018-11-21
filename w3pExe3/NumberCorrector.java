package w3pExe3;

public class NumberCorrector {

    public Integer correct(Double messedUp){

        Double floored=Math.floor(messedUp);
        Double corrected=Math.abs(floored);

        return corrected.intValue();

    }
}
