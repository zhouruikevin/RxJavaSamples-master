package com.example.oldjava.ui.fragment;

import android.app.Fragment;

import okhttp3.Call;

/**
 * Created by Administrator on 2016/6/22.
 */
public abstract class BaseFragment extends Fragment {

    protected Call call;
//    @OnClick(R.id.btnTips)
//    void tips() {
//        new AlertDialog.Builder(getActivity())
//                .setTitle(getTitleRes())
//                .setView(getActivity().getLayoutInflater().inflate(getDialogRes(), null))
//                .show();
//    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (call != null && !call.isCanceled()) {
            call.cancel();
        }
    }

    protected abstract int getDialogRes();

    protected abstract int getTitleRes();
}