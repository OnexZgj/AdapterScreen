package com.example.onexzgj.screenutils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.widget.TextView;

import com.example.onexzgj.screenutils.utils.ScreenUtils;
import com.example.onexzgj.screenutils.utils.UiUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ScreenAdapterActivity extends AppCompatActivity {

    @BindView(R.id.tv_asa_default_density)
    TextView tvAsaDefaultDensity;
    @BindView(R.id.tv_asa_update_density)
    TextView tvAsaUpdateDensity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        float defaultScreenDensityDpi = UiUtils.getScreenDensity();

        ScreenUtils.adaptScreen4VerticalSlide(this, 360);

        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();

        float updateScreenDensity = UiUtils.getScreenDensity();

        setContentView(R.layout.activity_screen_adapter);
        ButterKnife.bind(this);

        tvAsaDefaultDensity.setText(""+defaultScreenDensityDpi);
        tvAsaUpdateDensity.setText(""+displayMetrics.density);

        ScreenUtils.cancelAdaptScreen(this);
    }
}
