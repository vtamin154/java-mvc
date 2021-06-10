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
public class MonHoc implements Serializable{
    private int ma;
    private static int sMa = 100;
    private String ten ;
    private int dvht;
    private String loai ;

    public MonHoc() {
        this.ma = sMa++;
    }

    public MonHoc(int ma, String ten, int dvht, String loai) {
        this.ma = ma;
        this.ten = ten;
        this.dvht = dvht;
        this.loai = loai;
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
        MonHoc.sMa = sMa;
    }
    public Object[] toObject(){
        return new Object[]{
            ma, ten, dvht,loai
        };
    }
}
