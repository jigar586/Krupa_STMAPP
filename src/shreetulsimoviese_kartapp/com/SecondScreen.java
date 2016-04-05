package shreetulsimoviese_kartapp.com;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class SecondScreen extends ActionBarActivity {
	Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second_screen);
//		ActionBar actionBar = getSupportActionBar();
//        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#95CDBA")));

		ActionBar actionBar=getSupportActionBar();
		actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#008F09")));
		
		button = (Button) findViewById(R.id.b2);

		button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				// Start NewActivity.class
				Intent myIntent = new Intent(SecondScreen.this,
						SigninScreen.class);
				startActivity(myIntent);
			}
		});
		button = (Button) findViewById(R.id.b1);
		button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				// Start NewActivity.class
				Intent myIntent = new Intent(SecondScreen.this,
						 Registration.class);
				startActivity(myIntent);
			}
		});
	}

	
}
