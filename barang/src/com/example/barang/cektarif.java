package com.example.barang;
import com.example.barang.MainActivity.PlaceholderFragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class cektarif extends Activity {
	double harga, berat, tarif;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cektarif);
		final CheckBox cb1 = (CheckBox) findViewById (R.id.checkBox1);
    	final CheckBox cb2 = (CheckBox) findViewById (R.id.checkBox2);
    	final CheckBox cb3 = (CheckBox) findViewById (R.id.CheckBox3);
    	final CheckBox cb4 = (CheckBox) findViewById (R.id.CheckBox4);
    	final EditText et1 = (EditText) findViewById(R.id.editText1);
    	final EditText et2 = (EditText) findViewById(R.id.editText2);
    	final Button bt1 = (Button) findViewById(R.id.button1);
    	
    	bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				berat = Double.valueOf(et1.getText().toString());
		    	
		    	if (cb1.isChecked()){
		    		if (cb3.isChecked()){
		    			harga = 8000;
		    			tarif = harga * berat;
		    			
		    			
		    		}
		    		else if (cb4.isChecked()){
		    			harga = 16000;
		    			tarif = harga * berat;
		    		}	
		    	}
		    	
		    	if (cb2.isChecked()){
		    		if (cb3.isChecked()){
		    			harga = 16000;
		    			tarif = harga * berat;
		    			
		    		}
		    		else if (cb4.isChecked()){
		    			harga = 8000;
		    			tarif = harga * berat;
		    		}	
		    	}
		    	
		    	et2.setText(String.valueOf(tarif));
			}
		});	

    }

	}