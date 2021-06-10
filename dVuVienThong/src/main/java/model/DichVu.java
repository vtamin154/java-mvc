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
public class DichVu implements Serializable{
    private int Ma;
    private static int sMa = 100;
    private String ten;
    private int gia;
    private String donVi;

    public DichVu() {
        this.Ma = sMa++;
    }

    public DichVu(int Ma, String ten, int gia, String donVi) {
        this.Ma = Ma;
        this.ten = ten;
        this.gia = gia;
        this.donVi = donVi;
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
        DichVu.sMa = sMa;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }
    public Object[] toObject(){
        return new Object[]{
            Ma, ten, gia, donVi
        };
    }
}
