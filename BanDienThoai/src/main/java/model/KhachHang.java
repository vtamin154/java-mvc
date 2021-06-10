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
    private int ma;
    private static int sMa = 9999;
    private String ten ;
    private String diaChi ;
    private String nhom ;

    public KhachHang() {
    }

    public KhachHang(String ten, String diaChi, String nhom) {
        this.ma =++sMa;
        this.ten = ten;
        this.diaChi = diaChi;
        this.nhom = nhom;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
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
    public Object[] toObject(){
        return new Object[]{
            ma, ten, diaChi, nhom
        };
    }
}
