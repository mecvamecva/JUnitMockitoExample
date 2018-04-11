package br.inatel.ec.ec206.example.report;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

	public List<Product> listAll() {
		ArrayList<Product> result = new ArrayList<>();
		result.add(new Product().withName("Arroz").withQuantity(10));
		result.add(new Product().withName("Feijão").withQuantity(20));
		return result;
	}

}
