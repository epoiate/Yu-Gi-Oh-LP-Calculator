package com.example.yugiohLPC;

import com.poiate.yugiohLPC.R;
import com.poiate.yugiohLPC.R.layout;
import com.poiate.yugiohLPC.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainGame extends Activity {

//	private int p1LP = 8000;
//	private int p2LP = 8000;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_game);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_game, menu);
		return true;
	}

}
