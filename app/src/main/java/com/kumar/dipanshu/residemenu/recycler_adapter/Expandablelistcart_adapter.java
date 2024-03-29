package com.kumar.dipanshu.residemenu.recycler_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;
import com.kumar.dipanshu.residemenu.Model_mycart;
import com.kumar.dipanshu.residemenu.R;

import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Created by Bijay on 11/12/2019.
 */

public class Expandablelistcart_adapter extends ArrayAdapter<Model_mycart> {

    Context context;
    List<Model_mycart>model_mycarts;

    public Expandablelistcart_adapter(Context context, int resource,List<Model_mycart> model_mycarts) {
        super(context, resource);
        this.context = context;
        this.model_mycarts = model_mycarts;
    }


    @Override
    public int getCount() {
        return model_mycarts.size();
    }


    @Override
    public View getView(int position, @Nullable View convertView, ViewGroup viewGroup) {
        View view;
        final ElegantNumberButton number_button;
        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.mycart_expandablelist, viewGroup, false);
            TextView cartfruitname = view.findViewById(R.id.cartfruitname);
            TextView cartfruitcost = view.findViewById(R.id.cartfruitcost);
            TextView cartfruittype = view.findViewById(R.id.cartfruittype);
            TextView cartfruitdescription = view.findViewById(R.id.cartfruitdescription);
            ImageView cartfruitimage = view.findViewById(R.id.cartfruitimage);

            Model_mycart model_mycart = model_mycarts.get(position);
            cartfruitname.setText(model_mycart.getCartfruitname());
            cartfruitcost.setText(model_mycart.getCartfruitcost());
            cartfruittype.setText(model_mycart.getCartfruittype());
            cartfruitdescription.setText(model_mycart.getCartfruitdescription());
            cartfruitimage.setImageResource(model_mycart.getCartimage());

             number_button = view.findViewById(R.id.number_button);
             number_button.setOnClickListener(new ElegantNumberButton.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String num = number_button.getNumber();
                }
            });
        }else{
            view = convertView;
        }
        return view;
    }



}
