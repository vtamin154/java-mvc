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
public class QuanLi implements Serializable{
    private KhachHang kh;
    private MatHang mh;
    private int SoLuong;

    public QuanLi() {
    }

    public QuanLi(KhachHang kh, MatHang mh, int SoLuong) {
        this.kh = kh;
        this.mh = mh;
        this.SoLuong = SoLuong;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public MatHang getMh() {
        return mh;
    }

    public void setMh(MatHang mh) {
        this.mh = mh;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    public Object[] toObject(){
        return new Object[]{
            kh.getMa(), kh.getTen(), mh.getMa(), SoLuong
        };
    }
}
