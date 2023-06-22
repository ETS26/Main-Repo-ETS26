package com.example.finalproject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class gorevveri {
    public List<gorevler> gorevleriGetir() {
        List<gorevler> gorev = new ArrayList<>();

        Connection baglanti=null;
        Statement ifade=null;
        ResultSet sonuc=null;

        try {
            baglanti=VeritabaniBaglanti.veritabaniBaslat();
            String sql="SELECT * FROM gorevler";
            ifade=baglanti.createStatement();
            sonuc= ifade.executeQuery(sql);

            while(sonuc.next()) {

                int id=sonuc.getInt("id");
                String g_sahibi=sonuc.getString("g_sahibi");
                String g_adi=sonuc.getString("g_adi");
                String g_aciklama=sonuc.getString("g_aciklama");
                String g_onemi=sonuc.getString("g_onemi");

                gorevler gor1=new gorevler(id,g_sahibi,g_adi,g_aciklama,g_onemi);
                gorev.add(gor1);

            }
            return gorev;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            kapat(baglanti,ifade,sonuc);
        }
}
    private void kapat(Connection baglanti, Statement ifade, ResultSet sonuc) {
        try {
            if (sonuc != null) {
                sonuc.close();
            }
            if (ifade != null) {
                ifade.close();
            }
            if (baglanti != null) {
                baglanti.close();
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
    public void gorevSil(int id) {

        Connection baglanti = null;
        PreparedStatement ifade = null;
        ResultSet sonuc = null;

        try {
            baglanti = VeritabaniBaglanti.veritabaniBaslat();

            String sql = "DELETE FROM gorevler WHERE id=?";
            ifade = baglanti.prepareStatement(sql);
            ifade.setInt(1, id);
            ifade.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void gorevEkle(gorevler gorev1) {

        Connection baglanti=null;
        PreparedStatement ifade=null;
        ResultSet sonuc=null;

        try {
            baglanti=VeritabaniBaglanti.veritabaniBaslat();
            String sql="INSERT INTO gorevler (g_sahibi,g_adi,g_aciklama,g_onemi) VALUES (?,?,?,?)";

            ifade=baglanti.prepareStatement(sql);
            ifade.setString(1,gorev1.getG_sahibi());
            ifade.setString(2,gorev1.getG_adi());
            ifade.setString(3,gorev1.getG_aciklama());
            ifade.setString(4,gorev1.getG_onemi());
            ifade.execute();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
    public void gorevGuncelle(int id,String g_sahibi, String g_adi, String g_aciklama, String g_onemi) {

        Connection baglanti = null;
        PreparedStatement ifade = null;
        ResultSet sonuc = null;

        try {
            baglanti = VeritabaniBaglanti.veritabaniBaslat();
            String sql = "UPDATE gorevler SET g_sahibi=?,g_adi=?,g_aciklama=?,g_onemi=? WHERE id=?";
            ifade = baglanti.prepareStatement(sql);
            ifade.setString(1, g_sahibi);
            ifade.setString(2, g_adi);
            ifade.setString(3, g_aciklama);
            ifade.setString(4, g_onemi);
            ifade.setInt(5,id);
            ifade.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
