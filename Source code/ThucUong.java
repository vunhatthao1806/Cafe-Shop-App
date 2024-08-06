/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thaovu.demo;

/**
 *
 * @author Dell Vostro 3400
 */
public class ThucUong extends Menu {

    private String da;

    public ThucUong(String ten, double gia, String tinhTrang, String thoiDiem, String da) {
        super(ten, gia, tinhTrang, thoiDiem);
        this.da = da;
    }

    @Override
    public void nhapMenu() {
        super.nhapMenu();
        System.out.print("Da/Khong da: ");
        this.da=CauHinh.sc.nextLine();
    }

    public ThucUong() {
        super(null, 0, null, null);
    }

    @Override
    public void hienThi() {
        super.hienThi(); 
        System.out.printf("Da hay khong da: %s\n",this.da);
    }

    /**
     * @return the da
     */
    public String getDa() {
        return da;
    }

    /**
     * @param da the da to set
     */
    public void setDa(String da) {
        this.da = da;
    }
}
