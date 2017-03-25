package com.example.cesar.bottomsheet;

/**
 * Created by Cesar on 04/02/2017.
 */

import android.os.Bundle;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MiBottomSheetDialogFragment extends BottomSheetDialogFragment {

    static MiBottomSheetDialogFragment newInstance() {
        return new MiBottomSheetDialogFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.modal, container, false);
        return v;
    }
}
