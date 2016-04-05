package shreetulsimoviese_kartapp.com;

import java.util.ArrayList;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class Hpslideview extends ActionBarActivity {
	ViewPager viewPager;
	CustomSwipeAdapter adapter;
	Integer[] imageIDS = { R.drawable.mug3, R.drawable.frame1, R.drawable.mug1,
			R.drawable.pillow1, R.drawable.mug2, R.drawable.frame4,
			R.drawable.frame1, R.drawable.pillow3 };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hpslideview);
		ActionBar actionBar = getSupportActionBar();
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#008F09")));

		viewPager = (ViewPager) findViewById(R.id.viewpager);
		adapter = new CustomSwipeAdapter(this);
		viewPager.setAdapter(adapter);

		GridView gridView = (GridView) findViewById(R.id.grid);
		ArrayList<Integer> images = new ArrayList<Integer>();
		images.add(R.drawable.mug3);
		images.add(R.drawable.frame1);
		images.add(R.drawable.mug1);
		images.add(R.drawable.pillow1);
		images.add(R.drawable.mug2);
		images.add(R.drawable.frame4);
		images.add(R.drawable.pillow3);
		CustomAdapter adapter = new CustomAdapter(this, images);
		gridView.setAdapter(adapter);
		// CustomAdapter adapter = new CustomAdapter(this, images);
		// gridView.setAdapter(adapter);

	}

	public class ImageAdapter extends BaseAdapter {

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return imageIDS.length;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub

			ImageView i = new ImageView(Hpslideview.this);
			i.setImageResource(imageIDS[position]);
			i.setScaleType(ScaleType.FIT_XY);
			i.setLayoutParams(new GridView.LayoutParams(150, 150));
			return i;
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hpslideview, menu);
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