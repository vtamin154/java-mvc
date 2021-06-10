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
public class PhanCong implements Serializable{
    private NhanVien nv;
    private DuAn da;
    private int soNgay;
    private String vTri;

    public PhanCong() {
    }

    public PhanCong(NhanVien nv, DuAn da, int soNgay, String vTri) {
        this.nv = nv;
        this.da = da;
        this.soNgay = soNgay;
        this.vTri = vTri;
    }

    public NhanVien getNv() {
        return nv;
    }

    public void setNv(NhanVien nv) {
        this.nv = nv;
    }

    public DuAn getDa() {
        return da;
    }

    public void setDa(DuAn da) {
        this.da = da;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }

    public String getvTri() {
        return vTri;
    }

    public void setvTri(String vTri) {
        this.vTri = vTri;
    }
    
    public Object[] toObject(){
        return new Object[]{
            nv.getMa(), da.getMa(), soNgay, vTri
        };
    }
}
