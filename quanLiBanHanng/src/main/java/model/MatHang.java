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
public class MatHang implements Serializable{
    private int Ma;
    private static int sMa = 10000;
    private String ten;
    private int gia;

    public MatHang() {
        this.Ma = sMa++;
    }

    public MatHang(int Ma, String ten, int gia) {
        this.Ma = Ma;
        this.ten = ten;
        this.gia = gia;
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
        MatHang.sMa = sMa;
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
    public Object[] toObject(){
        return new Object[]{
            Ma,ten,gia
        };
    }
}
