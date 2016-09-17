package cn.hi028.android.highcommunity.adapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.squareup.picasso.Picasso;

import cn.hi028.android.highcommunity.R;
import cn.hi028.android.highcommunity.bean.MerchantEvaluationInfoListBean;
import cn.hi028.android.highcommunity.utils.Constacts;
import cn.hi028.android.highcommunity.view.CustomGridView;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class EvaluationAdapter extends
		MyBaseAdapter<MerchantEvaluationInfoListBean> {
	/** 复用类型1为商家评价，2为商品评价 */
	int type = 1;

	public void setType(int type) {
		this.type = type;
	}

	public EvaluationAdapter(Context context,
			List<MerchantEvaluationInfoListBean> data) {
		super(context, data);
	}

	@Override
	public int getItemResource(int pos) {
		return R.layout.item_merchant_evaluation;
	}

	@Override
	public View getItemView(int position, View convertView,
			MyBaseAdapter<MerchantEvaluationInfoListBean>.ViewHolder holder,
			ViewGroup parent) {
		MerchantEvaluationInfoListBean bean = data.get(position);

		ImageView head = holder.getView(R.id.item_evaluation_iv);
		TextView username = holder.getView(R.id.item_username_tv);
		TextView merchantname = holder
				.getView(R.id.item_evalutaion_merchantname_tv);
		TextView time = holder.getView(R.id.item_evaluation_time);
		TextView content = holder.getView(R.id.item_evalution_content_tv);
		CustomGridView gridview = holder.getView(R.id.item_evaluation_gridview);
		ArrayList<String> datas = new ArrayList<String>();
		if (type == 2) {
			datas = (ArrayList<String>) bean.getComment_pic();
		} else
			datas = (ArrayList<String>) bean.getPic();
		MyItemEvaluationAdapter adapter = new MyItemEvaluationAdapter(context,
				datas);
		gridview.setAdapter(adapter);
		username.setText(bean.getNick());
		merchantname.setText(bean.getGoods_name());
		time.setText(getTime(Long.parseLong(bean.getCreate_time())));
		content.setText("     " + bean.getContent());
		Picasso.with(context).load(Constacts.IMAGEHTTP + bean.getHead_pic())
				.into(head);
		return convertView;
	}

	public String getTime(long time) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		return sdf.format(new Date(time));
	}

}
