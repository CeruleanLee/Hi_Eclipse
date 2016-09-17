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
import cn.hi028.android.highcommunity.R.layout;
import com.handmark.pulltorefresh.library.PullToRefreshGridView;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView;
import net.duohuo.dhroid.view.AutoScrollViewPager;
import net.duohuo.dhroid.view.CirclePageIndicator;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class ServiceFrag_
    extends cn.hi028.android.highcommunity.activity.fragment.ServiceFrag
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
            contentView_ = inflater.inflate(layout.frag_service, container, false);
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

    public static ServiceFrag_.FragmentBuilder_ builder() {
        return new ServiceFrag_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        mGridView = ((PullToRefreshGridView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ptrgv_service_thirdParty));
        viewPager = ((AutoScrollViewPager) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.view_pager));
        vgcpi = ((CirclePageIndicator) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.home_cpi));
        mScrollview = ((PullToRefreshScrollView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.service_scrollView_layout));
        {
            View view = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ll_service_research);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        ServiceFrag_.this.research();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ll_service_notice);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        ServiceFrag_.this.notice();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ll_service_craftsman);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        ServiceFrag_.this.crafts();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ll_service_tenement2);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        ServiceFrag_.this.tenement2();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ll_service_notice_one);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        ServiceFrag_.this.one();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ll_service_tenement);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        ServiceFrag_.this.tenement();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ll_service_guide);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        ServiceFrag_.this.guide();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ll_service_become_craftsman);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        ServiceFrag_.this.become();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ll_service_voluntary);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        ServiceFrag_.this.voluntary();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ll_service_payment);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        ServiceFrag_.this.payment();
                    }

                }
                );
            }
        }
        initView();
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<ServiceFrag_.FragmentBuilder_, cn.hi028.android.highcommunity.activity.fragment.ServiceFrag>
    {


        @Override
        public cn.hi028.android.highcommunity.activity.fragment.ServiceFrag build() {
            ServiceFrag_ fragment_ = new ServiceFrag_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
