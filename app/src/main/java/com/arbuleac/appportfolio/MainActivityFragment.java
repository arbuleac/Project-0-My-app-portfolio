package com.arbuleac.appportfolio;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.arbuleac.appportfolio.ui.fragment.BaseFragment;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


public class MainActivityFragment extends BaseFragment {


    @InjectView(R.id.capstone_btn)
    Button capstoneBtn;

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

    @OnClick(R.id.spotify_btn)
    void onSpotifyClicked() {
        displayMessage("This button will launch Spotify player");
    }

    @OnClick(R.id.scores_btn)
    void onScoresClicked() {
        displayMessage("This button will launch Scores app");
    }

    @OnClick(R.id.library_btn)
    void onLibraryClicked() {
        displayMessage("This button will launch Library app");
    }

    @OnClick(R.id.build_bigger_btn)
    void onBuildBiggerClicked() {
        displayMessage("This button will launch Build It Bigger");
    }

    @OnClick(R.id.xyz_reader_btn)
    void onXYZReaderClicked() {
        displayMessage("This button will launch XYZ Reader");
    }

    @OnClick(R.id.capstone_btn)
    void onCapstoneClicked() {
        displayMessage("This button will launch my precious!");
    }


    private void displayMessage(String message) {
        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
    }
}
