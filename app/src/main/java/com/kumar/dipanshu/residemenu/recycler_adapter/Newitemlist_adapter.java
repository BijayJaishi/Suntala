package com.kumar.dipanshu.residemenu.recycler_adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kumar.dipanshu.residemenu.Model_newitem;
import com.kumar.dipanshu.residemenu.R;

import java.util.List;

/**
 * Created by Bijay on 11/12/2019.
 */

public class Newitemlist_adapter extends RecyclerView.Adapter<Newitemlist_adapter.MyViewHolder> {

    Context context;
    List<Model_newitem>model_newitems;

    public Newitemlist_adapter(Context context, List<Model_newitem> model_newitems) {
        this.context = context;
        this.model_newitems = model_newitems;
    }


    @Override
    public Newitemlist_adapter.MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.newitem_recycleview, viewGroup, false);
        return new Newitemlist_adapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Newitemlist_adapter.MyViewHolder myViewholder, int position) {

        final Model_newitem model_newitem = model_newitems.get(position);
        myViewholder.newfruitname.setText(model_newitem.getNewfruitname());
        myViewholder.newfruitcost.setText(model_newitem.getNewfruitcost());
        myViewholder.newfruitimage.setImageResource(model_newitem.getNewfruitimage());


    }

    @Override
    public int getItemCount() {
        return model_newitems.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView newfruitimage;
        TextView newfruitname,newfruitcost;

        public MyViewHolder(View itemView) {
            super(itemView);

            newfruitimage = itemView.findViewById(R.id.newfruitimage);
            newfruitname = itemView.findViewById(R.id.newfruitname);
            newfruitcost = itemView.findViewById(R.id.newfruitcost);

        }
    }
}
