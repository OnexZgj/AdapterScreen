package com.example.onexzgj.screenutils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.ViewTreeObserver;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ValueAdapterActivity extends AppCompatActivity {

    @BindView(R.id.tv_ava_show)
    TextView tvAvaShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_adapter);
        ButterKnife.bind(this);


        tvAvaShow.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                int width = tvAvaShow.getMeasuredWidth();

                DisplayMetrics displayMetrics = ValueAdapterActivity.this.getResources().getDisplayMetrics();
                float density = displayMetrics.density;

                int  tvdp= (int) (width/density);

                tvAvaShow.setText("width px: " +width +"width dp : "+tvdp);


            }
        });

    }
}
