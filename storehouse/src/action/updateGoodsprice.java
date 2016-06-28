package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.GoodsDao;
import entity.Goods;

public class updateGoodsprice extends ActionSupport{
private long updateid;
private double updateprice;
	public void setUpdateid(long updateid) {
	this.updateid = updateid;
}
public void setUpdateprice(double updateprice) {
	this.updateprice = updateprice;
}

	public String execute() throws Exception{
		Goods goods=new Goods();
		goods.setGoods_id(updateid);
		goods.setGoods_price(updateprice);
		GoodsDao goodsdao=new GoodsDao();
		goodsdao.updateprice(goods);
	
		return "success";


	}

}
