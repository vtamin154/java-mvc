/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author vtamin154
 */
public class QuanLiBanHang implements Serializable{
    private Nhanvien nv;
    private MatHang mh;
    private int soLuong;

    public QuanLiBanHang() {
    }

    public QuanLiBanHang(Nhanvien nv, MatHang mh, int soLuong) {
        this.nv = nv;
        this.mh = mh;
        this.soLuong = soLuong;
    }

    public Nhanvien getNv() {
        return nv;
    }

    public void setNv(Nhanvien nv) {
        this.nv = nv;
    }

    public MatHang getMh() {
        return mh;
    }

    public void setMh(MatHang mh) {
        this.mh = mh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public Object[] toObject(){
        return new Object[]{
            nv.getMa(), nv.getTen(), mh.getMa(), soLuong
        };
    }
}
