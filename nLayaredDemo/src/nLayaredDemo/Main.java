package nLayaredDemo;

import nLayaredDemo.bussiness.abstracts.ProductService;
import nLayaredDemo.bussiness.concretes.ProductManager;
import nLayaredDemo.core.JLoggerManagerAdapter;
import nLayaredDemo.dataAccess.concretes.AbcProductDao;

import nLayaredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {

		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());

		Product product = new Product(1, 2, "Elma", 3,5);
		productService.add(product);
		
		
		
	}

}
