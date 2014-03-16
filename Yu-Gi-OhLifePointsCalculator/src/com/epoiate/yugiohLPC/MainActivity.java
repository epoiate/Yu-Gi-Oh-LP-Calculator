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
	
		damage1 = (EditText) findViewById(R.id.p1_damage);
		damage2 = (EditText) findViewById(R.id.p2_damage);
	    lifePoint1 = (TextView) findViewById(R.id.p1_LP);
		lifePoint2 = (TextView) findViewById(R.id.p2_LP);
        lifePoint1.setText(Integer.toString(lp1));
        lifePoint2.setText(Integer.toString(lp2));
	
	}


	public void clickB(View v) {
		Button clickedB = (Button) v;
		switch (clickedB.getId()){
		/*
		public static final int action_settings=0x7f09001e;
		
        public static final int exit_game=0x7f090002;
        public static final int load_game=0x7f090001;
        public static final int new_game=0x7f090000;
		
		case R.id.p1_LP:       //0x7f090003
	    case R.id.p1_damage:   //0x7f090006
		case R.id.p1_progress: //0x7f090004
		case R.id.p2_LP:       //0x7f09001e
		case R.id.p2_damage:   //0x7f09001b
		case R.id.p2_progress: //0x7f09001d
        */
		default: 
			break;
        
        case R.id.p1_double:   //0x7f09000f
			lp1 = 2*lp1;
			lifePoint1.setText(Integer.toString(lp1));
			break;
			
        case R.id.p1_gain:     //0x7f090007
			try{
				lp1 += Integer.parseInt(damage1.getText().toString());
				lifePoint1.setText(Integer.toString(lp1));
				break;
			}catch (Exception e){}
			
        case R.id.p1_gain_100: //0x7f09000a
			try{
				lp1 += 100;
				lifePoint1.setText(Integer.toString(lp1));
				break;
			}catch (Exception e){}
	
        case R.id.p1_gain_1000://0x7f090010
			try{
				lp1 += 1000;
				lifePoint1.setText(Integer.toString(lp1));
				break;
			}catch (Exception e){}
					
        case R.id.p1_gain_500: //0x7f09000d
			try{
				lp1 += 500;
				lifePoint1.setText(Integer.toString(lp1));
				break;
			}catch (Exception e){}
					
		
        case R.id.p1_half:     //0x7f09000c
			lp1 = lp1/2;
			lifePoint1.setText(Integer.toString(lp1));
			break;
			
        case R.id.p1_lose:     //0x7f090005
			try{
				lp1 -= Integer.parseInt(damage1.getText().toString());
				lifePoint1.setText(Integer.toString(lp1));
				break;
			}catch (Exception e){}
			
        case R.id.p1_lose_100: //0x7f090008
		try{
				lp1 -= 100;
				lifePoint1.setText(Integer.toString(lp1));
				break;
			}catch (Exception e){}
					
        case R.id.p1_lose_1000://0x7f09000e
			try{
				lp1 -= 1000;
				lifePoint1.setText(Integer.toString(lp1));
				break;
			}catch (Exception e){}
					
        case R.id.p1_lose_500: //0x7f09000b
			try{
				lp1 -= 500;
				lifePoint1.setText(Integer.toString(lp1));
				break;
			}catch (Exception e){}
					

        case R.id.p1_reset:    //0x7f090009
			lp1 = 8000;
			lifePoint1.setText(Integer.toString(lp1));
			break;
			
        ///////////////////////////////////
        
        case R.id.p2_double:   //0x7f090012
			lp2 = 2*lp2;
			lifePoint2.setText(Integer.toString(lp2));
			break;
			
        case R.id.p2_gain:     //0x7f09001a
			try{
				lp2 += Integer.parseInt(damage2.getText().toString());
				lifePoint2.setText(Integer.toString(lp2));
				break;
			}catch (Exception e){}
			
        case R.id.p2_gain_100: //0x7f090017
			try{
				lp2 += 100;
				lifePoint2.setText(Integer.toString(lp2));
				break;
			}catch (Exception e){}
					
        case R.id.p2_gain_1000://0x7f090011
			try{
				lp2 += 1000;
				lifePoint2.setText(Integer.toString(lp2));
				break;
			}catch (Exception e){}
	
        case R.id.p2_gain_500: //0x7f090014
			try{
				lp2 += 500;
				lifePoint2.setText(Integer.toString(lp2));
				break;
			}catch (Exception e){}
					
        case R.id.p2_half:     //0x7f090015
			lp2 = lp2/2;
			lifePoint2.setText(Integer.toString(lp2));
			break;
			
		case R.id.p2_lose:     //0x7f09001c
			try{
				lp2 -= Integer.parseInt(damage2.getText().toString());
				lifePoint2.setText(Integer.toString(lp2));
				break;
			}catch (Exception e){}
			
        case R.id.p2_lose_100: //0x7f090019
			try{
				lp2 -= 100;
				lifePoint2.setText(Integer.toString(lp2));
				break;
			}catch (Exception e){}
			
        case R.id.p2_lose_1000://0x7f090013
			try{
				lp2 -= 1000;
				lifePoint2.setText(Integer.toString(lp2));
				break;
			}catch (Exception e){}
			
        case R.id.p2_lose_500: //0x7f090016
			try{
				lp2 -= 500;
				lifePoint2.setText(Integer.toString(lp2));
				break;
			}catch (Exception e){}
        
        case R.id.p2_reset:    //0x7f090018
			lp2 = 8000;
			lifePoint2.setText(Integer.toString(lp2));
        	break;
		}

	}
}
