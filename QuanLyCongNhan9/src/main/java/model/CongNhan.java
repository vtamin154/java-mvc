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
public class CongNhan implements Serializable {

    private int ma;
    private static int sMa = 1000;
    private String ten;
    private String diaChi;
    private int sdt;
    private int bac;

    public CongNhan() {
        this.ma = sMa++;
    }

    public CongNhan(int ma, String ten, String diaChi, int sdt, int bac) {
        this.ma = ma;
        this.ten = ten;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.bac = bac;
    }

    public int getMa() {
        return ma;
    }

    public static int getsMa() {
        return sMa;
    }

    public static void setsMa(int sMa) {
        CongNhan.sMa = sMa;
    }

    public String getTen() {
        return ten;
    }

    public Object[] toObject() {
        return new Object[]{
            ma, ten, diaChi, sdt, bac
        };
    }

}
