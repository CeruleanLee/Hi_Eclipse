//
// DO NOT EDIT THIS FILE.Generated using AndroidAnnotations 3.3.2.
//  You can create a larger work that contains this file and distribute that work under terms of your choice.
//


package cn.hi028.android.highcommunity.activity.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import cn.hi028.android.highcommunity.R.layout;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class GroupFrag_
    extends cn.hi028.android.highcommunity.activity.fragment.GroupFrag
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
            contentView_ = inflater.inflate(layout.frag_group, container, false);
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

    public static GroupFrag_.FragmentBuilder_ builder() {
        return new GroupFrag_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        mCreate = ((ImageView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_group_create));
        mHot = ((RadioButton) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_group_hot));
        mNodata = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_group_nodata));
        mMine = ((RadioButton) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_group_mine));
        mListView = ((PullToRefreshListView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ptrlv_group_listview));
        mNew = ((RadioButton) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_group_new));
        mProgress = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.pg_grouplayout_progress);
        mKeywords = ((ImageView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.et_groupclass_search));
        initView();
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<GroupFrag_.FragmentBuilder_, cn.hi028.android.highcommunity.activity.fragment.GroupFrag>
    {


        @Override
        public cn.hi028.android.highcommunity.activity.fragment.GroupFrag build() {
            GroupFrag_ fragment_ = new GroupFrag_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
