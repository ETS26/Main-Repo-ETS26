package com.example.finalproject;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;
import java.util.List;

@WebServlet(name = "gorevguncelleservlet", value = "/gorevGuncelle")
public class gorevguncelleservlet extends HttpServlet {
    private gorevveri Veri =new gorevveri();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        int id=Integer.parseInt(request.getParameter("id"));

        List<gorevler> gorevler_liste = Veri.gorevleriGetir();
        gorevler gorev =null;
        for (gorevler g:
                gorevler_liste) {
            if(g.getId()==id){
                gorev=g;
            }

        }

        request.setAttribute("gorev",gorev);

        RequestDispatcher rs1=request.getRequestDispatcher("/gorev-guncelle-form.jsp");

        try {
            rs1.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id=request.getParameter("id");
        String g_sahibi=request.getParameter("g_sahibi");
        String g_adi=request.getParameter("g_adi");
        String g_aciklama=request.getParameter("g_aciklama");
        String g_onemi=request.getParameter("g_onemi");
        Veri.gorevGuncelle(Integer.parseInt(id),g_sahibi,g_adi,g_aciklama,g_onemi);
        response.sendRedirect(request.getContextPath()+ "/index");

    }

}
