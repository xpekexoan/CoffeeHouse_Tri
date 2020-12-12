package com.example.thecoffeehouse.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thecoffeehouse.Model.Product;
import com.example.thecoffeehouse.Model.Product_order;
import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.ViewHolder.ItemClickListener;
import com.example.thecoffeehouse.ViewHolder.ProductViewHolder;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<Product> productArrayList;
    private Context context;
    public static Dialog productdetails;
    public static TextView totalmoney;
    public static Product_order product_order;


    public ProductAdapter(ArrayList<Product> productArrayList, Context context) {
        this.productArrayList = productArrayList;
        this.context = context;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_order_popular,parent,false);
        return new ProductViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ProductViewHolder productViewHolder =(ProductViewHolder) holder;
        Product product = productArrayList.get(position);
        productViewHolder.getName().setText(product.getName());
        productViewHolder.getPrice().setText(product.getPrice());
        productViewHolder.getImage().setImageResource(product.getImg());

       productViewHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                productdetails = new Dialog(context);
                productdetails.setContentView(R.layout.dialog_product);
                TextView name = productdetails.findViewById(R.id.nameofproduct);
                TextView price = productdetails.findViewById(R.id.priceofproduct);
                ImageView image = productdetails.findViewById(R.id.imageofproduct);
                TextView description =productdetails.findViewById(R.id.descripton);
                totalmoney = productdetails.findViewById(R.id.totalmoney);
                TextView numberofproduct = productdetails.findViewById(R.id.numberofproduct);
                name.setText(product.getName());
                price.setText(product.getPrice());
                image.setImageResource(product.getImg());
                totalmoney.setText(product.getPrice());
                description.setText(product.getDescription());
                int priceofproduct =Integer.parseInt(product.getPrice()) ;

                product_order = new Product_order();
                product_order.setPrice(priceofproduct);
                product_order.setQuantity(Integer.parseInt((String) numberofproduct.getText()));

                productdetails.findViewById(R.id.tru1_301).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(product_order.getQuantity()>1){
                            product_order.setQuantity(product_order.getQuantity()-1);
                        }
                        totalmoney.setText(String.valueOf(product_order.getTotalMoney()));
                        TextView numberofproduct = productdetails.findViewById(R.id.numberofproduct);
                        numberofproduct.setText(String.valueOf(product_order.getQuantity()) );
                        if (product_order.getQuantity()==1){
                            productdetails.findViewById(R.id.tru1_301).setClickable(false);
                        }
                    }
                });
                productdetails.findViewById(R.id.cong1_301).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        product_order.setQuantity(product_order.getQuantity()+1);
                        totalmoney.setText(String.valueOf(product_order.getTotalMoney()));
                        TextView numberofproduct = productdetails.findViewById(R.id.numberofproduct);
                        numberofproduct.setText(String.valueOf(product_order.getQuantity()) );
                        if (product_order.getQuantity()>1){
                            productdetails.findViewById(R.id.tru1_301).setClickable(true);
                        }
                    }
                });
                productdetails.show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return productArrayList.size();
    }
}
