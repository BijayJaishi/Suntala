package com.kumar.dipanshu.residemenu.Fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.kumar.dipanshu.residemenu.MainActivity;
import com.kumar.dipanshu.residemenu.Model_classpopular;
import com.kumar.dipanshu.residemenu.Model_newitem;
import com.kumar.dipanshu.residemenu.R;
import com.kumar.dipanshu.residemenu.recycler_adapter.Newitemlist_adapter;
import com.kumar.dipanshu.residemenu.recycler_adapter.Popularjuicelist_adapter;
import java.util.ArrayList;
import java.util.List;

public class Dashboardfragment extends Fragment {

    Newitemlist_adapter newitemlist_adapter;
    RecyclerView secondrecycle;
    Popularjuicelist_adapter popularjuicelist_adapter;
    RecyclerView firstrecycle;
    List<Model_classpopular> model_classpopulars;
    List<Model_newitem>model_newitems;

    public Dashboardfragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.dashboard_fragment, container, false);


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button title_bar_left_menu = view.findViewById(R.id.title_bar_left_menu);

        firstrecycle = view.findViewById(R.id.firstrecycle);
        secondrecycle = view.findViewById(R.id.secondrecycle);
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

        model_classpopulars = new ArrayList<>();
        model_classpopulars.add(new Model_classpopular("1",R.drawable.cardorange,"Orange Juice","Nrs. 500","(1 CAN)","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
        model_classpopulars.add(new Model_classpopular("1",R.drawable.cardorange,"Orange Juice","Nrs. 500","(1 CAN)","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
        model_classpopulars.add(new Model_classpopular("1",R.drawable.cardorange,"Orange Juice","Nrs. 500","(1 CAN)","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
        model_classpopulars.add(new Model_classpopular("1",R.drawable.cardorange,"Orange Juice","Nrs. 500","(1 CAN)","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
        model_classpopulars.add(new Model_classpopular("1",R.drawable.cardorange,"Orange Juice","Nrs. 500","(1 CAN)","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
        model_classpopulars.add(new Model_classpopular("1",R.drawable.cardorange,"Orange Juice","Nrs. 500","(1 CAN)","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
        model_classpopulars.add(new Model_classpopular("1",R.drawable.cardorange,"Orange Juice","Nrs. 500","(1 CAN)","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
        model_classpopulars.add(new Model_classpopular("1",R.drawable.cardorange,"Orange Juice","Nrs. 500","(1 CAN)","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
        model_classpopulars.add(new Model_classpopular("1",R.drawable.cardorange,"Orange Juice","Nrs. 500","(1 CAN)","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
        model_classpopulars.add(new Model_classpopular("1",R.drawable.cardorange,"Orange Juice","Nrs. 500","(1 CAN)","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));

        firstrecycle.setHasFixedSize(true);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        firstrecycle.setLayoutManager(layoutManager);
        popularjuicelist_adapter = new Popularjuicelist_adapter(getActivity(),model_classpopulars);
        firstrecycle.setAdapter(popularjuicelist_adapter);


        model_newitems = new ArrayList<>();
        model_newitems.add(new Model_newitem("1","Water Melon",R.drawable.watermelon,"NRS.750"));
        model_newitems.add(new Model_newitem("1","Water Melon",R.drawable.watermelon,"NRS.750"));
        model_newitems.add(new Model_newitem("1","Water Melon",R.drawable.watermelon,"NRS.750"));
        model_newitems.add(new Model_newitem("1","Water Melon",R.drawable.watermelon,"NRS.750"));
        model_newitems.add(new Model_newitem("1","Water Melon",R.drawable.watermelon,"NRS.750"));
        model_newitems.add(new Model_newitem("1","Water Melon",R.drawable.watermelon,"NRS.750"));
        model_newitems.add(new Model_newitem("1","Water Melon",R.drawable.watermelon,"NRS.750"));
        model_newitems.add(new Model_newitem("1","Water Melon",R.drawable.watermelon,"NRS.750"));

        secondrecycle.setHasFixedSize(true);
        LinearLayoutManager layoutManagersecond
                = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        secondrecycle.setLayoutManager(layoutManagersecond);

        newitemlist_adapter = new Newitemlist_adapter(getActivity(),model_newitems);
        secondrecycle.setAdapter(newitemlist_adapter);

    }

//    @Override
//    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
//        super.onCreateOptionsMenu(menu, inflater);
//
//        inflater.inflate(R.menu.toolbar_menus,menu);
//    }
}