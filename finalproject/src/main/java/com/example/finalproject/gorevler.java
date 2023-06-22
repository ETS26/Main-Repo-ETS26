package com.example.finalproject;

public class gorevler {
    private int id;
    private String g_sahibi;
    private String g_adi;
    private String g_aciklama;
    private String g_onemi;

    public gorevler(int id, String gSahibi, String gAdi, String gAciklama, String gOnemi) {
        this.id = id;
        this.g_sahibi = gSahibi;
        this.g_adi = gAdi;
        this.g_aciklama = gAciklama;
        this.g_onemi = gOnemi;
    }
    public gorevler(String gSahibi, String gAdi, String gAciklama, String gOnemi) {
        this.g_sahibi = gSahibi;
        this.g_adi = gAdi;
        this.g_aciklama = gAciklama;
        this.g_onemi = gOnemi;
    }



    public String getG_sahibi() {
        return g_sahibi;
    }

    public void setG_sahibi(String g_sahibi) {
        this.g_sahibi = g_sahibi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getG_adi() {
        return g_adi;
    }

    public void setG_adi(String g_adi) {
        this.g_adi = g_adi;
    }

    public String getG_aciklama() {
        return g_aciklama;
    }

    public void setG_aciklama(String g_aciklama) {
        this.g_aciklama = g_aciklama;
    }

    public String getG_onemi() {
        return g_onemi;
    }

    public void setG_onemi(String g_onemi) {
        this.g_onemi = g_onemi;
    }
}