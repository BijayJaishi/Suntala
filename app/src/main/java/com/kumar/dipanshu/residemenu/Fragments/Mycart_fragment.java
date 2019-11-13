package com.kumar.dipanshu.residemenu.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kumar.dipanshu.residemenu.ExpandableHeightListView;
import com.kumar.dipanshu.residemenu.Model_mycart;
import com.kumar.dipanshu.residemenu.R;
import com.kumar.dipanshu.residemenu.recycler_adapter.Expandablelistcart_adapter;

import java.util.ArrayList;
import java.util.List;

public class Mycart_fragment extends Fragment {

    Expandablelistcart_adapter expandablelistcart_adapter;
    List<Model_mycart>model_mycarts;
    ExpandableHeightListView expandableHeightListView;

    public Mycart_fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_mycart_fragment, container, false);


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        expandableHeightListView = view.findViewById(R.id.expandableHeightview);

        model_mycarts = new ArrayList<>();
        model_mycarts.add(new Model_mycart("1",R.drawable.tropicana,"Tropicana Smooth Juice","Rs 5000.00","Orange Juice","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
        model_mycarts.add(new Model_mycart("1",R.drawable.tropicana,"Tropicana Smooth Juice","Rs 5000.00","Orange Juice","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
        model_mycarts.add(new Model_mycart("1",R.drawable.tropicana,"Tropicana Smooth Juice","Rs 5000.00","Orange Juice","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
        model_mycarts.add(new Model_mycart("1",R.drawable.tropicana,"Tropicana Smooth Juice","Rs 5000.00","Orange Juice","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
        model_mycarts.add(new Model_mycart("1",R.drawable.tropicana,"Tropicana Smooth Juice","Rs 5000.00","Orange Juice","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
        model_mycarts.add(new Model_mycart("1",R.drawable.tropicana,"Tropicana Smooth Juice","Rs 5000.00","Orange Juice","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
        model_mycarts.add(new Model_mycart("1",R.drawable.tropicana,"Tropicana Smooth Juice","Rs 5000.00","Orange Juice","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
        model_mycarts.add(new Model_mycart("1",R.drawable.tropicana,"Tropicana Smooth Juice","Rs 5000.00","Orange Juice","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
        model_mycarts.add(new Model_mycart("1",R.drawable.tropicana,"Tropicana Smooth Juice","Rs 5000.00","Orange Juice","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
        model_mycarts.add(new Model_mycart("1",R.drawable.tropicana,"Tropicana Smooth Juice","Rs 5000.00","Orange Juice","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
        model_mycarts.add(new Model_mycart("1",R.drawable.tropicana,"Tropicana Smooth Juice","Rs 5000.00","Orange Juice","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
        model_mycarts.add(new Model_mycart("1",R.drawable.tropicana,"Tropicana Smooth Juice","Rs 5000.00","Orange Juice","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
        model_mycarts.add(new Model_mycart("1",R.drawable.tropicana,"Tropicana Smooth Juice","Rs 5000.00","Orange Juice","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));


        expandablelistcart_adapter = new Expandablelistcart_adapter(getActivity(),0,model_mycarts);
        expandableHeightListView.setAdapter(expandablelistcart_adapter);
        expandableHeightListView.setExpanded(true);
    }




}
