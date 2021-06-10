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
public class NhanVien implements Serializable{
    private int Ma;
    private static int sMa = 10000;
    private String ten;
    private String diachi;
    private String chuyenmon;

    public NhanVien() {
        this.Ma =sMa++;
    }

    public NhanVien(int Ma, String ten, String diachi, String chuyenmon) {
        this.Ma = Ma;
        this.ten = ten;
        this.diachi = diachi;
        this.chuyenmon = chuyenmon;
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
        NhanVien.sMa = sMa;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getChuyenmon() {
        return chuyenmon;
    }

    public void setChuyenmon(String chuyenmon) {
        this.chuyenmon = chuyenmon;
    }
    public Object[] toObject(){
        return new Object[]{
          Ma, ten, diachi, chuyenmon  
        };
    }
}
