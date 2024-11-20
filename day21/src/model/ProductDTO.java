package model;

public class ProductDTO {
private int num;
private String name;
private int price;
private int count;
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
@Override
public String toString() {
	return "ProductDTO [num=" + num + ", name=" + name + ", price=" + price + ", count=" + count + "]";
}


}
