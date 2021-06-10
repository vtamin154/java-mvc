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
public class ChamCOng implements Serializable{
    private  CongNhan cn;
    private XuongSanXuat xsx;
    private int soNgay;

    public ChamCOng() {
    }

    public ChamCOng(CongNhan cn, XuongSanXuat xsx, int soNgay) {
        this.cn = cn;
        this.xsx = xsx;
        this.soNgay = soNgay;
    }

    public CongNhan getCn() {
        return cn;
    }

    
    public XuongSanXuat getXsx() {
        return xsx;
    }

   

    public int getSoNgay() {
        return soNgay;
    }

    public Object[] toObject(){
        return new Object[]{
            cn.getMa(), cn.getTen(), xsx.getMa(), soNgay
        };
    }
}
