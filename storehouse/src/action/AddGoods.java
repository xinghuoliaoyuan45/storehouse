package action;

import dao.GoodsDao;
import entity.Goods;

public class AddGoods {
	private long goodsid;
	private String goodsname;
	private int goodsnumber;
	private double goodsprice;
	private String goodsdesc;
	public void setGoodsid(long goodsid) {
		this.goodsid = goodsid;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public void setGoodsnumber(int goodsnumber) {
		this.goodsnumber = goodsnumber;
	}
	public void setGoodsprice(double goodsprice) {
		this.goodsprice = goodsprice;
	}
	public void setGoodsdesc(String goodsdesc) {
		this.goodsdesc = goodsdesc;
	}
	public String  execute() throws Exception{
		Goods goods=new Goods();
		goods.setGoods_description(goodsdesc);
		goods.setGoods_id(goodsid);
		goods.setGoods_name(goodsname);
		goods.setGoods_number(goodsnumber);
		goods.setGoods_price(goodsprice);
		GoodsDao goodsdao=new GoodsDao();
		goodsdao.add(goods);
		return "success";

	}
}
