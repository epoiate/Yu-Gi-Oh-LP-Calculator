package com.example.yugiohLPC;

import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;


public class MainGame_Activity implements OnClickListener {
	
	private EditText Custom1;
	private EditText Custom2;
//	private EditTextView LifePoint1;
//	private EditTextView LifePoint2;
	private final String TAG = "YuGiOh";
	private Menu menu;
	private String mode;
	private Integer res;

	@Override
	public void onClick(View paramView) {
		// TODO Auto-generated method stub
		
		switch (paramView.getId()){
		/*
		public static final int action_settings=0x7f09001e;
		
        public static final int exit_game=0x7f090002;
        public static final int load_game=0x7f090001;
        public static final int new_game=0x7f090000;
        */
		default: 
        case 0x7f090003: //p1_LP
        case 0x7f090006: //p1_damage
        case 0x7f09000f: //p1_double
        case 0x7f090007: //p1_gain
        case 0x7f09000a: //p1_gain_100
        case 0x7f090010: //p1_gain_1000
        case 0x7f09000d: //p1_gain_500
        case 0x7f09000c: //p1_half
        case 0x7f090005: //p1_lose
        case 0x7f090008: //p1_lose_100
        case 0x7f09000e: //p1_lose_1000
        case 0x7f09000b: //p1_lose_500
        case 0x7f090004: //p1_progress
        case 0x7f090009: //p1_reset
        
        case 0x7f09001e: //p2_LP
        case 0x7f09001b: //p2_damage
        case 0x7f090012: //p2_double
        case 0x7f09001a: //p2_gain
        case 0x7f090017: //p2_gain_100
        case 0x7f090011: //p2_gain_1000
        case 0x7f090014: //p2_gain_500
        case 0x7f090015: //p2_half
        case 0x7f09001c: //p2_lose
        case 0x7f090019: //p2_lose_100
        case 0x7f090013: //p2_lose_1000
        case 0x7f090016: //p2_lose_500
        case 0x7f09001d: //p2_progress
        case 0x7f090018: //p2_reset
        
		} while(true){
			try
		      {
		        this.LifePoint1.update(this, Integer.parseInt(this.Custom1.getText().toString()), 1);
		        this.Custom1.setText("");
		      }
		}

	}

}
