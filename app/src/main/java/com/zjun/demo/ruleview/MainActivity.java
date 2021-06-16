package com.zjun.demo.ruleview;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bala.ruler.FeetView;
import com.bala.ruler.RuleView;

public class MainActivity extends AppCompatActivity {

    private TextView tvValue;
    private RuleView gvRule;
    private FeetView feetView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvValue = findViewById(R.id.tv_value);
        gvRule = findViewById(R.id.gv_1);
        feetView = findViewById(R.id.feetView);

        tvValue.setText(Float.toString(gvRule.getCurrentValue()));

        gvRule.setOnValueChangedListener(new RuleView.OnValueChangedListener() {
            @Override
            public void onValueChanged(float value) {
                tvValue.setText(Float.toString(value));
            }
        });


        feetView.setOnValueChangedListener(new FeetView.OnValueChangedListener() {
            @Override
            public void onValueChanged(float value) {
                tvValue.setText(Float.toString(value));
            }
        });
//
        feetView.setValue(2, 9, 5, 0.1f, 12);
        gvRule.setValue(0, 100, 3, 0.1f, 10);

    }


    public void onClick(View view) {
        toggleValue();
    }

    private void toggleSettingsShow(@IdRes int layoutId) {
        LinearLayout llSettings = findViewById(layoutId);
        llSettings.setVisibility(llSettings.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
    }

    private void toggleValue() {
        if (gvRule.getMinValue() == 11) {
            gvRule.setValue(0, 100, 50, 0.1f, 10);
        } else {
            gvRule.setValue(11, 20, 15, 0.2f, 5);
        }
    }


}
