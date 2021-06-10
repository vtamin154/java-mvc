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
    private int ma;
    private static int sMa = 99;
    private String ten ;
    private String loai ;
    private int soXe;

    public KhachHang() {
    }

    public KhachHang(String ten, String loai, int soXe) {
        this.ma = ++sMa;
        this.ten = ten;
        this.loai = loai;
        this.soXe = soXe;
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

    public int getMa() {
        return ma;
    }
    
    public Object[] toObject(){
        return new Object[]{
            ma, ten, loai, soXe
        };
    }
}
