package com.example.yugiohLPC;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.poiate.yugiohLPC.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final Button newGame = (Button) findViewById(R.id.new_game);
   //     final Button loadGame = (Button) findViewById(R.id.load_game);
   //     final Button exitGame = (Button) findViewById(R.id.exit_game);
               
        
        newGame.setOnClickListener(new Button.OnClickListener(){
        			public void onClick(View v){
        				Intent i = new Intent(MainActivity.this, MainGame.class);  
        		        startActivity(i);
        			}
        		}
        );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
