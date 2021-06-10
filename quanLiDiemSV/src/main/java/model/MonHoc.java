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
    private int Ma;
    private static int sMa = 100;
    private String ten;
    private int dvht;
    private String loai;

    public MonHoc() {
        this.Ma = sMa++;
    }

    public MonHoc(int Ma, String ten, int dvht, String loai) {
        this.Ma = Ma;
        this.ten = ten;
        this.dvht = dvht;
        this.loai = loai;
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
        MonHoc.sMa = sMa;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getDvht() {
        return dvht;
    }

    public void setDvht(int dvht) {
        this.dvht = dvht;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    
    public Object[] toObject(){
        return new Object[]{
            Ma, ten, dvht, loai
        };
    }
}
