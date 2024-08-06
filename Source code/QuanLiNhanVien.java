/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thaovu.demo;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Dell Vostro 3400
 */
public class QuanLiNhanVien {

    private List<NhanVien> ds = new ArrayList<>();

    public void themNV(NhanVien... a) {
        this.ds.addAll(Arrays.asList(a));
    }

    public void hienThiDsNhanVien() {
        this.ds.forEach(e -> System.out.println(e));
    }

    public void themNV(int n) throws ParseException {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin nhan vien thu " + (i + 1));
            NhanVien e = new NhanVien();
            e.nhapNV();
            this.ds.add(e);
            System.out.println("Them thanh cong!!!");
        }
    }

    public List<NhanVien> traCuuTheoTen(String ten) {
        return this.ds.stream().filter(e -> e.getHoTen().contains(ten)).collect(Collectors.toList());
    }

    public List<NhanVien> traCuuTheoGioiTinh(String gt) {
        return this.ds.stream().filter(e -> e.getGioiTinh().equalsIgnoreCase(gt)).collect(Collectors.toList());
    }

    public List<NhanVien> traCuuTheoQueQuan(String qq) {
        return this.ds.stream().filter(e -> e.getQueQuan().equalsIgnoreCase(qq)).collect(Collectors.toList());
    }

    public List<NhanVien> tracuuTheoNgaySinh(String n) {
        List<NhanVien> kq = new ArrayList<>();
        for (NhanVien e : this.ds) {
            String ngaySinh = CauHinh.f.format(e.getNgaySinh());
            String[] a = ngaySinh.split("/");
            String ngay = a[0];
            if (ngay.equals(n)) {
                kq.add(e);
            }
        }
        return kq;
    }
    public NhanVien soSanhMaNV(int ma)
    {
        return this.ds.stream().filter(e->e.getMaNV() == ma).findFirst().get();
    }
    public List<NhanVien> toChucSinhNhat() {
        List<NhanVien> kq = new ArrayList<>();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String t = dtf.format(now);
        String[] a = t.split("/");
        String th = a[1];
        for (NhanVien e : this.ds) {
            String ngaySinh = CauHinh.f.format(e.getNgaySinh());
            String[] b = ngaySinh.split("/");
            String thang = b[1];
            if (thang.equals(th)) {
                kq.add(e);
            }
        }
        return kq;
    }
    public void capNhat(){
        System.out.print("Nhap ten nhan vien can cap nhat: ");
        String t= CauHinh.sc.nextLine();
        List<NhanVien> kq= traCuuTheoTen(t);
        System.out.print("Nhap ten muon thay doi: ");
        String name=CauHinh.sc.nextLine();
        kq.forEach(e->e.setHoTen(name));
        System.out.println("Cap nhat thanh cong!!!");
    }
    public void xoaDsNhanVien(int id) {
        NhanVien nv = this.ds.stream().filter(e -> e.getMaNV() == id).findFirst().get();
        this.ds.remove(nv);
        System.out.println("Xoa thanh cong!!!");
    }

    public void xoaDsNhanVien(String kw) {
        List<NhanVien> dsxoa = this.ds.stream().filter(e -> e.getHoTen().contains(kw)).collect(Collectors.toList());
        this.ds.removeAll(dsxoa);
        System.out.println("Xoa thanh cong!!!");
    }

    /**
     * @return the ds
     */
    public List<NhanVien> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<NhanVien> ds) {
        this.ds = ds;
    }
}
