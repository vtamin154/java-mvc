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
public class SinhVien implements Serializable{
    private int Ma;
    private static int sMa=10000;
    private String ten;
    private String diaChi;
    private String ngaySinh;
    private String lop;

    public SinhVien() {
        this. Ma = sMa++;
    }

    public SinhVien(int Ma, String ten, String diaChi, String ngaySinh, String lop) {
        this.Ma = Ma;
        this.ten = ten;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
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
        SinhVien.sMa = sMa;
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

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    
    public Object[] toObject(){
        return new Object[]{
            Ma, ten, diaChi, ngaySinh, lop
        };
    }
}
