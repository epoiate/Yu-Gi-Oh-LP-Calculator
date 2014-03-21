package com.epoiate.yugiohLPC;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import com.poiate.yugiohLPC.R;

public class MainActivity extends Activity {

	static final String PLAYER_1 = "playerLP";
	static final String PLAYER_2 = "playerLP";
	private EditText damage1;
	private EditText damage2;
	private TextView lifePoint1;
	private TextView lifePoint2;
	private int lp1;
	private int lp2;

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// TODO: Implement this method
		outState.putInt(PLAYER_1, lp1);
		outState.putInt(PLAYER_2, lp2);
		
		super.onSaveInstanceState(outState);
	}
	
	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState){
		//TODO
		
		super.onRestoreInstanceState(savedInstanceState);
	        // Restore value of members from saved state
	        lp1 = savedInstanceState.getInt(PLAYER_1);
	        lp2 = savedInstanceState.getInt(PLAYER_2);
	}
	

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_game);

		damage1 = (EditText) findViewById(R.id.p1_damage);
		damage2 = (EditText) findViewById(R.id.p2_damage);
		lifePoint1 = (TextView) findViewById(R.id.p1_LP);
		lifePoint2 = (TextView) findViewById(R.id.p2_LP);
	}
	
	protected void onResume(){
		lifePoint1.setText(Integer.toString(lp1));
		lifePoint2.setText(Integer.toString(lp2));
	}



	public void clickB(View v) {
		int aux;
		Button clickedB = (Button) v;
		switch (clickedB.getId()) {
		/*
		 * public static final int action_settings=0x7f09001e;
		 * 
		 * public static final int exit_game=0x7f090002; public static final int
		 * load_game=0x7f090001; public static final int new_game=0x7f090000;
		 * 
		 * case R.id.p1_LP: //0x7f090003 case R.id.p1_damage: //0x7f090006 case
		 * R.id.p1_progress: //0x7f090004 case R.id.p2_LP: //0x7f09001e case
		 * R.id.p2_damage: //0x7f09001b case R.id.p2_progress: //0x7f09001d
		 */
		default:
			break;

		case R.id.p1_double: // 0x7f09000f
			update(lp1, 1);
			break;

		case R.id.p1_gain: // 0x7f090007
			try {
				aux = Integer.parseInt(damage1.getText().toString());
			} catch (Exception e) {
				aux = 0;
			}
			update(aux, 1);
			break;

		case R.id.p1_gain_100: // 0x7f09000a
			update(100, 1);
			break;

		case R.id.p1_gain_1000:// 0x7f090010
			update(1000, 1);
			break;

		case R.id.p1_gain_500: // 0x7f09000d
			update(500, 1);
			break;

		case R.id.p1_half: // 0x7f09000c
			update(-lp1 / 2, 1);
			break;

		case R.id.p1_lose: // 0x7f090005
			try {
				aux = Integer.parseInt(damage1.getText().toString());
			} catch (Exception e) {
				aux = 0;
			}
			update(-aux, 1);
			break;

		case R.id.p1_lose_100: // 0x7f090008
			update(-100, 1);
			break;

		case R.id.p1_lose_1000:// 0x7f09000e
			update(-1000, 1);
			break;

		case R.id.p1_lose_500: // 0x7f09000b
			update(-500, 1);
			break;

		case R.id.p1_reset: // 0x7f090009
			lp1 = 8000;
			update(0, 1);
			break;

		// /////////////////////////////////

		case R.id.p2_double: // 0x7f090012
			update(lp2, 2);
			break;

		case R.id.p2_gain: // 0x7f09001a
			try {
				aux = Integer.parseInt(damage2.getText().toString());
			} catch (Exception e) {
				aux = 0;
			}
			update(aux, 2);
			break;

		case R.id.p2_gain_100: // 0x7f090017
			update(100, 2);
			break;

		case R.id.p2_gain_1000:// 0x7f090011
			update(1000, 2);
			break;

		case R.id.p2_gain_500: // 0x7f090014
			update(500, 2);
			break;

		case R.id.p2_half: // 0x7f090015
			update(-lp2 / 2, 2);
			break;

		case R.id.p2_lose: // 0x7f09001c
			try {
				aux = Integer.parseInt(damage2.getText().toString());
			} catch (Exception e) {
				aux = 0;
			}
			update(-aux, 2);
			break;

		case R.id.p2_lose_100: // 0x7f090019
			update(-100, 2);
			break;

		case R.id.p2_lose_1000:// 0x7f090013
			update(-1000, 2);
			break;

		case R.id.p2_lose_500: // 0x7f090016
			update(-500, 2);
			break;

		case R.id.p2_reset: // 0x7f090018
			lp2 = 8000;
			update(0, 2);
			break;
		}

	}

	public void update(int valor, int player) {
		switch (player) {
		case 1:
			try {
				lp1 += valor;
				lifePoint1.setText(Integer.toString(lp1));
				damage1.setText("");

			} catch (Exception e) {
			}
			break;
		case 2:
			try {
				lp2 += valor;
				lifePoint2.setText(Integer.toString(lp2));
				damage2.setText("");
			} catch (Exception e) {
			}
			break;
		}
		if (lp2 < 0) {
			lp2 = 0;
			lifePoint2.setText(Integer.toString(lp2));
		}
		if (lp1 < 0) {
			lp1 = 0;
			lifePoint1.setText(Integer.toString(lp1));
		}
	}
}
