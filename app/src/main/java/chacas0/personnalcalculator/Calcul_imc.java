package chacas0.personnalcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import chacas0.personnalcalculator.Globals;

public class Calcul_imc extends AppCompatActivity {
    Globals g = Globals.getInstance(); //Global variables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcul);

        /**
         * @TODO ~Fix every damn thing here ffs
         */


        //Lorsqu'on change la valeur du poids
//        final EditText etPoids = (EditText) findViewById(R.id.et_poids);
//        etPoids.addTextChangedListener(new TextWatcher(){
//            public void afterTextChanged(Editable s){
//                //
//            }
//            public void beforeTextChanged(CharSequence s, int start, int count, int after){
//                //
//            }
//            public void onTextChanged(CharSequence s, int start, int before, int count){
////                Toast.makeText(getApplicationContext(), "Champ changé", Toast.LENGTH_SHORT).show();
//                ((TextView) findViewById(R.id.tv_result_calc)).setText("Calculez moi :-)");
//                ((TextView) findViewById(R.id.tv_com)).setText("_");
//            }
//        });
//        //Lorsqu'on change la valeur de la taille
//        final EditText etTaille = (EditText) findViewById(R.id.ed_taille);
//        etTaille.addTextChangedListener(new TextWatcher(){
//            public void afterTextChanged(Editable s){
//                //
//            }
//            public void beforeTextChanged(CharSequence s, int start, int before, int after){
//                //
//            }
//            public void onTextChanged(CharSequence s, int start, int before, int count){
//                ((TextView) findViewById(R.id.tv_result_calc)).setText("Calculez moi :-)");
//                ((TextView) findViewById(R.id.tv_com)).setText("_");
//            }
//        });
//
//
//
//        //on récupère le bouton b_reset
//        final Button btnReset = (Button) findViewById(R.id.b_reset);
//        //on définit ce qui doit se passer lorsque l'on clique dessus
//        btnReset.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v){
//                ((EditText) findViewById(R.id.et_poids)).setText("");
//                ((EditText) findViewById(R.id.ed_taille)).setText("");
//                ((TextView) findViewById(R.id.tv_result_calc)).setText("Calculez moi :-)");
//                ((TextView) findViewById(R.id.tv_com)).setText("_");
//
//                ((RadioGroup) findViewById(R.id.rb_unite)).clearCheck();
//            }
//        });
//
//        //on récupère le bouton b_valider
//        final Button btnCalc = (Button) findViewById(R.id.b_valider);
//        //on ajoute un listener sur le click du bouton b_valider
//        btnCalc.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v){
//                //Passe le poids et la taille dans une variable de type String
//                String poids = ((EditText) findViewById(R.id.et_poids)).getText().toString();
//                String taille = ((EditText) findViewById(R.id.ed_taille)).getText().toString();
//                try{            //gestion d'erreurs
//                    Float valuePoids = Float.valueOf(poids);
//                    Float valueTaille = Float.valueOf(taille);
//                    //GESTION DE L'UNITE DE MESURE!!!!//
//                    if(((RadioGroup) findViewById(R.id.rb_unite)).getCheckedRadioButtonId() == R.id.rb_cm){
//                        //Centimètres en mètres
//                        valueTaille=valueTaille/100;
//                    }else if(((RadioGroup) findViewById(R.id.rb_unite)).getCheckedRadioButtonId() != R.id.rb_m){
//                        Toast.makeText(getApplicationContext(), "Aucune unité sélectionné!", Toast.LENGTH_SHORT).show();
//                        return;
//                    }
//                    if(valueTaille == 0 || valuePoids == 0){
//                        Toast.makeText(getApplicationContext(), "Poids ou taille est nulle /!\\", Toast.LENGTH_SHORT).show();
//                        return;
//                    }
//
//                    //LE CALCUL
//                    Float result = valuePoids / (valueTaille * valueTaille);
//                    ((TextView) findViewById(R.id.tv_result_calc)).setText(result.toString());
//                    //LE COMMENTAIRE
//                    String com="";
//                    if(result<16){
//                        com ="Vas au McDo 3 fois par jour!";
//                    }else if(result<18.5){
//                        com= "Mange un kebab 2 fois par jour!";
//                    }else if(result<25){
//                        com= "Sale normal!";
//                    }else if(result<30){
//                        com= "Vive le régime!";
//                    }else if(result<35){
//                        com= "Régime + Sport recommandés";
//                    }else if(result<40){
//                        com = "Gros régime + Plein de sport violents... ou le suicide :(";
//                    }else{
//                        com = "R.I.P. Fallait m'écouter. ;D";
//                    }
//                    ((TextView) findViewById(R.id.tv_com)).setText(com);
//                }catch(Exception e){
//                    //Si une erreur se produit dans le code précédent
//                    Toast.makeText(MainActivity.this, "Erreur de saisie de poids ou de taille ", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });


    }
}
