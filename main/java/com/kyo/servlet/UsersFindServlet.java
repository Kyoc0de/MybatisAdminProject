package com.kyo.servlet;

import com.kyo.dao.UserDao;
import com.kyo.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/index")
public class UsersFindServlet extends HttpServlet {

    private UserDao userDao = new UserDao();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Users> list = userDao.findAll();
        req.setAttribute("usersList",list);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Users> list = userDao.findAll();
        req.setAttribute("usersList",list);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
