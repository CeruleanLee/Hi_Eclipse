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
import android.widget.LinearLayout;
import android.widget.TextView;
import cn.hi028.android.highcommunity.R.layout;
import com.don.view.CircleImageView;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class UserInfoFrag_
    extends cn.hi028.android.highcommunity.activity.fragment.UserInfoFrag
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
            contentView_ = inflater.inflate(layout.frag_userinfo, container, false);
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

    public static UserInfoFrag_.FragmentBuilder_ builder() {
        return new UserInfoFrag_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        mSex = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_UserInfo_UserSex));
        mAge = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_UserInfo_UserAge));
        mAuth = ((LinearLayout) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ll_UserInfo_AuthZiliao));
        mProgress = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.progress_UserInfo);
        mIntro = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_UserInfo_UserIntro));
        mTitle = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_UserInfo_title));
        mName = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_UserInfo_NickName));
        mAvatar = ((CircleImageView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.civ_UserInfo_Avatar));
        mRight = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_UserInfo_RightnMenu));
        if (mRight!= null) {
            mRight.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    UserInfoFrag_.this.write();
                }

            }
            );
        }
        if (mAuth!= null) {
            mAuth.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    UserInfoFrag_.this.authClick();
                }

            }
            );
        }
        {
            View view = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.iv_UserInfo_back);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        UserInfoFrag_.this.back();
                    }

                }
                );
            }
        }
        initView();
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<UserInfoFrag_.FragmentBuilder_, cn.hi028.android.highcommunity.activity.fragment.UserInfoFrag>
    {


        @Override
        public cn.hi028.android.highcommunity.activity.fragment.UserInfoFrag build() {
            UserInfoFrag_ fragment_ = new UserInfoFrag_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
