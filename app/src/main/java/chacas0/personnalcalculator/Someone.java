package chacas0.personnalcalculator;

/**
 * Created by ChacaS0 on 12/14/16.
 */

public class Someone {
    //attributs
    protected String name;
    protected int yOld;
    protected float height;
    protected float weight;
    protected char sexe;

    //construct
    public Someone(String name, int yOld, float height, float weight, char sexe) {
        this.name = name;
        this.yOld = yOld;
        this.height = height;
        this.weight = weight;
        this.sexe = sexe;
    }

    ///// GETTERS & SETTERS §§ Auto generated

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


//    public void test(){
//        System.out.println("ca marche");
//    }
}
