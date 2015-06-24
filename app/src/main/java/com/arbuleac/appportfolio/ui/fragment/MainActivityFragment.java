package com.arbuleac.appportfolio.ui.fragment;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.arbuleac.appportfolio.R;
import com.arbuleac.appportfolio.ui.fragment.BaseFragment;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


public class MainActivityFragment extends BaseFragment {


    @InjectView(R.id.capstone_btn)
    Button capstoneBtn;

    private Toast mToast;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.inject(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        capstoneBtn.getBackground().setColorFilter(getResources().getColor(R.color.colorSpecial), PorterDuff.Mode.MULTIPLY);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    @OnClick({R.id.spotify_btn, R.id.scores_btn, R.id.library_btn, R.id.build_bigger_btn, R.id.xyz_reader_btn, R.id.capstone_btn})
    void onSpotifyClicked(Button button) {
        displayMessage("This button will launch " + button.getText());
    }


    private void displayMessage(String message) {
        if (mToast != null) {
            mToast.cancel();
        }
        mToast = Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT);
        mToast.show();
    }
}
