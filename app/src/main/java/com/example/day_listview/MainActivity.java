package com.example.day_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    MonHocAdapter monHocAdapter;
    ArrayList<MonHoc> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhXa();
        monHocAdapter = new MonHocAdapter(MainActivity.this,R.layout.dong_monhoc,list);
        listView.setAdapter(monHocAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,list.get(position).getMoTa(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void anhXa() {
        listView = findViewById(R.id.list_item);
        list = new ArrayList<>();
        list.add(new MonHoc("Thằng Cường","Tóc như đb quấn rẻ",R.drawable.cuong));
        list.add(new MonHoc("Thằng Tôn","Rất đẹp trai",R.drawable.ton));
        list.add(new MonHoc("Thằng Quang","Cha xứ nghiện ngập",R.drawable.quang));
        list.add(new MonHoc("Thằng Cường","Tóc như đb quấn rẻ",R.drawable.cuong));
        list.add(new MonHoc("Thằng Tôn","Rất đẹp trai",R.drawable.ton));
        list.add(new MonHoc("Thằng Quang","Cha xứ nghiện ngập",R.drawable.quang));
        list.add(new MonHoc("Thằng Cường","Tóc như đb quấn rẻ",R.drawable.cuong));
        list.add(new MonHoc("Thằng Tôn","Rất đẹp trai",R.drawable.ton));
        list.add(new MonHoc("Thằng Quang","Cha xứ nghiện ngập",R.drawable.quang));
    }
}