package storage.obj;

import java.time.LocalDate;

public class Product {
	private String name;
	private LocalDate expDate;
	private int qtt;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getExpDate() {
		return expDate;
	}
	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}
	public int getQtt() {
		return qtt;
	}
	public void setQtt(int qtt) {
		this.qtt = qtt;
	}
	public boolean getIsExp() {
		if(expDate.isAfter(LocalDate.now())) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Produto [name=" + name + ", expDate=" + expDate + ", qtt=" + qtt + "]";
	}
	public Product(String name, LocalDate expDate, int qtt) {
		super();
		this.name = name;
		this.expDate = expDate;
		this.qtt = qtt;
	}
}
