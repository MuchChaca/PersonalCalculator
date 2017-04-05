package chacas0.personnalcalculator;

/**
 * Created by archy on 4/4/17.
 */

public class Globals {
    private static Globals instance;
    private static Someone currentOne;
    private static Someone[] tabOnes;
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

    public static Someone[] getTabOnes() {
        return tabOnes;
    }

    public static void addOne(Someone newOne) {
        int i = Globals.tabOnes.length;
        Globals.tabOnes[i] = newOne;
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
