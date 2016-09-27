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
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class AboutUsFrag_
    extends cn.hi028.android.highcommunity.activity.fragment.AboutUsFrag
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
            contentView_ = inflater.inflate(layout.frag_aboutus, container, false);
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

    public static AboutUsFrag_.FragmentBuilder_ builder() {
        return new AboutUsFrag_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        mAppVersion = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_AboutUs_AppVersion));
        mFunctionIntro = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_AboutUs_FunctionIntro));
        mUpdateContent = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_AboutUs_UpdateContent));
        mProtocol = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_AboutUs_Protocol));
        mContactUs = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_AboutUs_ContactUs));
        mShare = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_AboutUs_Share));
        if (mFunctionIntro!= null) {
            mFunctionIntro.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    AboutUsFrag_.this.functionIntro();
                }

            }
            );
        }
        if (mProtocol!= null) {
            mProtocol.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    AboutUsFrag_.this.protocolTo();
                }

            }
            );
        }
        if (mShare!= null) {
            mShare.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    AboutUsFrag_.this.share();
                }

            }
            );
        }
        if (mContactUs!= null) {
            mContactUs.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    AboutUsFrag_.this.constactUs();
                }

            }
            );
        }
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<AboutUsFrag_.FragmentBuilder_, cn.hi028.android.highcommunity.activity.fragment.AboutUsFrag>
    {


        @Override
        public cn.hi028.android.highcommunity.activity.fragment.AboutUsFrag build() {
            AboutUsFrag_ fragment_ = new AboutUsFrag_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
