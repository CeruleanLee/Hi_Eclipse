package cn.hi028.android.highcommunity.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class Mylistview extends ListView{


	@SuppressLint("NewApi")
	public Mylistview(Context context, AttributeSet attrs, int defStyleAttr,
			int defStyleRes) {
		super(context, attrs, defStyleAttr, defStyleRes);
		// TODO Auto-generated constructor stub
	}

	public Mylistview(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
	}

	public Mylistview(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public Mylistview(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	@Override

	/**   只重写该方法，达到使ListView适应ScrollView的效果   */ 

	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

		int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,

				MeasureSpec.AT_MOST);

		super.onMeasure(widthMeasureSpec, expandSpec);

	}
}
