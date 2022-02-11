package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "controllers.AdsSearchServlet",urlPatterns = "/ads/search")
public class AdsSearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String param = req.getParameter("query");
        List<Ad>results = new ArrayList<>();
        //  chance that "query" doesn't exist
        if(param != null){
            results = DaoFactory.getAdsDao().searchAdByTitle(param);
        }
        req.setAttribute("ads", results);
        req.setAttribute("query", param);
        //  cannot forget WEB-INF
        req.getRequestDispatcher("/WEB-INF/ads/search.jsp").forward(req, res);
    }
}
