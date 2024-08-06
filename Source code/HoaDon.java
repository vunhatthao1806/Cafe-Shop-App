/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thaovu.demo;


/**
 *
 * @author ADMIN
 */
public class HoaDon {

    private double tongTien;

    public HoaDon() {
    }

    public HoaDon(double tongTien) {
        this.tongTien = tongTien;
    }
    public double tinhTien(DatBan bd) {
        this.tongTien = 0;
        bd.getMonAnDuocDat().forEach(e -> e.hienThiDatMon());
        
        for (MonAnDuocDat x : bd.getMonAnDuocDat()) {
            
            this.tongTien += x.getSlMon() * x.getM().getGia();
        }
        bd.getB().setIsEmty(true);
        return this.tongTien;
    }

    /**
     * @return the tongTien
     */
    public double getTongTien() {
        return tongTien;
    }

    /**
     * @param tongTien the tongTien to set
     */
    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

}
