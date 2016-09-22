//
// DO NOT EDIT THIS FILE.Generated using AndroidAnnotations 3.3.2.
//  You can create a larger work that contains this file and distribute that work under terms of your choice.
//


package cn.hi028.android.highcommunity.activity.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import cn.hi028.android.highcommunity.R.layout;
import net.duohuo.dhroid.view.CustomListView;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class HuiChipsPayFrag_
    extends cn.hi028.android.highcommunity.activity.fragment.HuiChipsPayFrag
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    private View contentView_;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
    }

    @Override
    public View findViewById(int id) {
        if (contentView_ == null) {
            return null;
        }
        return contentView_.findViewById(id);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        contentView_ = super.onCreateView(inflater, container, savedInstanceState);
        if (contentView_ == null) {
            contentView_ = inflater.inflate(layout.frag_hlife_chipspay, container, false);
        }
        return contentView_;
    }

    @Override
    public void onDestroyView() {
        contentView_ = null;
        super.onDestroyView();
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static HuiChipsPayFrag_.FragmentBuilder_ builder() {
        return new HuiChipsPayFrag_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        edt_pay_num = ((EditText) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.edt_pay_num));
        tv_coupon = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_coupon));
        tv_wallet = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_wallet));
        tv_reserve_name = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_reserve_name));
        tv_reserve_phone = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_reserve_phone));
        ll_NoticeDetails_Progress = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ll_NoticeDetails_Progress);
        tv_price = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_price));
        cl_goods = ((CustomListView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.cl_goods));
        btn_pay = ((Button) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.btn_pay));
        rg_huil_ife = ((RadioGroup) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.rg_huil_ife));
        tv_total_pay = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_total_pay));
        tv_reserve_address = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_reserve_address));
        if (btn_pay!= null) {
            btn_pay.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    HuiChipsPayFrag_.this.onPay();
                }

            }
            );
        }
        {
            View view = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ll_ticket);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        HuiChipsPayFrag_.this.onTicket();
                    }

                }
                );
            }
        }
        initView();
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<HuiChipsPayFrag_.FragmentBuilder_, cn.hi028.android.highcommunity.activity.fragment.HuiChipsPayFrag>
    {


        @Override
        public cn.hi028.android.highcommunity.activity.fragment.HuiChipsPayFrag build() {
            HuiChipsPayFrag_ fragment_ = new HuiChipsPayFrag_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
