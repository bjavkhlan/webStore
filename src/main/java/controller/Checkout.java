package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class Checkout extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        HttpSession session = req.getSession();
//        model.ShoppingCart cart = (model.ShoppingCart) session.getAttribute("shoppingCart");
//        if (cart == null) resp.getWriter().print("No item in your shopping cart!");
//        else {
//            PrintWriter out = resp.getWriter();
//            out.println("Total Price: "+ cart.calculateTotalPrice() + "");
//            for (model.Product item: cart.getItems()) {
//                out.println("model.Product: " + item.getName() + ", Price: " + item.getPrice());
//            }
//        }
        resp.sendRedirect("checkout.jsp");
    }
}
