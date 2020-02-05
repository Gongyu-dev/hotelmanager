package com.newer.web.servlet;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.newer.domain.Checkins;
import com.newer.service.CheckinsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/select")
public class CheckinsSelectServlet extends HttpServlet {

    private CheckinsService checkinsService=new CheckinsService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=utf-8");
        req.setCharacterEncoding("utf-8");

        List<Checkins> list=checkinsService.selectCheckins();
        System.out.println(list);
        if(list!=null){
            Gson gson =new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            PrintWriter out =resp.getWriter();
            out.print(gson.toJson(list));
            out.close();

        }


    }
}
