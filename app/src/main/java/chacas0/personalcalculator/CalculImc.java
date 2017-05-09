package chacas0.personalcalculator;


import android.widget.EditText;

/**
 * Created by archy on 4/5/17.
 */

public class CalculImc extends Calcul {

    /**
     * @see Someone The param
     * @param theOne The one we are making calculs on
     */
    public CalculImc(Someone theOne) {
        super.Calcul(theOne);
    }

    /**
     * Calcul the imc of the person with the parameters provided when the person was created
     * @return String[] String[0]=imc | String[1]=com The imc first, then the comment
     */
    public String[] calcul_imc() {
        //LE CALCUL

        String toReturn[] = new String[2];
        float valuePoids = theOne.getWeight();
        float valueTaille = theOne.getHeight();
        this.result = valuePoids / (valueTaille * valueTaille);
        String imc = Float.toString(this.result);
        toReturn[0]= imc;
//        ((TextView) findViewById(R.id.tv_result_calc)).setText(result.toString());
        //THE COMMENT
        String com = "";
        if (result < 16) {
            com = "Manger beaucoup plus!";
        } else if (result < 18.5) {
            com = "Mangez plus!";
        } else if (result < 25) {
            com = "IMC normal.";
        } else if (result < 30) {
            com = "Léger surpoids!";
        } else if (result < 35) {
            com = "Régime + Sport recommandés";
        } else if (result < 40) {
            com = "Surpoids inquiétant!";
        } else {
            com = "Consultez un médecin!";

            //((TextView) findViewById(R.id.tv_com)).setText(com);
        }
        toReturn[1] = com;
        return toReturn;
    }
}
