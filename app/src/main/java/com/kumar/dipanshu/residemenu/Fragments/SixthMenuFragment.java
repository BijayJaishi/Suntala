package com.kumar.dipanshu.residemenu.Fragments;

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

public class SixthMenuFragment extends Fragment {
    Button share, about;


    public SixthMenuFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sixth_menu, container, false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        share = view.findViewById(R.id.shareButton);
        about = view.findViewById(R.id.aboutButton);
        ImageView btnClose = view.findViewById(R.id.btnClose);

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.viewPager.setCurrentItem(1);
            }
        });

        if (getActivity() != null) {
            if (isVisible()) {


                share.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        share.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                        about.setBackgroundColor(getResources().getColor(R.color.white));
                        Toast.makeText(getContext(), "You clicked Share", Toast.LENGTH_SHORT).show();
                        MainActivity.viewPager.setCurrentItem(1);
                    }
                });

                about.setOnClickListener(new View.OnClickListener() {
                    //            @SuppressLint("ResourceAsColor")
                    @Override
                    public void onClick(View v) {
                        about.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                        share.setBackgroundColor(getResources().getColor(R.color.white));
                        Toast.makeText(getContext(), "You clicked About", Toast.LENGTH_SHORT).show();
                        MainActivity.viewPager.setCurrentItem(1);
                    }
                });


            }
        }
    }
}

