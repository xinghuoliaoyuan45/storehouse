package entity;



/*
create table goods
(
  goods_id bigint  identity primary key ,
  goods_name varchar(15) default null,
  goods_number int default null,
  goods_price double default null,
  goods_description varchar(20) default null,          
)
 */

public class Goods {
	private long  goods_id   ;
	private String  goods_name;
	private int goods_number ;
	private double goods_price ;
	private String  goods_description ;
	public Goods(){
		
	}
	public long getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(long goods_id) {
		this.goods_id = goods_id;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public int getGoods_number() {
		return goods_number;
	}
	public void setGoods_number(int goods_number) {
		this.goods_number = goods_number;
	}
	public double getGoods_price() {
		return goods_price;
	}
	public void setGoods_price(double goods_price) {
		this.goods_price = goods_price;
	}
	public String getGoods_description() {
		return goods_description;
	}
	public void setGoods_description(String goods_description) {
		this.goods_description = goods_description;
	}
	@Override
	public String toString() {
		return "Goods [goods_id=" + goods_id + ", goods_name=" + goods_name
				+ ", goods_number=" + goods_number + ", goods_price="
				+ goods_price + ", goods_description=" + goods_description
				+ "]";
	} 
	
	
}
