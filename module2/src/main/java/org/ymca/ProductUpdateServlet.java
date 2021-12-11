package org.ymca;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/product_update")
public class ProductUpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer productId = Integer.valueOf(req.getParameter("id"));
        if (productId == null){
            throw new ServletException("Missing parameter id");
        }

        ProductsDB productsDB = ProductsDB.getInstance();
        Product product = productsDB.getProduct(productId); // fetch the product from DB

        if (product == null){ //product not found
            resp.setStatus(404);
            req.getRequestDispatcher("not_found.jsp").forward(req, resp);
            return;
        }

        //Forward the request to product_update.jsp to render the product page
        req.setAttribute("product", product);
        req.getRequestDispatcher("product_update.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer productId = Integer.valueOf(req.getParameter("id"));
        ProductsDB productsDB = ProductsDB.getInstance();
        Product product = productsDB.getProduct(productId); // fetch the product from DB
        
        if (productId == null){
            throw new ServletException("Missing parameter id");
        }
        if (product == null) {
            throw new ServletException("The product is not existing");
        }

        String name = req.getParameter("name");
        double price = Double.valueOf(req.getParameter("price"));
        int remainingAmount = Integer.valueOf((req.getParameter("remainingAmount")));

        // Save product to Database
        product.setName(name);
        product.setPrice(price);
        product.setRemainingAmount(remainingAmount);
        ProductsDB.getInstance().updateProduct(product);

        //Forward the request to product_detail.jsp to render the product page
        req.setAttribute("product", product);
        req.getRequestDispatcher("product_detail.jsp").forward(req, resp);
    }
}
