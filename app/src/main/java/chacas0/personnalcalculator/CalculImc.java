package chacas0.personnalcalculator;


import android.widget.TextView;

/**
 * Created by archy on 4/5/17.
 */

public class CalculImc extends Calcul {

    public CalculImc(Someone theOne) {
        super.Calcul(theOne);
    }

    public String calcul_imc() {
        //LE CALCUL
        float valuePoids = theOne.getWeight();
        float valueTaille = theOne.getHeight();
        this.result = valuePoids / (valueTaille * valueTaille);
//        ((TextView) findViewById(R.id.tv_result_calc)).setText(result.toString());
        //LE COMMENTAIRE
        String com = "";
        if (result < 16) {
            com = "Vas au McDo 3 fois par jour!";
        } else if (result < 18.5) {
            com = "Mange un kebab 2 fois par jour!";
        } else if (result < 25) {
            com = "Sale normal!";
        } else if (result < 30) {
            com = "Vive le régime!";
        } else if (result < 35) {
            com = "Régime + Sport recommandés";
        } else if (result < 40) {
            com = "Gros régime + Plein de sport violents... ou le suicide :(";
        } else {
            com = "R.I.P. Fallait m'écouter. ;D";

            //((TextView) findViewById(R.id.tv_com)).setText(com);
        }
        return com;
    }
}
