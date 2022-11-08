package com.tranthikimloan.test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class lunch extends AppCompatActivity {
    ListView listView;
    ArrayList<brfclass> arrayList;
    brfAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);
        listView=(ListView) findViewById(R.id.lst_lunch);
        arrayList=new ArrayList<>();
        arrayList.add(new brfclass("El Gaucho","4.0",
                "27","74/1 Hai Bà Trưng, P. Bến Nghé, Q. 1, Tp.HCM",R.drawable.lunch_elgaucho));
        arrayList.add(new brfclass("Hotpot Story","4.3",
                "3","34 Lê Duẩn, P. Bến Nghé, Q. 1, Tp.HCM",R.drawable.lunch_hotpot));
        arrayList.add(new brfclass("King BBQ Alacarte","4.0",
                "15","72 Lê Thánh Tôn, P. Bến Nghé, Q. 1, Tp.HCM",R.drawable.lunch_kingbbq_alacarte));
        arrayList.add(new brfclass("King BBQ Alacarte","4.3",
                "45","65 Lê Lợi, P. Bến Nghé, Q. 1, Tp.HCM",R.drawable.lunch_kingbbq_alacarte2));
        arrayList.add(new brfclass("King BBQ Buffet","4.8",
                "27","46 Ter Võ Văn Tần, P. 6, Q. 3, Tp.HCM",R.drawable.lunch_kingbbq_buffet));
        arrayList.add(new brfclass("Seoul Garden","4.0",
                "7","11 Sư Vạn Hạnh, P. 12, Q. 10, Tp.HCM",R.drawable.lunch_seoulgarden));
        adapter=new brfAdapter(this,R.layout.brf_listview, arrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog dialog = new Dialog(lunch.this);
                dialog.setContentView(R.layout.dialog_brf);
                TextView tvDialogName=(TextView)dialog.findViewById(R.id.dl_tv_name);
                TextView tvDialogAddress=(TextView)dialog.findViewById(R.id.dl_tv_address);
                TextView tvDialogratingValue=(TextView)dialog.findViewById(R.id.dl_tv_ratingValue);
                ImageView imvPhoto=(ImageView) dialog.findViewById(R.id.dl_imv_photo);
                tvDialogName.setText(arrayList.get(position).getName());
                tvDialogAddress.setText(arrayList.get(position).getAddress());
                tvDialogratingValue.setText(arrayList.get(position).getRatingValue());
                imvPhoto.setImageResource(arrayList.get(position).getPhoto());
                dialog.show();

            }
        });
    }
}