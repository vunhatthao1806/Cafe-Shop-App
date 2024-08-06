/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thaovu.demo;

/**
 *
 * @author Dell Vostro 3400
 */
public class BoPhan{
    private static int dembp=0;
    protected int maBP;
    private int capCao;
    {
        dembp++;
        this.maBP=dembp;
    }
    protected String tenBP;

    public BoPhan(String tenBP, int capCao) {
        this.tenBP = tenBP;
        this.capCao = capCao;
    }

   

    /**
     * @return the tenBP
     */
    public String getTenBP() {
        return tenBP;
    }

    /**
     * @param tenBP the tenBP to set
     */
    public void setTenBP(String tenBP) {
        this.tenBP = tenBP;
    }

    /**
     * @return the capCao
     */
    public int getCapCao() {
        return capCao;
    }

    /**
     * @param capCao the capCao to set
     */
    public void setCapCao(int capCao) {
        this.capCao = capCao;
    }
}
