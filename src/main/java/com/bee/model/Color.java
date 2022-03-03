package com.bee.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Color {

	@Id
	@GeneratedValue
	private int color_id;
	@ManyToOne
	private Items item;
	public Color() {
		super();
	}
	public Color(String color, int stock_xs, int stock_s, int stock_m, int stock_l, int stock_xl) {
		super();
		this.color = color;
		this.stock_xs = stock_xs;
		this.stock_s = stock_s;
		this.stock_m = stock_m;
		this.stock_l = stock_l;
		this.stock_xl = stock_xl;
	}
	public int getColor_id() {
		return color_id;
	}
	public void setColor_id(int color_id) {
		this.color_id = color_id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getStock_xs() {
		return stock_xs;
	}
	public void setStock_xs(int stock_xs) {
		this.stock_xs = stock_xs;
	}
	public int getStock_s() {
		return stock_s;
	}
	public Items getItem() {
		return item;
	}
	public void setItem(Items item) {
		this.item = item;
	}
	public void setStock_s(int stock_s) {
		this.stock_s = stock_s;
	}
	public int getStock_m() {
		return stock_m;
	}
	public void setStock_m(int stock_m) {
		this.stock_m = stock_m;
	}
	public int getStock_l() {
		return stock_l;
	}
	public void setStock_l(int stock_l) {
		this.stock_l = stock_l;
	}
	public int getStock_xl() {
		return stock_xl;
	}
	public void setStock_xl(int stock_xl) {
		this.stock_xl = stock_xl;
	}
	private String color;
	private int stock_xs;
	private int stock_s;
	private int stock_m;
	private int stock_l;
	private int stock_xl;
		
	}


