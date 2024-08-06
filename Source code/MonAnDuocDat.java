/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thaovu.demo;

/**
 *
 * @author ADMIN
 */
public class MonAnDuocDat {

    protected Menu m = new Menu();
    private int slMon;

    public MonAnDuocDat(Menu m, int n) {
        this.slMon = n;
        this.m = m;
    }

    public void them(Menu m, int n) {
        this.setM(m);
        this.setSlMon(n);
    }

    public void hienThiDatMon() {
        this.m.hienThi();
        System.out.printf("So luong: %d\n", this.getSlMon());
    }

    /**
     * @return the m
     */
    public Menu getM() {
        return m;
    }

    /**
     * @param m the m to set
     */
    public void setM(Menu m) {
        this.m = m;
    }

    /**
     * @return the slMon
     */
    public int getSlMon() {
        return slMon;
    }

    /**
     * @param slMon the slMon to set
     */
    public void setSlMon(int slMon) {
        this.slMon = slMon;
    }

    /**
     * @return the today
     */
}
