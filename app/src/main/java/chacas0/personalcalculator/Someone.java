package chacas0.personalcalculator;

import java.util.ArrayList;

/**
 * Created by ChacaS0 on 12/14/16.
 */

public class Someone {
    //attributes
    protected String name;
    protected int yOld;
    protected float height;
    protected float weight;
    protected char sexe;
    protected ArrayList<Calcul> calculs = new ArrayList<Calcul>();

    //construct
    public Someone(String name, int yOld, float height, float weight, char sexe) {
        this.name = name;
        this.yOld = yOld;
        this.height = height;
        this.weight = weight;
        this.sexe = sexe;
    }

    ///// GETTERS & SETTERS §§ Auto generated  \\\\\\\

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getyOld() {
        return yOld;
    }

    public void setyOld(int yOld) {
        this.yOld = yOld;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public ArrayList<Calcul> getCalculs() {
        return calculs;
    }

    public void addCalculs(Calcul calc) {
        this.calculs.add(calc);
    }

}
