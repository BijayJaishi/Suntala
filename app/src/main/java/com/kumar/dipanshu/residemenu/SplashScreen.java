package com.kumar.dipanshu.residemenu;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    ImageView pattern,logo,title,leaf,juice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        pattern = (ImageView)findViewById(R.id.sape);
        logo = (ImageView)findViewById(R.id.logo);
        title =(ImageView)findViewById(R.id.slogan);
        leaf =(ImageView)findViewById(R.id.leaf);
        juice = (ImageView)findViewById(R.id.juice);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation);
        logo.setAnimation(animation);
        title.setAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                    finish();
                    startActivity(new Intent(getApplicationContext(),Login_activity.class));
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });





    }
}
