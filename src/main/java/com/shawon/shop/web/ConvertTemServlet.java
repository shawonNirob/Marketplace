package com.shawon.shop.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/convert")
public class ConvertTemServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/convert.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String temperature = req.getParameter("temperature");
        if (temperature != null && temperature.length() > 0) {
            double temperatureInC = Double.parseDouble(temperature);
            double temperatureInF = (temperatureInC * 9 / 5) + 32;
            req.setAttribute("temperatureInF", temperatureInF);
        }
        req.getRequestDispatcher("/WEB-INF/result.jsp").forward(req, resp);
    }
}
