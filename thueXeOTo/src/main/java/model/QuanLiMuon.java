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
public class QuanLiMuon implements Serializable{
    private Oto oto;
    private KhachHang khachHang;
    private int soNgay;
    private int soXe;

    public QuanLiMuon() {
    }

    public QuanLiMuon(Oto oto, KhachHang khachHang, int soNgay, int soXe) {
        this.oto = oto;
        this.khachHang = khachHang;
        this.soXe = soXe;
        this.soNgay = soNgay;
    }

    public Oto getOto() {
        return oto;
    }

   

    public KhachHang getKhachHang() {
        return khachHang;
    }

   

    public int getSoNgay() {
        return soNgay;
    }

    public int getSoXe() {
        return soXe;
    }

   public Object[] toObject(){
       return new Object[]{
           khachHang.getMa(), khachHang.getTen(),oto.getMa(), soNgay, soXe
       };
   }
    
}
