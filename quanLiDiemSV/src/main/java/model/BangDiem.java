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
public class BangDiem implements Serializable{
    private SinhVien sv;
    private MonHoc mh;
    private int diem;

    public BangDiem() {
    }

    public BangDiem(SinhVien sv, MonHoc mh, int diem) {
        this.sv = sv;
        this.mh = mh;
        this.diem = diem;
    }

    public SinhVien getSv() {
        return sv;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public MonHoc getMh() {
        return mh;
    }

    public void setMh(MonHoc mh) {
        this.mh = mh;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }
    public Object[] toObject(){
        return new Object[]{
            sv.getMa(), sv.getTen(), mh.getMa(), diem
        };
    }
}
