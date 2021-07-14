package nLayaredDemo.dataAccess.concretes;

import java.util.List;

import nLayaredDemo.dataAccess.abstracts.ProductDao;
import nLayaredDemo.entities.concretes.Product;

public class AbcProductDao implements ProductDao{

	@Override
	public void add(Product product) {
	
		
	}

	@Override
	public void update(Product product) {
		System.out.print("Abc ile eklendi: " + product.getName());
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
