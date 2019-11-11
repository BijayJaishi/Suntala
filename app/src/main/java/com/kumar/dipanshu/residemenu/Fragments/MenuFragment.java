package com.kumar.dipanshu.residemenu.Fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.kumar.dipanshu.residemenu.MainActivity;
import com.kumar.dipanshu.residemenu.R;

public class MenuFragment extends Fragment {

    Button dashboard, ourmenu, allproducts, cart,login;


    public MenuFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.menu_fragment, container, false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

         dashboard = view.findViewById(R.id.DashboardButton);
         ourmenu = view.findViewById(R.id.ourmenuButton);
         allproducts = view.findViewById(R.id.allproductsButton);
         cart = view.findViewById(R.id.cartButton);
         login = view.findViewById(R.id.loginButton);
         ImageView btnClose = view.findViewById(R.id.btnClose);


        dashboard.setBackgroundColor(getResources().getColor(R.color.colorAccent));

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.viewPager.setCurrentItem(1);
            }
        });

        if (isVisible()){
            dashboard.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    dashboard.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    ourmenu.setBackgroundColor(getResources().getColor(R.color.white));
                    allproducts.setBackgroundColor(getResources().getColor(R.color.white));
                    cart.setBackgroundColor(getResources().getColor(R.color.white));
                    login.setBackgroundColor(getResources().getColor(R.color.white));
                    Toast.makeText(getContext(), "You clicked Dashboard", Toast.LENGTH_SHORT).show();
                    getFragmentManager().beginTransaction().replace(R.id.contentPage,new Dashboardfragment()).commit();
                    MainActivity.viewPager.setCurrentItem(1);
                }
            });

            ourmenu.setOnClickListener(new View.OnClickListener() {
                //            @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View v) {
                    ourmenu.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    dashboard.setBackgroundColor(getResources().getColor(R.color.white));
                    allproducts.setBackgroundColor(getResources().getColor(R.color.white));
                    cart.setBackgroundColor(getResources().getColor(R.color.white));
                    login.setBackgroundColor(getResources().getColor(R.color.white));
                    Toast.makeText(getContext(), "You clicked Our Menu", Toast.LENGTH_SHORT).show();
                    getFragmentManager().beginTransaction().replace(R.id.contentPage,new Allproducts_fragment()).commit();
                    MainActivity.viewPager.setCurrentItem(1);
                }
            });

            cart.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    cart.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    ourmenu.setBackgroundColor(getResources().getColor(R.color.white));
                    login.setBackgroundColor(getResources().getColor(R.color.white));
                    dashboard.setBackgroundColor(getResources().getColor(R.color.white));
                    allproducts.setBackgroundColor(getResources().getColor(R.color.white));
                    Toast.makeText(getContext(), "You clicked Cart", Toast.LENGTH_SHORT).show();
                    getFragmentManager().beginTransaction().replace(R.id.contentPage,new Dashboardfragment()).commit();
                    MainActivity.viewPager.setCurrentItem(1);
                }
            });

            allproducts.setOnClickListener(new View.OnClickListener() {
                //            @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View v) {
                    allproducts.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    dashboard.setBackgroundColor(getResources().getColor(R.color.white));
                    cart.setBackgroundColor(getResources().getColor(R.color.white));
                    ourmenu.setBackgroundColor(getResources().getColor(R.color.white));
                    login.setBackgroundColor(getResources().getColor(R.color.white));
                    Toast.makeText(getContext(), "You clicked All Products", Toast.LENGTH_SHORT).show();
                    getFragmentManager().beginTransaction().replace(R.id.contentPage,new Allproducts_fragment()).commit();
                    MainActivity.viewPager.setCurrentItem(1);
                }
            });

            login.setOnClickListener(new View.OnClickListener() {
                //            @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View v) {
                    login.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    dashboard.setBackgroundColor(getResources().getColor(R.color.white));
                    cart.setBackgroundColor(getResources().getColor(R.color.white));
                    ourmenu.setBackgroundColor(getResources().getColor(R.color.white));
                    allproducts.setBackgroundColor(getResources().getColor(R.color.white));
                    Toast.makeText(getContext(), "You clicked Login", Toast.LENGTH_SHORT).show();
                    getFragmentManager().beginTransaction().replace(R.id.contentPage,new Allproducts_fragment()).commit();
                    MainActivity.viewPager.setCurrentItem(1);
                }
            });
        }



//        home.setOnClickListener(this);
//        ourmenu.setOnClickListener(this);
//        allproducts.setOnClickListener(this);
//        cart.setOnClickListener(this);
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
//                getFragmentManager().beginTransaction().replace(R.id.contentPage,new Allproducts_fragment()).commit();
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
        if (dashboard.isSelected()){

            dashboard.setBackgroundColor(color);
        }else{
            dashboard.setBackgroundColor(R.color.colorPrimary);
        }

        if (ourmenu.isSelected()){

            ourmenu.setBackgroundColor(color);
        }else{
            ourmenu.setBackgroundColor(R.color.colorPrimary);
        }
    }

}