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
    private int ma;
    private static int sMa = 1000;
    private String ten ;
    private String nhom ;
    private int giaMua;
    private int giaBan;

    public MatHang() {
        this.ma = sMa++;
    }

    public MatHang(int ma, String ten, String nhom, int giaMua, int giaBan) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
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
        MatHang.sMa = sMa;
    }

    public String getTen() {
        return ten;
    }
    
    public Object[] toObject(){
        return new Object[]{
            ma, ten, nhom, giaMua, giaBan
        };
    }
}
