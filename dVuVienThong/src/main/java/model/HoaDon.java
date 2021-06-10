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
    private DichVu dv;
    private int soLuong;

    public HoaDon() {
    }

    public HoaDon(KhachHang kh, DichVu dv, int soLuong) {
        this.kh = kh;
        this.dv = dv;
        this.soLuong = soLuong;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public DichVu getDv() {
        return dv;
    }

    public void setDv(DichVu dv) {
        this.dv = dv;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public Object[] toObject(){
        return new Object[]{
            kh.getMa(), kh.getTen(), dv.getMa(), soLuong
        };
    }
}
