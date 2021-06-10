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
    private String diaChi;
    private String loai;

    public KhachHang() {
        this.Ma = sMa++;
    }

    public KhachHang(int Ma, String ten, String diaChi, String loai) {
        this.Ma = Ma;
        this.ten = ten;
        this.diaChi = diaChi;
        this.loai = loai;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
    public Object[] toObject(){
        return new Object[]{
            Ma, ten, diaChi, loai
        };
    }
}
