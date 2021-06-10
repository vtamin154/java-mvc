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
public class BaiViet implements Serializable{
    private int ma;
    private static int sMa = 99;
    private String ten ;
    private int gia;

    public BaiViet(String ten, int gia) {
        this.ma = ++sMa;
        this.ten = ten;
        this.gia = gia;
    }

    public BaiViet() {
    }

    public int getMa() {
        return ma;
    }

    public static int getsMa() {
        return sMa;
    }

    public String getTen() {
        return ten;
    }

    public static void setsMa(int sMa) {
        BaiViet.sMa = sMa;
    }
    
    public Object[] toObject(){
        return new Object[]{
            ma,ten,gia
        };
    }
}
