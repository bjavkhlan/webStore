import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet({""})
public class Main extends HttpServlet {
    ProductData products = new ProductData();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if (session.getAttribute("products") == null)
            req.getSession().setAttribute("products", products.getProducts());
        req.getRequestDispatcher("shop.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        ShoppingCart cart = (ShoppingCart) session.getAttribute("shoppingCart");
        if (cart == null)
            cart = new ShoppingCart();
        int productId = Integer.parseInt(req.getParameter("productId"));
        cart.addItem(products.getProductById(productId));
        session.setAttribute("shoppingCart", cart);

        resp.sendRedirect("/");
    }
}
