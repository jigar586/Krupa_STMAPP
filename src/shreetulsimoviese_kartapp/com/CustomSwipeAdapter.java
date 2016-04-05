package shreetulsimoviese_kartapp.com;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomSwipeAdapter extends PagerAdapter {
	private int[] image_resources = { R.drawable.mug3, R.drawable.frame1,
			R.drawable.mug1, R.drawable.pillow1, R.drawable.mug2,
			R.drawable.frame4, R.drawable.frame1, R.drawable.pillow3 };

	private Context cxt;
	private LayoutInflater layoutInflater;

	public CustomSwipeAdapter(Context cxt) {
		this.cxt = cxt;

	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return image_resources.length;
	}

	@Override
	public boolean isViewFromObject(View view, Object o) {
		// TODO Auto-generated method stub
		return (view == (LinearLayout) o);
	}

	@Override
	public Object instantiateItem(View container, int position) {
		// TODO Auto-generated method stub
		layoutInflater = (LayoutInflater) cxt
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View item_view = layoutInflater.inflate(R.layout.swipe_view,
				(ViewGroup) container, false);
		ImageView imageView = (ImageView) item_view
				.findViewById(R.id.image_view);
		TextView textView = (TextView) item_view.findViewById(R.id.img_count);
		imageView.setImageResource(image_resources[position]);
		textView.setText("Image" + position);
		((ViewGroup) container).addView(item_view);
		return item_view;
	}

	@Override
	public void destroyItem(View container, int position, Object object) {
		// TODO Auto-generated method stub
		((ViewGroup) container).removeView((LinearLayout) object);
	}
}
