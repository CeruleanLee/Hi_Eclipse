/***************************************************************************
 * Copyright (c) by raythinks.com, Inc. All Rights Reserved
 **************************************************************************/

package cn.hi028.android.highcommunity.activity.fragment;

import android.content.Intent;
import android.os.AsyncTask;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import com.don.tools.BpiHttpHandler;
import com.don.tools.GeneratedClassUtils;

import net.duohuo.dhroid.activity.BaseFragment;
import net.duohuo.dhroid.util.ListUtils;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cn.hi028.android.highcommunity.R;
import cn.hi028.android.highcommunity.activity.HuiLifeSecondAct;
import cn.hi028.android.highcommunity.activity.ServiceAct;
import cn.hi028.android.highcommunity.adapter.HuiChipsAdapter;
import cn.hi028.android.highcommunity.bean.ChipsBean;
import cn.hi028.android.highcommunity.bean.HSuppGdDefBean;
import cn.hi028.android.highcommunity.bean.VallageCityBean;
import cn.hi028.android.highcommunity.bean.VallageSelectBean;
import cn.hi028.android.highcommunity.utils.CharacterParser;
import cn.hi028.android.highcommunity.utils.Constacts;
import cn.hi028.android.highcommunity.utils.HTTPHelper;
import cn.hi028.android.highcommunity.utils.pinyinUtils.PinyinCityComparator;

/**
 * @功能：厨房众筹<br>
 * @作者： 赵海<br>
 * @版本：1.0<br>
 * @时间：2016-01-15<br>
 */
@EFragment(resName = "frag_hui_chips")
public class HuiChipsFrag extends BaseFragment {
    @ViewById(R.id.gv_chips)
    GridView gv_chips;
    HuiChipsAdapter adapter;
    @ViewById(R.id.tv_NoticeDetails_noData)
    TextView mNoData;
    @ViewById(R.id.ll_NoticeDetails_Progress)
    View mProgress;

    @AfterViews
    void intView() {
        adapter = new HuiChipsAdapter(this);
        gv_chips.setAdapter(adapter);
        gv_chips.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent mIntent = new Intent(getActivity(), GeneratedClassUtils.get(HuiLifeSecondAct.class));
                mIntent.putExtra(HuiLifeSecondAct.ACTIVITYTAG, Constacts.HUILIFE_CHIPS_DETAIL);
                mIntent.putExtra(HuiLifeSecondAct.INTENTTAG, adapter.getData().get(position));
                startActivity(mIntent);
            }
        });

    }

    @Override
    public void onResume() {
        super.onResume();
        HTTPHelper.GetHuiChipsList(mIbpi);
    }

    BpiHttpHandler.IBpiHttpHandler mIbpi = new BpiHttpHandler.IBpiHttpHandler() {
        @Override
        public void onError(int id, String message) {
            mProgress.setVisibility(View.GONE);
        }

        @Override
        public void onSuccess(Object message) {
            mProgress.setVisibility(View.GONE);
            if (null == message)
                return;
            List<ChipsBean> data = (List<ChipsBean>) message;
            adapter.setData(data);
        }

        @Override
        public Object onResolve(String result) {
            return HTTPHelper.ResolveHuiChipsList(result);
        }

        @Override
        public void setAsyncTask(AsyncTask asyncTask) {

        }

        @Override
        public void cancleAsyncTask() {
            mProgress.setVisibility(View.GONE);
        }
    };
}
