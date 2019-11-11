package com.kumar.dipanshu.residemenu.Fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kumar.dipanshu.residemenu.Model_class;
import com.kumar.dipanshu.residemenu.R;
import com.kumar.dipanshu.residemenu.recycler_adapter.Productlist_adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Allproducts_fragment extends Fragment {

    Productlist_adapter productlist_adapter;
    RecyclerView productrecycle;
    List<Model_class>model_classes;


    public Allproducts_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.allproducts_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        productrecycle = view.findViewById(R.id.productrecycle);

        model_classes = new ArrayList<>();
        model_classes.add(new Model_class("1",R.drawable.tropicana,"Tropicana Smooth Juice","Rs 5000.00","Orange Juice","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));

        model_classes.add(new Model_class("2",R.drawable.tropicana,"Tropicana Smooth Juice","Rs 5000.00","Orange Juice","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));

        model_classes.add(new Model_class("1",R.drawable.tropicana,"Tropicana Smooth Juice","Rs 5000.00","Orange Juice","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
        model_classes.add(new Model_class("1",R.drawable.tropicana,"Tropicana Smooth Juice","Rs 5000.00","Orange Juice","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
        model_classes.add(new Model_class("1",R.drawable.tropicana,"Tropicana Smooth Juice","Rs 5000.00","Orange Juice","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
        model_classes.add(new Model_class("1",R.drawable.tropicana,"Tropicana Smooth Juice","Rs 5000.00","Orange Juice","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
        model_classes.add(new Model_class("1",R.drawable.tropicana,"Tropicana Smooth Juice","Rs 5000.00","Orange Juice","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
        model_classes.add(new Model_class("1",R.drawable.tropicana,"Tropicana Smooth Juice","Rs 5000.00","Orange Juice","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."));
        productrecycle.setHasFixedSize(true);
        productrecycle.setLayoutManager( new LinearLayoutManager(getActivity()));

        productlist_adapter = new Productlist_adapter(getContext(),model_classes);
        productrecycle.setAdapter(productlist_adapter);



//        ImageView gitHub = (ImageView) view.findViewById(R.id.gitHubImageView);
//        TextView codeGitHub = (TextView) view.findViewById(R.id.gitHubTextView);
//
//        gitHub.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String url = "https://github.com/dipanshukr/Reside_Menu";
//                Intent intentGithub = new Intent(Intent.ACTION_VIEW);
//                intentGithub.setData(Uri.parse(url));
//                startActivity(intentGithub);
//            }
//        });
//        codeGitHub.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String url = "https://github.com/dipanshukr/Reside_Menu";
//                Intent intentGithub = new Intent(Intent.ACTION_VIEW);
//                intentGithub.setData(Uri.parse(url));
//                startActivity(intentGithub);
//            }
//        });
    }

}
