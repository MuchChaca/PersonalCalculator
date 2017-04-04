package chacas0.personnalcalculator;

/**
 * Created by archy on 4/4/17.
 */

public class Globals {
    private static Someone currentOne;
    private static Someone[] tabOnes;

    private Globals(){
        //empty construct
    }

    // Synchronization
    public static synchronized Globals getInstance(){
        if(instance==null){
            instance = new Globals();
        }
        return instance;
    }

    ///// GETTERS & SETTERS §§ Auto generated
    private static Globals instance;

    public static Someone getCurrentOne() {
        return currentOne;
    }

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

//    public void setTest(int t){
//        GlobalClass.test=t;
//    }
//    public int getTest(){
//        return GlobalClass.test;
//    }
}
