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
public class KhachHang implements Serializable{
    private int Ma;
    private static int sMa = 10000;
    private String ten;
    private String dicChi;
    private String nhom;

    public KhachHang() {
        this.Ma = sMa++;
    }

    public KhachHang(int Ma, String ten, String dicChi, String nhom) {
        this.Ma = Ma;
        this.ten = ten;
        this.dicChi = dicChi;
        this.nhom = nhom;
    }

    public int getMa() {
        return Ma;
    }

    public void setMa(int Ma) {
        this.Ma = Ma;
    }

    public static int getsMa() {
        return sMa;
    }

    public static void setsMa(int sMa) {
        KhachHang.sMa = sMa;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDicChi() {
        return dicChi;
    }

    public void setDicChi(String dicChi) {
        this.dicChi = dicChi;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }
    public Object[] toObject(){
        return new Object[]{
            Ma, ten,dicChi,nhom
        };
    }
}
