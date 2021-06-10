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
public class HoaDon implements Serializable{
    private KhachHang kh;
    private DienThoai dienThoai;
    private int soLuong;

    public HoaDon() {
    }

    public HoaDon(KhachHang kh, DienThoai dienThoai, int soLuong) {
        this.kh = kh;
        this.dienThoai = dienThoai;
        this.soLuong = soLuong;
    }

    public KhachHang getKh() {
        return kh;
    }

    public DienThoai getDienThoai() {
        return dienThoai;
    }

    public int getSoLuong() {
        return soLuong;
    }
    public Object[] toObject(){
        return new Object[]{
            kh.getMa(), kh.getTen(), dienThoai.getMa(), soLuong
        };
    }
}
