package chacas0.personnalcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);




        //=> Button to create a person
        final Button btn_personne = (Button) findViewById(R.id.home_btn_personne);
        //_ What to do on click
        btn_personne.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent goingTo = new Intent(Home.this, Create_pers.class);
                startActivity(goingTo);
            }
        });


    }


}
