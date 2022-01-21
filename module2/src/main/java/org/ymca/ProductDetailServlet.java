package org.ymca;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/product_detail")
public class ProductDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer productId = Integer.valueOf(req.getParameter("id"));
		if (productId == null) {
			throw new ServletException("Missing parameter id");
		}

		// fetch the product from DB
		ProductsDB productsDB = ProductsDB.getInstance();
		Product product = productsDB.getProduct(productId);

		// product not found
		if (product == null) {
			resp.setStatus(404);
			req.getRequestDispatcher("not_found.jsp").forward(req, resp);
			return;
		}

		// Forward the request to product_detail.jsp to render the product page
		req.setAttribute("product", product);
		req.getRequestDispatcher("product_detail.jsp").forward(req, resp);
	}
}
