/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thaovu.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Dell Vostro 3400
 */
public class QuanLiMenu {

    private List<Menu> ds = new ArrayList<>();

    public void themdsMenu(Menu... a) {
        this.ds.addAll(Arrays.asList(a));
    }

    public void themdsMenuThucAn(int sl) {
        for (int i = 0; i < sl; i++) {
            System.out.println("Nhap thuc an thu " + (i + 1));
            Menu a = new ThucAn();
            a.nhapMenu();
            this.ds.add(a);
        }
        System.out.println("Them thanh cong!!!");
    }

    public void themdsMenuThucUong(int sl) {
        for (int i = 0; i < sl; i++) {
            System.out.println("Nhap thuc uong thu " + (i + 1));
            Menu a = new ThucUong();
            a.nhapMenu();
            this.ds.add(a);
        }
        System.out.println("Them thanh cong!!!");
    }

    public void hienThiDsMenu() {

        this.ds.forEach(f -> f.hienThi());
    }

    public void xoaDsMenu(String ten) {
        List<Menu> dsXoa = this.ds.stream().filter(f -> f.ten.contains(ten)).collect(Collectors.toList());
        this.ds.removeAll(dsXoa);
        System.out.println("Xoa thanh cong!!!");
    }

    public void xoaDsMenu(double gia) {
        List<Menu> dsXoa = this.ds.stream().filter(f -> f.gia == gia).collect(Collectors.toList());
        this.ds.removeAll(dsXoa);
        System.out.println("Xoa thanh cong!!!");
    }

    public List<Menu> timKiem(String ten) {
        return this.ds.stream().filter(f -> f.ten.contains(ten)).collect(Collectors.toList());
    }

    ///////////////////////
    public Menu timKiemTheoTen(String ten) {
        return this.ds.stream().filter(f -> f.ten.equals(ten)).findFirst().get();
    }

    public List<Menu> timKiem(double start, double end) {
        return this.ds.stream().filter(f -> f.gia >= start && f.gia <= end).collect(Collectors.toList());
    }

    public void sapXep() {
        this.ds.sort((f1, f2) -> {
            double gia1 = f1.gia;
            double gia2 = f2.gia;
            return -(gia1 > gia2 ? 1 : gia1 < gia2 ? -1 : 0);
        });
    }
    public void sapXepTuyChon() {
        System.out.print("Gia bat dau: ");
        double begin = Double.parseDouble(CauHinh.sc.nextLine());
        System.out.print("Gia ket thuc: ");
        double end = Double.parseDouble(CauHinh.sc.nextLine());
        List<Menu> kq = this.timKiem(begin, end);
        kq.sort((f1, f2) -> {
            double gia1 = f1.gia;
            double gia2 = f2.gia;
            return -(gia1 > gia2 ? 1 : gia1 < gia2 ? -1 : 0);
        });
        kq.forEach(f->f.hienThi());
    }
    /**
     * @return the ds
     */
    public List<Menu> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<Menu> ds) {
        this.ds = ds;
    }

    
}
