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
    private int ma;
    private static int sMa= 10000;
    private String ten;
    private String diaChi;
    private String ngaySinh;
    private String lop;

    public SinhVien() {
        this.ma = sMa++;
    }

    public SinhVien(int ma, String ten, String diaChi, String ngaySinh, String lop) {
        this.ma = ma;
        this.ten = ten;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
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

   
    public Object[] tObject(){
        return new Object[]{
            ma, ten,diaChi,ngaySinh, lop
        };
    }
}
