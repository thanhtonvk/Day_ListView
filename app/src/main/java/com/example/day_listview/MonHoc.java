package com.example.day_listview;

public class MonHoc {
    private String tenMonHoc,moTa;
    private int hinhAnh;

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public MonHoc(String tenMonHoc, String moTa, int hinhAnh) {
        this.tenMonHoc = tenMonHoc;
        this.moTa = moTa;
        this.hinhAnh = hinhAnh;
    }
}
