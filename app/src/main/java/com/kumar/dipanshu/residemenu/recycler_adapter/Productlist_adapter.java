package com.kumar.dipanshu.residemenu.recycler_adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.kumar.dipanshu.residemenu.Model_class;
import com.kumar.dipanshu.residemenu.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bijay on 11/9/2019.
 */

public class Productlist_adapter extends RecyclerView.Adapter<Productlist_adapter.MyViewHolder> {

    Context context;
    List<Model_class> model_classes ;

    public Productlist_adapter(Context context, List<Model_class> model_classes) {
        this.context = context;
        this.model_classes = model_classes;
    }

    @Override
    public Productlist_adapter.MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.productlistrecycleview, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewholder, final int position) {

         final  Model_class model_class = model_classes.get(position);
        myViewholder.fruitname.setText(model_class.getFruitname());
        myViewholder.fruitcost.setText(model_class.getFruitcost());
        myViewholder.fruittype.setText(model_class.getFruittype());
        myViewholder.fruitimage.setImageResource(model_class.getImage());
        myViewholder.fruitdescription.setText(model_class.getFruitdescription());

    }

    @Override
    public int getItemCount() {
        return model_classes.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView fruitname, fruitcost, fruittype, fruitdescription;
        ImageView fruitimage;
        Button addcart_button;

        public MyViewHolder(View itemView) {
            super(itemView);

            fruitname = itemView.findViewById(R.id.fruitname);
            fruitcost = itemView.findViewById(R.id.fruitcost);
            fruittype = itemView.findViewById(R.id.fruittype);
            fruitdescription = itemView.findViewById(R.id.fruitdescription);
            fruitimage = itemView.findViewById(R.id.fruitimage);
            addcart_button = itemView.findViewById(R.id.addcart_button);


        }

    }
}
