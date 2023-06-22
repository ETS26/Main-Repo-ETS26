package com.example.finalproject;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.util.List;

@WebServlet(name = "gorevekleservlet", value = "/gorevEkle")
public class gorevekleservlet extends HttpServlet {

    private gorevveri Veri =new gorevveri();

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        try {
            String g_sahibi=request.getParameter("g_sahibi");
            String g_adi=request.getParameter("g_adi");
            String g_aciklama=request.getParameter("g_aciklama");
            String g_onemi=request.getParameter("g_onemi");

            gorevler gorev=new gorevler(g_sahibi,g_adi,g_aciklama,g_onemi);

            Veri.gorevEkle(gorev);

            response.sendRedirect(request.getContextPath()+ "/index");



        }catch (Exception ex) {
            throw new RuntimeException();
        }

    }
}

