package com.kumar.dipanshu.residemenu.Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import com.kumar.dipanshu.residemenu.MainActivity;
import com.kumar.dipanshu.residemenu.R;

public class Dashboardfragment extends Fragment {
    Toolbar toolbar;

    public Dashboardfragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.dashboard_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView gitHub = (ImageView) view.findViewById(R.id.gitHubImageView);
        TextView codeGitHub = (TextView) view.findViewById(R.id.gitHubTextView);
        Button title_bar_left_menu = view.findViewById(R.id.title_bar_left_menu);
//        toolbar = view.findViewById(R.id.tool_bar);
//
//
//        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
//        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(null);
//
//        setHasOptionsMenu(true);


        title_bar_left_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                MainActivity.viewPager.getCurrentItem() == 0 ?  : MainActivity.viewPager.setCurrentItem(0);


                if (MainActivity.viewPager.getCurrentItem() == 0){
                    MainActivity.viewPager.setCurrentItem(1);
                }else{

                    MainActivity.viewPager.setCurrentItem(0);
                }
            }
        });

        gitHub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://github.com/dipanshukr/Reside_Menu";
                Intent intentGithub = new Intent(Intent.ACTION_VIEW);
                intentGithub.setData(Uri.parse(url));
                startActivity(intentGithub);
            }
        });
        codeGitHub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://github.com/dipanshukr/Reside_Menu";
                Intent intentGithub = new Intent(Intent.ACTION_VIEW);
                intentGithub.setData(Uri.parse(url));
                startActivity(intentGithub);
            }
        });
    }

//    @Override
//    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
//        super.onCreateOptionsMenu(menu, inflater);
//
//        inflater.inflate(R.menu.toolbar_menus,menu);
//    }
}