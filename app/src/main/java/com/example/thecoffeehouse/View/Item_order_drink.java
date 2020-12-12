package com.example.thecoffeehouse.View;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thecoffeehouse.Adapter.ProductAdapter;
import com.example.thecoffeehouse.Model.Product;
import com.example.thecoffeehouse.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Item_order_drink#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Item_order_drink extends Fragment {
    ArrayList<Product> productArrayList;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Item_order_drink() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Item_order_drink.
     */
    // TODO: Rename and change types and number of parameters
    public static Item_order_drink newInstance(String param1, String param2) {
        Item_order_drink fragment = new Item_order_drink();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_item_order_drink, container, false);
        productArrayList = new ArrayList<Product>();
        productArrayList.add(new Product("Trà đen Machiatio","Tận hưởng từng ngụm ấm áp, ngọt dịu từ chocolate thượng hạng kết" +
                " hợp với lúa mạch thơm lừng. Vị Giáng sinh đặc biệt này là dành cho bạn, thưởng" +
                " thức ngay nhé","69",R.drawable.popular3));
        productArrayList.add(new Product("Trà sữa mắc ca trân châu trắng","Tận hưởng từng ngụm ấm áp, ngọt dịu từ chocolate thượng hạng kết" +
                " hợp với lúa mạch thơm lừng. Vị Giáng sinh đặc biệt này là dành cho bạn, thưởng" +
                " thức ngay nhé","69",R.drawable.popular1));
        productArrayList.add(new Product("Cold brew cam sả","Tận hưởng từng ngụm ấm áp, ngọt dịu từ chocolate thượng hạng kết" +
                " hợp với lúa mạch thơm lừng. Vị Giáng sinh đặc biệt này là dành cho bạn, thưởng" +
                " thức ngay nhé","69",R.drawable.popular2));
        productArrayList.add(new Product("Sôcôla Lúa Mạch Nóng","Tận hưởng từng ngụm ấm áp, ngọt dịu từ chocolate thượng hạng kết" +
                " hợp với lúa mạch thơm lừng. Vị Giáng sinh đặc biệt này là dành cho bạn, thưởng" +
                " thức ngay nhé","69",R.drawable.mon1));
        RecyclerView recyclerView = v.findViewById(R.id.gridview_drink);
        ProductAdapter productAdapter = new ProductAdapter(productArrayList,getActivity());
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        recyclerView.setAdapter(productAdapter);
        return v;
    }
}