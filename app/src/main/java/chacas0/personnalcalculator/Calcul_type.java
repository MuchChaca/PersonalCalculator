package chacas0.personnalcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Calcul_type extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcul_type);



        //=> Button to select an IMC calcul
        final Button btn_imc = (Button) findViewById(R.id.btn_imc);
        //_ What to do on click
        btn_imc.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent goingTo = new Intent(Calcul_type.this, Calcul_imc.class);
                startActivity(goingTo);
            }
        });
        //=> Button to select an IMG calcul
        final Button btn_img = (Button) findViewById(R.id.btn_img);
        //_ What to do on click
        btn_img.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent goingTo = new Intent(Calcul_type.this, Calcul_img.class);
                startActivity(goingTo);
            }
        });
    }
}
