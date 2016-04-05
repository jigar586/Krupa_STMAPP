package shreetulsimoviese_kartapp.com;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<Integer>{
	private ArrayList<Integer> images;
	private LayoutInflater inflater;
	
	public CustomAdapter(Context c, ArrayList<Integer> imgs) {
		super(c, R.layout.swipe_view, imgs);

		images = imgs;
		inflater = (LayoutInflater) c
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View vi = convertView;
		if (convertView == null) {
			vi = inflater.inflate(R.layout.swipe_view, parent, false);
		}
		TextView title = (TextView) vi.findViewById(R.id.info_text);
		ImageView imageView = (ImageView) vi.findViewById(R.id.some_image);
		title.setTag("Number" + (position + 1));
		imageView.setImageResource(images.get(position));

		return vi;

	}

}
