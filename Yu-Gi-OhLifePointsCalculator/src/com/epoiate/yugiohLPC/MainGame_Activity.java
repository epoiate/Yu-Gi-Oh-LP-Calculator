package com.epoiate.yugiohLPC;

import yugioh.life_points.EditTextView;

import com.poiate.yugiohLPC.R;

import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainGame_Activity extends Activity implements OnClickListener {
	
	private EditText Custom1;
	private EditText Custom2;
	private TextView LifePoint1;
	private TextView LifePoint2;
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
        case R.id.p1_LP:       //0x7f090003
        case R.id.p1_damage:   //0x7f090006
        case R.id.p1_double:   //0x7f09000f
        case R.id.p1_gain:     //0x7f090007
        case R.id.p1_gain_100: //0x7f09000a
        case R.id.p1_gain_1000://0x7f090010
        case R.id.p1_gain_500: //0x7f09000d
        case R.id.p1_half:     //0x7f09000c
        case R.id.p1_lose:     //0x7f090005
        case R.id.p1_lose_100: //0x7f090008
        case R.id.p1_lose_1000://0x7f09000e
        case R.id.p1_lose_500: //0x7f09000b
        case R.id.p1_progress: //0x7f090004
        case R.id.p1_reset:    //0x7f090009
        
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
	    this.LifePoint1 = ((EditTextView)findViewById(2131165192));
	    this.LifePoint2 = ((EditTextView)findViewById(2131165212));
	    this.LifePoint1.setOnTextChangeListener(this);
	    this.LifePoint2.setOnTextChangeListener(this);
	    this.LifePoint1.setEnabled(false);
	    this.LifePoint2.setEnabled(false);
	    this.Custom1 = ((EditText)findViewById(2131165207));
	    this.Custom2 = ((EditText)findViewById(2131165227));
	    findViewById(2131165206).setOnClickListener(this);
	    findViewById(2131165194).setOnClickListener(this);
	    findViewById(2131165198).setOnClickListener(this);
	    findViewById(2131165202).setOnClickListener(this);
	    findViewById(2131165226).setOnClickListener(this);
	    findViewById(2131165214).setOnClickListener(this);
	    findViewById(2131165218).setOnClickListener(this);
	    findViewById(2131165222).setOnClickListener(this);
	    findViewById(2131165208).setOnClickListener(this);
	    findViewById(2131165196).setOnClickListener(this);
	    findViewById(2131165200).setOnClickListener(this);
	    findViewById(2131165204).setOnClickListener(this);
	    findViewById(2131165228).setOnClickListener(this);
	    findViewById(2131165216).setOnClickListener(this);
	    findViewById(2131165220).setOnClickListener(this);
	    findViewById(2131165224).setOnClickListener(this);
	    findViewById(2131165199).setOnClickListener(this);
	    findViewById(2131165219).setOnClickListener(this);
	    findViewById(2131165195).setOnClickListener(this);
	    findViewById(2131165215).setOnClickListener(this);
	    findViewById(2131165203).setOnClickListener(this);
	    findViewById(2131165223).setOnClickListener(this);
	    findViewById(2131165184).setOnClickListener(this);
	  }
}
