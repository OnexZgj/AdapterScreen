package com.example.onexzgj.screenutils;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.onexzgj.screenutils.utils.UiUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_density)
    TextView tvDensity;
    @BindView(R.id.tv_width)
    TextView tvWidth;
    @BindView(R.id.tv_height)
    TextView tvHeight;
    @BindView(R.id.tv_dpi)
    TextView tvDpi;
    @BindView(R.id.tv_computer_dpi)
    TextView tvComputerDpi;
    @BindView(R.id.tv_state_bar_height)
    TextView tvStateBarHeight;
    @BindView(R.id.btn_am_adapter)
    Button btnAmAdapter;
    @BindView(R.id.tv_width_screen)
    TextView tvWidthScreen;
    @BindView(R.id.btn_am_value_adapter)
    Button btnAmValueAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        tvWidth.setText("" + UiUtils.getScreenWidth());
        tvHeight.setText("" + UiUtils.getScreenHeight());

        tvDensity.setText("" + UiUtils.getScreenDensity());
        tvDpi.setText("" + UiUtils.getScreenDensityDpi());


        ViewGroup.LayoutParams layoutParams = tvWidthScreen.getLayoutParams();
        int widthDp = (int) (UiUtils.getScreenWidth() / UiUtils.getScreenDensity());
        tvWidthScreen.setLayoutParams(layoutParams);
        tvWidthScreen.setText("" + UiUtils.getScreenDensityDpi());

        tvWidthScreen.setText("total width dp : " + widthDp);


        tvComputerDpi.setText("" + UiUtils.getComputerDpi(5.1f));

        tvStateBarHeight.setText("" + UiUtils.getStateBarHeight());

    }


    @OnClick({R.id.btn_am_adapter, R.id.btn_am_value_adapter})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_am_adapter:
                startActivity(new Intent(MainActivity.this,ScreenAdapterActivity.class));
                break;
            case R.id.btn_am_value_adapter:
                startActivity(new Intent(MainActivity.this,ValueAdapterActivity.class));
                break;
        }
    }
}
