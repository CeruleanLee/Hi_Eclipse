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
import android.widget.TextView;
import cn.hi028.android.highcommunity.R.layout;
import com.don.view.CircleImageView;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class ServiceCaftsDetailFrag_
    extends cn.hi028.android.highcommunity.activity.fragment.ServiceCaftsDetailFrag
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
            contentView_ = inflater.inflate(layout.frag_carftsdetails, container, false);
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

    public static ServiceCaftsDetailFrag_.FragmentBuilder_ builder() {
        return new ServiceCaftsDetailFrag_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        address = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_ServiceCarftsDetail_ServiceIntro_address));
        mNoData = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_serviceCarftsDetails_Nodata));
        mAvatar = ((CircleImageView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.civ_servicecarftsDetail_image));
        mIntro = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_ServiceCarftsDetail_ServiceIntro));
        mCarftsMan = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_ServiceCarftsDetail_CarftsMan));
        mServiceName = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_ServiceCarftsDetail_ServiceName));
        mProgress = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.progress_serviceCarftsDetails);
        mContact = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_ServiceCarftsDetail_ServiceContact));
        mPrice = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_ServiceCarftsDetail_ServicePrice));
        {
            View view = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_ServiceCarftsDetail_ServiceCall);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        ServiceCaftsDetailFrag_.this.call();
                    }

                }
                );
            }
        }
        initView();
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<ServiceCaftsDetailFrag_.FragmentBuilder_, cn.hi028.android.highcommunity.activity.fragment.ServiceCaftsDetailFrag>
    {


        @Override
        public cn.hi028.android.highcommunity.activity.fragment.ServiceCaftsDetailFrag build() {
            ServiceCaftsDetailFrag_ fragment_ = new ServiceCaftsDetailFrag_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
