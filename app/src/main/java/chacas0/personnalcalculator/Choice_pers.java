package chacas0.personnalcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import chacas0.personnalcalculator.Globals;
import chacas0.personnalcalculator.Someone;



public class Choice_pers extends AppCompatActivity {
    Globals g = Globals.getInstance(); //Global variables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_pers);



    }

    protected void createRadioButton() {

//        final LinearLayout lay = (LinearLayout) this.findViewById(R.id.lay_list_pers); /** @TODO ?Test if there is any crash cause of this / if it does, use this : setContentView(R.layout.my_layout); **/
//        Someone[] tabThem=g.getTabOnes();
//        final RadioButton[] rb = new RadioButton[tabThem.length];
//        RadioGroup rg = new RadioGroup(this); //create the RadioGroup
//        rg.setOrientation(RadioGroup.VERTICAL);//or RadioGroup.HORIZONTAL
//
//        for(int i=0; i<tabThem.length; i++){
//            rb[i]  = new RadioButton(this);
//            rg.addView(rb[i]); //the RadioButtons are added to the radioGroup instead of the layout
//            rg.setId(i);
//            rb[i].setText(tabThem[i].getName());
//        }
//
//        /**
//         * @TODO \Finish this part, get what we should do with the submit and how to use this code to actually do something...
//         */
//        lay.addView(rg);//you add the whole RadioGroup to the layout
//        lay.addView(submit);
//        submit.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                for(int i = 0; i < 5; i++) {
//                    rg.removeView(rb[i]);//now the RadioButtons are in the RadioGroup
//                }
//                lay.removeView(submit);
//                //Questions();
//            }
//        });
    }
}
