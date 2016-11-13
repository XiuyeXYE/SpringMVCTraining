package com.xiuye.web.bean;

public class Apple {

	private double weight;
	private String type;
	private String kind;
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	@Override
	public String toString() {
		return "Apple [weight=" + weight + ", type=" + type + ", kind=" + kind + "]";
	}


}
