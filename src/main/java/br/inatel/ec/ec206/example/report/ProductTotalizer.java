package br.inatel.ec.ec206.example.report;

import java.util.List;

public class ProductTotalizer {

	private ProductDAO productDAO = new ProductDAO();

	public int totalize() {
		List<Product> products = productDAO.listAll();
		return products.stream().mapToInt(Product::getQuantity).sum();
	}

}
