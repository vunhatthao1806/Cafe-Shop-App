package com.thaovu.demo;

public class Ban {
    //======================================= THUOC TINH
    private int maBan;
    public static int dem = 0;
    private int sucChua;
    private boolean isEmty=true;
    
    
    //======================================= PHUONG THUC
    
    //---------------------------- Phuong thuc khoi tao KHONG THAM SO
    public Ban() {
        this.maBan = ++dem;
    }
    
    //---------------------------- Phuong thuc KHOI TAO 1 THAM SO (suc chua)
     public Ban(int sucChua) {
        this.sucChua = sucChua;
        this.maBan = ++dem;
    }
     
    //---------------------------- THEM theo cach nhap SUC CHUA 1 ban tu BAN PHIM
    public void them() {
        System.out.print("Nhap suc chua: ");
        this.sucChua = Integer.parseInt(CauHinh.sc.nextLine());
    }

   
    //---------------------------- HIEN THI 1 ban
    public void hienThiBan() {
        System.out.println("============================================");
        System.out.printf("Ma ban: B%03d\nSuc chua: %d\n", this.getMaBan(), this.sucChua);
        if (isIsEmty()) {
            System.out.println("Con trong!!!!!!!!!!!!!");
        } else {
            System.out.println("Het");
        }
    }
    //***************chua duoc**************
    //---------------------------- KIEM TRA tinh trang TRONG hay KHONG TRONG
    public boolean daDat() {
        setIsEmty(false);
       return isIsEmty();
    }

    
    
    
    
    /**
     * @return the sucChua
     */
    public int getSucChua() {
        return sucChua;
    }

    /**
     * @param sucChua the sucChua to set
     */
    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }
    /**
     * @return the maBan
     */
    public int getMaBan() {
        return maBan;
    }
    /**
     * @param maBan the maBan to set
     */
    public void setMaBan(int maBan) {
        this.maBan = maBan;
    }

    /**
     * @return the isEmty
     */
    public boolean isIsEmty() {
        return isEmty;
    }

    /**
     * @param isEmty the isEmty to set
     */
    public void setIsEmty(boolean isEmty) {
        this.isEmty = isEmty;
    }
}
