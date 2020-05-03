package com.example.reimbursements_claim;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.List;

public class cardadapter extends RecyclerView.Adapter<cardadapter.ProductViewHolder> {

    private Context mCtx2;
    private List<cardproduct> pdlist;

    public cardadapter(Context mCtx2, List<cardproduct> pdlist) {
        this.mCtx2= mCtx2;
        this.pdlist=pdlist;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater2 = LayoutInflater.from(mCtx2);
        View view2 = inflater2.inflate(R.layout.cardview, null);

        return new ProductViewHolder(view2);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        cardproduct cp = pdlist.get(position);
        holder.txt1.setText(cp.getItem());
        holder.txt2.setText(cp.getDate());
        holder.image.setImageDrawable(mCtx2.getResources().getDrawable(cp.getImage()));


    }

    @Override
    public int getItemCount() {
        return pdlist.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        TextView txt1;
        TextView txt2;
        ImageView image;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageView2);
            txt1=itemView.findViewById(R.id.textView3);
            txt2=itemView.findViewById(R.id.textView5);
        }
    }
}