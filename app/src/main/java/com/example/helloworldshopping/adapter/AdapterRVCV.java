package com.example.helloworldshopping.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.helloworldshopping.R;
import com.example.helloworldshopping.model.Coupon;

import java.util.ArrayList;
import java.util.List;

public class AdapterRVCV extends RecyclerView.Adapter<AdapterRVCV.ViewHolder> {
   private List<Coupon> lst;
   private Context ctx;

   public AdapterRVCV(){
       lst = new ArrayList<Coupon>();

       //Mock Data Source
       Coupon coupon = new Coupon();
       for (int i=1; i<1000; i++){
           coupon = new Coupon();
           coupon.setCouponDescription( "coupon description " + i);
           coupon.setCouponDiscountRate(i + "%");
           lst.add(coupon);
       }
   }

   @Override
    public AdapterRVCV.ViewHolder onCreateViewHolder(ViewGroup parent, int viewTYpe){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_card, parent, false);
        ctx = parent.getContext();
        return new ViewHolder(view);
   }

   public class ViewHolder extends RecyclerView.ViewHolder{

       private CardView cvCoupont;
       private TextView discountDescription;
       private TextView discountRate;

       public ViewHolder(View v){

           super(v);
           cvCoupont = v.findViewById(R.id.cvCoupon);
           discountDescription = v.findViewById(R.id.discountDescription);
           discountRate = v.findViewById(R.id.discountRate);
       }

   }

   @Override
    public void onBindViewHolder(AdapterRVCV.ViewHolder holder, final int position){
        Coupon coupon = lst.get(position);
        holder.discountDescription.setText(coupon.getCouponDescription());
        holder.discountRate.setText(coupon.getCouponDiscountRate());

        holder.cvCoupont.setOnClickListener(new View.OnClickListener(){

            @Override
           public void onClick(View view){
                Toast.makeText(ctx, lst.get(position).getCouponDescription(), Toast.LENGTH_LONG).show();
           }
       });

   }

   @Override
    public int getItemCount(){
       return lst.size();
   }
}
