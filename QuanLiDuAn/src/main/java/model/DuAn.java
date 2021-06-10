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
public class DuAn implements Serializable{
    private int Ma;
    private static int sMa = 10000;
    private String ten;
    private String kieu;
    private int chiphi;

    public DuAn() {
        this.Ma = sMa++;
    }

    public DuAn(int Ma, String ten, String kieu, int chiphi) {
        this.Ma = Ma;
        this.ten = ten;
        this.kieu = kieu;
        this.chiphi = chiphi;
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
        DuAn.sMa = sMa;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public int getChiphi() {
        return chiphi;
    }

    public void setChiphi(int chiphi) {
        this.chiphi = chiphi;
    }
    
    public Object[] toObject(){
        return new Object[]{
            Ma,ten,kieu,chiphi
        };
    }
}
