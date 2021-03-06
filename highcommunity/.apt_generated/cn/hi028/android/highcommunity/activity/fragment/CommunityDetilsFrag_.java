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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import cn.hi028.android.highcommunity.R.layout;
import com.don.view.CircleImageView;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class CommunityDetilsFrag_
    extends cn.hi028.android.highcommunity.activity.fragment.CommunityDetilsFrag
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
            contentView_ = inflater.inflate(layout.frag_comm_detail, container, false);
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

    public static CommunityDetilsFrag_.FragmentBuilder_ builder() {
        return new CommunityDetilsFrag_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        mSpeakerContent = ((EditText) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ev_communitydetails_spokerContent));
        mNodata = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_NoticeDetails_noData));
        mSpeakerButton = ((ImageView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ev_communitydetails_spokerButton));
        mProgress = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ll_NoticeDetails_Progress);
        mSpeakerLayout = ((LinearLayout) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ll_communitydetails_spokerLayout));
        mList = ((ListView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ptrlv_communitydetails_listview));
        mSpeakerImage = ((CircleImageView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.civ_communitydetails_spokerImage));
        if (mSpeakerButton!= null) {
            mSpeakerButton.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    CommunityDetilsFrag_.this.Comment();
                }

            }
            );
        }
        {
            View view = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.civl_commDetails_avatar);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        CommunityDetilsFrag_.this.toUser();
                    }

                }
                );
            }
        }
        initView();
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<CommunityDetilsFrag_.FragmentBuilder_, cn.hi028.android.highcommunity.activity.fragment.CommunityDetilsFrag>
    {


        @Override
        public cn.hi028.android.highcommunity.activity.fragment.CommunityDetilsFrag build() {
            CommunityDetilsFrag_ fragment_ = new CommunityDetilsFrag_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
