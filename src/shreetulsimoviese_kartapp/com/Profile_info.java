package shreetulsimoviese_kartapp.com;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Profile_info extends ActionBarActivity {
	private static int RESULT_LOAD_IMG = 1;
	String imgDecodableString;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_profile_info);
		ActionBar actionBar = getSupportActionBar();
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#008F09")));
	}

	public void loadImagefromGallery(View view) {
		// Create intent to Open Image applications like Gallery, Google Photos
		Intent galleryIntent = new Intent(Intent.ACTION_PICK,
				android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
		// Start the Intent
		startActivityForResult(galleryIntent, RESULT_LOAD_IMG);
	}

	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);

		try {
			if (requestCode == RESULT_LOAD_IMG && resultCode == RESULT_OK
					&& null != data) {
				// Get the Image from data

				Uri selectedImage = data.getData();
				String[] filePathColumn = { MediaStore.Images.Media.DATA };
				Cursor cursor = getContentResolver().query(selectedImage,
						filePathColumn, null, null, null);
				// Move to first row
				cursor.moveToFirst();

				int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
				imgDecodableString = cursor.getString(columnIndex);
				cursor.close();
				ImageView imgView = (ImageView) findViewById(R.id.profilepic);
				// Set the Image in ImageView after decoding the String
				imgView.setImageBitmap(BitmapFactory
						.decodeFile(imgDecodableString));

			} else {
				Toast.makeText(this, "You haven't picked Image",
						Toast.LENGTH_LONG).show();
			}

		} catch (Exception e) {
			Toast.makeText(this, "Something went wrong", Toast.LENGTH_LONG)
					.show();
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.profile_info, menu);
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
