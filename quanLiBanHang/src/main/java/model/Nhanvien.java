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
public class Nhanvien implements Serializable{
    private int ma;
    private static int sMa = 1000;
    private String ten ;
    private String diaChi ;
    private int sdt;

    public Nhanvien() {
        this.ma = sMa++;
    }

    public Nhanvien(int ma, String ten, String diaChi, int sdt) {
        this.ma = ma;
        this.ten = ten;
        this.diaChi = diaChi;
        this.sdt = sdt;
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
        Nhanvien.sMa = sMa;
    }

    public String getTen() {
        return ten;
    }
    
    public Object[] toObject(){
        return new Object[]{
            ma, ten, diaChi, sdt
        };
    }
}
