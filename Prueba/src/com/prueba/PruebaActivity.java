package com.prueba;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PruebaActivity extends Activity {
    /** Called when the activity is first created. */

	int counter;
	Button suma;
	Button resta;
	TextView display;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        counter = 0;
        suma = (Button) findViewById(R.id.bSuma);
        resta = (Button) findViewById(R.id.bResta);
        display = (TextView) findViewById(R.id.tvDisplay);
        suma.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter++;
				display.setText("Tu Total es " + counter);
			}
			
		});
        
        resta.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter--;
				display.setText("Tu Total es " + counter);
			}
			
		});
        
    }
}