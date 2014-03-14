package com.epoiate.yugiohLPC;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

import com.poiate.yugiohLPC.R;

public class MainActivity extends Activity {
	

	private EditText damage1;
	private EditText damage2;
	private TextView lifePoint1;
	private TextView lifePoint2;
	private int lp1 = 8000;
	private int lp2 = 8000;
    
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_game);
//      lifePoint1.setText(Integer.toString(this.lp1));
//      lifePoint2.setText(Integer.toString(this.lp2));
		setUpGUI();
	}


	public void clickB(View v) {
		Button clickedB = (Button) v;
		switch (clickedB.getId()){
		/*
		public static final int action_settings=0x7f09001e;
		
        public static final int exit_game=0x7f090002;
        public static final int load_game=0x7f090001;
        public static final int new_game=0x7f090000;
        */
		default: 
        case R.id.p1_LP:       //0x7f090003
        	
        case R.id.p1_damage:   //0x7f090006
        case R.id.p1_double:   //0x7f09000f
				    
        case R.id.p1_gain:     //0x7f090007
			//try{
				lp1 += Integer.parseInt(lifePoint1.getText().toString());
				lifePoint1.setText(Integer.toString(lp1));
				break;
			//}catch (Exception e){System.out.println(e);}
        case R.id.p1_gain_100: //0x7f09000a
        case R.id.p1_gain_1000://0x7f090010
        case R.id.p1_gain_500: //0x7f09000d
        case R.id.p1_half:     //0x7f090=00c
        case R.id.p1_lose:     //0x7f090005
        case R.id.p1_lose_100: //0x7f090008
        case R.id.p1_lose_1000://0x7f09000e
        case R.id.p1_lose_500: //0x7f09000b
        case R.id.p1_progress: //0x7f090004
        case R.id.p1_reset:    //0x7f090009
        ///////////////////////////////////
        case R.id.p2_LP:       //0x7f09001e
        case R.id.p2_damage:   //0x7f09001b
        case R.id.p2_double:   //0x7f090012
        case R.id.p2_gain:     //0x7f09001a
        case R.id.p2_gain_100: //0x7f090017
        case R.id.p2_gain_1000://0x7f090011
        case R.id.p2_gain_500: //0x7f090014
        case R.id.p2_half:     //0x7f090015
        case R.id.p2_lose:     //0x7f09001c
        case R.id.p2_lose_100: //0x7f090019
        case R.id.p2_lose_1000://0x7f090013
        case R.id.p2_lose_500: //0x7f090016
        case R.id.p2_progress: //0x7f09001d
        case R.id.p2_reset:    //0x7f090018
        
		}

	}

	public void setUpGUI()
	  {
/*
	    this.LifePoint1 = ((EditTextView)findViewById(R.id.p1_LP));
	    this.LifePoint2 = ((EditTextView)findViewById(R.id.p2_LP));
	    this.LifePoint1.setOnTextChangeListener(this);
	    this.LifePoint2.setOnTextChangeListener(this);
	    this.LifePoint1.setEnabled(false);
	    this.LifePoint2.setEnabled(false);
	    this.damage1 = ((EditText)findViewById(R.id.p1_damage));
	    this.damage2 = ((EditText)findViewById(R.id.p2_damage));
	    
	    findViewById(R.id.p1_double).setOnClickListener(this);
	    findViewById(R.id.p1_gain).setOnClickListener(this);
	    findViewById(R.id.p1_gain_100).setOnClickListener(this);
	    findViewById(R.id.p1_gain_1000).setOnClickListener(this);
	    findViewById(R.id.p1_gain_500).setOnClickListener(this);
	    findViewById(R.id.p1_half).setOnClickListener(this);
	    findViewById(R.id.p1_lose).setOnClickListener(this);
	    findViewById(R.id.p1_lose_100).setOnClickListener(this);
	    findViewById(R.id.p1_lose_1000).setOnClickListener(this);
	    findViewById(R.id.p1_lose_500).setOnClickListener(this);
	    findViewById(R.id.p1_reset).setOnClickListener(this);
	    
	    findViewById(R.id.p2_double).setOnClickListener(this);
	    findViewById(R.id.p2_gain).setOnClickListener(this);
	    findViewById(R.id.p2_gain_100).setOnClickListener(this);
	    findViewById(R.id.p2_gain_1000).setOnClickListener(this);
	    findViewById(R.id.p2_gain_500).setOnClickListener(this);
	    findViewById(R.id.p2_half).setOnClickListener(this);
	    findViewById(R.id.p2_lose).setOnClickListener(this);
	    findViewById(R.id.p2_lose_100).setOnClickListener(this);
	    findViewById(R.id.p2_lose_1000).setOnClickListener(this);
	    findViewById(R.id.p2_lose_500).setOnClickListener(this);
	    findViewById(R.id.p2_reset).setOnClickListener(this);
	    */
	  }
}
