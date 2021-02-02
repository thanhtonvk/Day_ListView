package com.example.day_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonHocAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    ArrayList<MonHoc>monHocs;
   LayoutInflater inflater;
    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public int getLayout() {
        return layout;
    }

    public void setLayout(int layout) {
        this.layout = layout;
    }

    public ArrayList<MonHoc> getMonHocs() {
        return monHocs;
    }

    public void setMonHocs(ArrayList<MonHoc> monHocs) {
        this.monHocs = monHocs;
    }

    public MonHocAdapter(Context context, int layout, ArrayList<MonHoc> monHocs) {
        this.context = context;
        this.layout = layout;
        this.monHocs = monHocs;
        inflater= LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return monHocs.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //chuyển layout thành view
        convertView = inflater.inflate(layout,null);
        //ánh xạ view
        ImageView imageView=convertView.findViewById(R.id.img_anh);
        TextView tv_ten = convertView.findViewById(R.id.tv_tenmonhoc);
        TextView tv_mota = convertView.findViewById(R.id.tv_mota);
        //gán giá trị cho các item
        MonHoc monHoc = monHocs.get(position);
        imageView.setImageResource(monHoc.getHinhAnh());
        tv_ten.setText(monHoc.getTenMonHoc());
        tv_mota.setText(monHoc.getMoTa());
        return convertView;
    }
}
