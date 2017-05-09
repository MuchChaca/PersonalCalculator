package chacas0.personalcalculator;

/**
 * Created by archy on 4/5/17.
 */

public abstract class Calcul {
    Globals g = Globals.getInstance(); //Global variables
    protected Someone theOne;
    protected float result;

    public void Calcul(Someone theOne){
        this.theOne = theOne;
    }


    public abstract String[] calcul_imc();



    //////////  - GETTER & SETTERS -  \\\\\\\\\\\
    public Someone getTheOne() {
        return theOne;
    }

    public void setTheOne(Someone theOne) {
        this.theOne = theOne;
    }

    public float getResult() {
        return result;
    }

    public void setResultat(float resultat) {
        this.result = resultat;
    }
}
