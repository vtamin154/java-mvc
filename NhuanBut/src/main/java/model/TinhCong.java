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
public class TinhCong implements Serializable{
    private PhongVien pv;
    private BaiViet bv;
    private int soLuong;

    public TinhCong() {
    }

    public TinhCong(PhongVien pv, BaiViet bv, int soLuong) {
        this.pv = pv;
        this.bv = bv;
        this.soLuong = soLuong;
    }

    public PhongVien getPv() {
        return pv;
    }

    public BaiViet getBv() {
        return bv;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public Object[] toObject(){
        return new Object[]{
            pv.getMa(), pv.getTen(), bv.getMa(), soLuong
        };
    }
}
