package com.bee.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Items {

	@Id
	@GeneratedValue
	private int item_id;
	private String item_name;
	private String item_des;
	private int item_price;
    private int item_discount;

    @OneToMany(mappedBy="item",cascade = CascadeType.ALL)
    private List<Color> colors;
    
    
	
	public List<Color> getColors() {
		return colors;
	}
	public void setColors(List<Color> colors) {
		this.colors = colors;
	}
	public Items() {
		super();
		colors = new ArrayList<>();
	}
	public Items(String item_name, String item_des, int item_price, int item_discount, String type, int stocks) {
		super();
		this.item_name = item_name;
		this.item_des = item_des;
		this.item_price = item_price;
		this.item_discount = item_discount;
		this.type = type;
		this.stocks = stocks;
	}
	
	
	
    
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getItem_des() {
		return item_des;
	}
	public void setItem_des(String item_des) {
		this.item_des = item_des;
	}
	public int getItem_price() {
		return item_price;
	}
	public void setItem_price(int item_price) {
		this.item_price = item_price;
	}
	public int getItem_discount() {
		return item_discount;
	}
	public void setItem_discount(int item_discount) {
		this.item_discount = item_discount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getStocks() {
		return stocks;
	}
	public void setStocks(int stocks) {
		this.stocks = stocks;
	}
	private String type;
    private int stocks;
}
