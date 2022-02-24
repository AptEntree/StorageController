package storage.model;

import java.time.LocalDate;
import java.util.ArrayList;

import storage.obj.Product;

public class ProductManager {
	private ArrayList<Product> prod;
	public ProductManager(ArrayList<Product> prod) {
		this.prod = prod;
	}
	
	// expD = Expiration day
	// expM = Expiration month
	// expY = Expiration year
	public boolean create(String name, int expD, int expM, int expY, int qtt) {
		try {
			Product p = new Product(name, LocalDate.of(expY, expM, expD), qtt);
			prod.add(p);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			return false;
		}
		return true;
	}
	public ArrayList<Product> list() {
		return prod;
	}
	public Product getById(int i) {
		return prod.get(i);
	}
	public Product getByName(String name) {
		for (Product product : prod) {
			if(product.getName().equals(name));
			{
				return product;
			}
		}
		return null;
	}
	public boolean delete(int id) {
		try {
			prod.remove(id);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			return false;
		}
		return true;
	}
	public boolean modify(int i, String name, int expD, int expM, int expY, int qtt) {
		try {
			Product p = new Product(name, LocalDate.of(expY, expM, expD), qtt);
			prod.remove(i);
			prod.add(i, p);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			return false;
		}
		return true;
	}

}
