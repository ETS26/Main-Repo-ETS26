package com.example.finalproject;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "GorevlerServlet", value = "/index")
public class gorevlerservlet extends HttpServlet {

    private gorevveri Veri =new gorevveri();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        List<gorevler> gorev = Veri.gorevleriGetir();
        List<gorevler> cokonemli = new ArrayList<>();
        List<gorevler> onemli = new ArrayList<>();
        List<gorevler> azonemli = new ArrayList<>();

        for (int i = 0; i < gorev.size(); i++) {
            if (gorev.get(i).getG_onemi().length() == 10) {
                cokonemli.add(gorev.get(i));

            }
            if (gorev.get(i).getG_onemi().length() == 6) {
                onemli.add(gorev.get(i));
            }
            if (gorev.get(i).getG_onemi().length() == 9) {
                azonemli.add(gorev.get(i));
            }
        }
        request.setAttribute("gorevler_listesi", gorev);

            request.setAttribute("cokonemli", cokonemli);
            request.setAttribute("onemli", onemli);
            request.setAttribute("azonemli", azonemli);

        RequestDispatcher rs1=request.getRequestDispatcher("/anasayfa.jsp");

        try {
            rs1.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }


    }

}

