package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class Cart implements Serializable {
	private int id;
	private String gooodsName;
	private int price;
	private int count;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getGoodsName() {
		return gooodsName;
	}
	
	public void setgoodsName(String goodsName) {
		this.gooodsName=goodsName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count=count;
	}
	

	
	

}
