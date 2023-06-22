package com.example.finalproject;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "gorevsilservlet", value = "/gorevSil")
public class gorevsilservlet extends HttpServlet {

    private gorevveri Veri =new gorevveri();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        try {
            String id=request.getParameter("g_id");

            Veri.gorevSil(Integer.parseInt(id));
            response.sendRedirect(request.getContextPath()+ "/index");


        }catch (Exception ex) {
            throw new RuntimeException();
        }
    }

}
