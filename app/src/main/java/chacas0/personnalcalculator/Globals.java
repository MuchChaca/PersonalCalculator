package chacas0.personnalcalculator;

import java.util.ArrayList;

/**
 * Created by archy on 4/4/17.
 */

public class Globals {
    private static Globals instance;
    private static Someone currentOne;
    private static ArrayList<Someone> tabOnes= new ArrayList<Someone>();
    private static String calculType;

    private Globals(){
        //empty construct on purpose
    }

    // Synchronization

    /**
     * Function that is supposed to synchronize the global function each time
     * @return Globals An instance of the Globals
     */
    public static synchronized Globals getInstance(){
        if(instance==null){
            instance = new Globals();
        }
        return instance;
    }

    /**
     * Getter function for currentOne
     * @return Someone La personne à utiliser
     */
    public static Someone getCurrentOne() {
        return currentOne;
    }

    /**
     * Setter function for currentOne.
     * @param one The one we want it to be.
     */
    public static void setCurrentOne(Someone one) {
        Globals.currentOne = one;
    }

    public static ArrayList<Someone> getTabOnes() {
        return Globals.tabOnes;
    }

    public static void addOne(Someone newOne) {
//        int i = Globals.tabOnes.length-1;
//        Globals.tabOnes[i] = newOne;
        Globals.tabOnes.add(newOne);
    }

    /**
     * Check if the current person exists
     * @return boolean The current one.
     */
    public boolean currentOneExists(){
        if(getCurrentOne() != null){
            return true;
        }else{
            return false;
        }
    }

    public static String getCalculType() {
        return calculType;
    }

    public static void setCalculType(String calculType) {
        Globals.calculType = calculType;
    }

    //    public void setTest(int t){
//        GlobalClass.test=t;
//    }
//    public int getTest(){
//        return GlobalClass.test;
//    }
}
