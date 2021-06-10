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
public class XuongSanXuat implements Serializable{
    private int ma;
    private static int sMa = 100;
    private String ten;
    private String moTa ;
    private int heSo;

    public XuongSanXuat() {
        this.ma = sMa++;
    }

    public XuongSanXuat(int ma, String ten, String moTa, int heSo) {
        this.ma = ma;
        this.ten = ten;
        this.moTa = moTa;
        this.heSo = heSo;
    }

    public static int getsMa() {
        return sMa;
    }

    public static void setsMa(int sMa) {
        XuongSanXuat.sMa = sMa;
    }

    public String getTen() {
        return ten;
    }

    public int getMa() {
        return ma;
    }

   public Object[] toObject(){
       return new Object[]{
           ma, ten, moTa, heSo
       };
   }
    
}
