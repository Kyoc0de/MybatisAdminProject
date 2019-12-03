package com.kyo.servlet;

import com.kyo.dao.UserDao;
import com.kyo.entity.Users;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/detail")
public class UsersFindByIdServlet extends HttpServlet {

    private Logger log = Logger.getLogger(UsersFindByIdServlet.class);

    private UserDao userDao = new UserDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");

        log.info("get query info id" + id);

        Users user = userDao.findById(Integer.parseInt(id));

        log.info("query info data"+user);
        req.setAttribute("user",user);
        req.getRequestDispatcher("detail.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");

        Users user = userDao.findById(Integer.parseInt(id));
        req.setAttribute("user",user);
        req.getRequestDispatcher("detail.jsp").forward(req,resp);
    }
}
