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
public class PhongVien implements  Serializable{
    private int ma ;
    private static int sMa = 9999;
    private String ten ;
    private String diaChi ;
    private String loai ;

    public PhongVien() {
    }

    public PhongVien(String ten, String diaChi, String loai) {
        this.ma = ++sMa;
        this.ten = ten;
        this.diaChi = diaChi;
        this.loai = loai;
    }

    public int getMa() {
        return ma;
    }

    public static int getsMa() {
        return sMa;
    }

    public String getTen() {
        return ten;
    }

    public static void setsMa(int sMa) {
        PhongVien.sMa = sMa;
    }
    public Object[] toObject(){
        return  new Object[]{
            ma,ten,diaChi,loai
        };
    }
}
