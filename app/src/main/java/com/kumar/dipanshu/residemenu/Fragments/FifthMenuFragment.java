package com.kumar.dipanshu.residemenu.Fragments;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import com.kumar.dipanshu.residemenu.MainActivity;
import com.kumar.dipanshu.residemenu.R;

public class FifthMenuFragment extends Fragment {

    Button home,profile,calendar,settings;
     FrameLayout frameLayout;

    public FifthMenuFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fifth_menu, container, false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

         home = view.findViewById(R.id.homeButton);
         profile = view.findViewById(R.id.profileButton);
         calendar = view.findViewById(R.id.calendarButton);
         settings = view.findViewById(R.id.settingsButton);
         frameLayout = view.findViewById(R.id.menuFirst);
        ImageView btnClose = view.findViewById(R.id.btnClose);


        home.setBackgroundColor(getResources().getColor(R.color.colorAccent));

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.viewPager.setCurrentItem(1);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                home.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                profile.setBackgroundColor(getResources().getColor(R.color.white));
                Toast.makeText(getContext(), "You clicked Dashboard", Toast.LENGTH_SHORT).show();
                getFragmentManager().beginTransaction().replace(R.id.contentPage,new ContentFragment()).commit();
                MainActivity.viewPager.setCurrentItem(1);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                profile.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                home.setBackgroundColor(getResources().getColor(R.color.white));
                Toast.makeText(getContext(), "You clicked Our Menu", Toast.LENGTH_SHORT).show();
                getFragmentManager().beginTransaction().replace(R.id.contentPage,new HomeFragment()).commit();
                MainActivity.viewPager.setCurrentItem(1);
            }
        });

//        home.setOnClickListener(this);
//        profile.setOnClickListener(this);
//        calendar.setOnClickListener(this);
//        settings.setOnClickListener(this);
    }

//    @SuppressLint("ResourceAsColor")
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.homeButton:
//
//                setBackColor(R.color.colorAccent);
//
//                break;
//            case R.id.profileButton:
//                setBackColor(R.color.colorAccent);
////                v.setBackgroundColor(R.color.colorAccent);
//                getFragmentManager().beginTransaction().replace(R.id.contentPage,new HomeFragment()).commit();
//                MainActivity.viewPager.setCurrentItem(1);
//                Toast.makeText(getContext(), "You clicked PROFILE", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.calendarButton:
//                Toast.makeText(getContext(), "You clicked CALENDAR", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.settingsButton:
//                Toast.makeText(getContext(), "You clicked SETTINGS", Toast.LENGTH_SHORT).show();
//                break;
//        }
//    }

    @SuppressLint("ResourceAsColor")
    public void setBackColor(int color){
        if (home.isSelected()){

            home.setBackgroundColor(color);
        }else{
            home.setBackgroundColor(R.color.colorPrimary);
        }

        if (profile.isSelected()){

            profile.setBackgroundColor(color);
        }else{
            profile.setBackgroundColor(R.color.colorPrimary);
        }
    }

}