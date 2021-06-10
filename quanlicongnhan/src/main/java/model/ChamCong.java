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
public class ChamCong implements Serializable{
    private CongNhan cn;
    private SanPham sp;
    private int soLuong;

    public ChamCong() {
    }

    public ChamCong(CongNhan cn, SanPham sp, int soLuong) {
        this.cn = cn;
        this.sp = sp;
        this.soLuong = soLuong;
    }

    public CongNhan getCn() {
        return cn;
    }

    public void setCn(CongNhan cn) {
        this.cn = cn;
    }

    public SanPham getSp() {
        return sp;
    }

    public void setSp(SanPham sp) {
        this.sp = sp;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public Object[] toObject(){
        return new Object[]{
            cn.getMa(), cn.getTen(), sp.getMa(), soLuong
        };
    }
}
