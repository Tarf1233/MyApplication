package com.whatever.myapplication.activitys;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.whatever.myapplication.R;

public class CustomerShowActivity extends AppCompatActivity {
    private SliderLayout sliderLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_show);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

        sliderLayout = findViewById(R.id.slider);

        TextSliderView textSliderView = new TextSliderView(this);

        textSliderView.description("Pattaya");
        textSliderView.image("https://pix10.agoda.net/hotelImages/115/1157073/1157073_16062412150044053329.jpg");
        sliderLayout.addSlider(textSliderView);

        TextSliderView textSliderView2 = new TextSliderView(this);

        textSliderView2.description("Banja Luka");
        textSliderView2.image("https://lh-i.global.ssl.fastly.net/images/holidays/42abc0e7d35266ae9aebad33cb2ee766d7790c35/italy/sicily/palermo/nh-palermo-0.jpg");
        sliderLayout.addSlider(textSliderView2);

        TextSliderView textSliderView3 = new TextSliderView(this);

        textSliderView3.description("Marselha");
        textSliderView3.image("https://media.iceportal.com/25684/photos/0120739_L.jpg");
        sliderLayout.addSlider(textSliderView3);

        TextSliderView textSliderView4 = new TextSliderView(getApplicationContext());

        textSliderView4.description("Redentor");
        textSliderView4.image("http://media.melhoresdestinos.com.br/2017/06/cristo-redentor-800x533.jpg");
        textSliderView4.setScaleType(BaseSliderView.ScaleType.Fit);
        sliderLayout.addSlider(textSliderView4);

        sliderLayout.startAutoCycle();
        sliderLayout.setPresetTransformer(SliderLayout.Transformer.Accordion);
        //sliderLayout.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        //sliderLayout.setCustomAnimation(new DescriptionAnimation());
        //sliderLayout.setDuration(4000);
        //sliderLayout.addOnPageChangeListener(this);

    }

}
