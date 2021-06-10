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
public class CongNhan implements Serializable{
    private int Ma;
    private static int sMa = 10000;
    private String ten;
    private String dichi;
    private String ca;

    public CongNhan() {
        this.Ma =sMa++;
    }

    public CongNhan(int Ma, String ten, String dichi, String ca) {
        this.Ma = Ma;
        this.ten = ten;
        this.dichi = dichi;
        this.ca = ca;
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
        CongNhan.sMa = sMa;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDichi() {
        return dichi;
    }

    public void setDichi(String dichi) {
        this.dichi = dichi;
    }

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }
    public Object[] toObject(){
        return new Object[]{
            Ma, ten, dichi, ca
        };
    }
}
