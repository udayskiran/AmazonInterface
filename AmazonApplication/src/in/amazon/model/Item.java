package in.amazon.model;

public class Item {
	int Id;
	String Name;
	long Price;
	int Discount;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getPrice() {
		return Price;
	}
	public void setPrice(long price) {
		this.Price = price;
	}
	public int getDiscount() {
		return Discount;
	}
	public void setDiscount(int discount) {
		Discount = discount;
	}
	public String toString() {
		return "Item [Id=" + Id + ", Name=" + Name + ", Price=" + Price + ", Discount=" + Discount + "]";
	}
	
	
}
