package edu.upc.eseiaat.pma.convertidorkmmilles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //No fan falta els Button (Extra nº3)
        //Button b_a_m = (Button) findViewById(R.id.button_a_m);
        //Button b_a_k = (Button) findViewById(R.id.button_a_km);

        final EditText e_km = (EditText) findViewById(R.id.edit_km);
        final EditText e_m = (EditText) findViewById(R.id.edit_m);

        //Treballaré amb el setOnClickListener dels EditText(Extra nº3)
        e_km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s_km = e_km.getText().toString();
                float f_km = Float.parseFloat(s_km);
                float f_m = f_km/1.609f;
                String s_m = String.format("%f", f_m);
                e_m.setText(s_m);
            }
        });
        e_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s_m = e_m.getText().toString();
                float f_m = Float.parseFloat(s_m);
                float f_km = f_m*1.609f;
                String s_km = String.format("%f", f_km);
                e_km.setText(s_km);
            }
        });

    }
}
