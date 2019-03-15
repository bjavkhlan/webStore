package controller;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

import dao.UserData;
import model.User;

public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String remember = req.getParameter("remember");
        HttpSession session = req.getSession();

        User user = UserData.getUser(username);
        if (user == null) {
            session.setAttribute("err_msg","Username is not correct!");
            resp.sendRedirect("login");
        } else if (user.getUsername().equals(password)) {
            session.setAttribute("user", user);

            Cookie cookie = new Cookie("username", username);
            if ("checked".equals(remember)) cookie.setMaxAge(30 * 24 * 60 * 60);
            else cookie.setMaxAge(0);
            resp.addCookie(cookie);

            resp.sendRedirect("/");
        } else {
            session.setAttribute("err_msg","Password is not correct!");
            resp.sendRedirect("login");
        }
    }
}
