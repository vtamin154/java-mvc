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
public class DienThoai implements Serializable{
    private int ma ;
    private static int sMa = 9999;
    private String hang ;
    private String model ;
    private int gia;

    public DienThoai() {
    }

    public DienThoai(String hang, String model, int gia) {
        this.ma = ++sMa;
        this.hang = hang;
        this.model = model;
        this.gia = gia;
    }

    public int getMa() {
        return ma;
    }

   

    public static int getsMa() {
        return sMa;
    }

    public static void setsMa(int sMa) {
        DienThoai.sMa = sMa;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,hang, model, gia
        };
    }
}
