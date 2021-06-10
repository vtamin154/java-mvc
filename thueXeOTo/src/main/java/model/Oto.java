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
public class Oto implements Serializable{
    private int ma;
    private static int sMa = 999;
    private String kieu ;
    private int mucTien;
    private int soXe;

    public Oto() {
    }

    public Oto(String kieu, int mucTien, int soXe) {
        this.ma = ++sMa;
        this.kieu = kieu;
        this.mucTien = mucTien;
        this.soXe = soXe;
    }

    public int getMa() {
        return ma;
    }

    public int getSoXe() {
        return soXe;
    }



    public static int getsMa() {
        return sMa;
    }

    public static void setsMa(int sMa) {
        Oto.sMa = sMa;
    }
    public Object[] toObject(){
    return new Object[] {
        ma,kieu,mucTien,soXe
    };
}
}
