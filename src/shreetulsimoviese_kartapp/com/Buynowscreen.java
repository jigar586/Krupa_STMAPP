package shreetulsimoviese_kartapp.com;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Buynowscreen extends ActionBarActivity {
	Button button;
	Boolean flag = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_buynowscreen);

		ActionBar actionBar = getSupportActionBar();
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#008F09")));
		button = (Button) findViewById(R.id.button2);

		button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				// Start NewActivity.class
				Intent myIntent = new Intent(Buynowscreen.this,
						Buynowclick.class);
				startActivity(myIntent);
			}
		});
		button = (Button) findViewById(R.id.sharebtn);
		// button.setOnClickListener(new View.OnClickListener() {
		//
		// @Override
		// public void onClick(View v) {
		// // TODO Auto-generated method stub
		//
		// }
		// });
	}

	public void change_image(View v) {
		ImageView iv = (ImageView) findViewById(R.id.i);
		// use flag to change image

		iv.setImageResource(R.drawable.mug1);
	}

	public void change_image1(View v) {
		ImageView iv = (ImageView) findViewById(R.id.i);
		// use flag to change image

		iv.setImageResource(R.drawable.mug2);
	}

	public void change_image2(View v) {
		ImageView iv = (ImageView) findViewById(R.id.i);
		// use flag to change image

		iv.setImageResource(R.drawable.mug4);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.buynowscreen, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
