package com.tranthikimloan.test;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.tranthikimloan.test.databinding.ActivityBreakfastBinding;

import java.util.ArrayList;

public class Breakfast extends AppCompatActivity {
        ListView listView;
        ArrayList<brfclass> arrayList;
        brfAdapter adapter;
        ActivityBreakfastBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);
        listView=(ListView) findViewById(R.id.lst_brf);
        arrayList=new ArrayList<>();
        arrayList.add(new brfclass("Bếp nhà Xứ Quảng","4.4",
                "16","16 Trần Cao Vân, P. Đa Kao, Q. 1, Tp.HCM",R.drawable.bf_bepnhaxuquang));
        arrayList.add(new brfclass("Cơm Quê Mười Khó","4.8",
                "35","27 Trần Quốc Thảo, P. 6, Q. 3, Tp.HCM",R.drawable.bf_comquemuoikho));
        arrayList.add(new brfclass("Beard Papa's","5.0",
                "28","72 Lê Thánh Tôn, P. Bến Nghé, Q. 1, Tp.HCM",R.drawable.bf_beardpapa));
        arrayList.add(new brfclass("Bánh Đa Cua Dì Lý","4.3",
                "45","103 Đồng Khởi, P. Bến Nghé, Q. 1, Tp.HCM",R.drawable.bf_danhdacuadily));
        arrayList.add(new brfclass("Le Mekong","4.6",
                "52","46 Ter Võ Văn Tần, P. 6, Q. 3, Tp.HCM",R.drawable.bf_lemekong));
        arrayList.add(new brfclass("The Mix House","4.8",
                "19","153 Nguyễn Văn Thủ, P. Đa Kao, Q. 1, Tp.HCM",R.drawable.bf_themixhouse));
        adapter=new brfAdapter(this,R.layout.brf_listview, arrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog dialog = new Dialog(Breakfast.this);
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