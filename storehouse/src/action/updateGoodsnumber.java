package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.GoodsDao;
import entity.Goods;

public class updateGoodsnumber extends ActionSupport{
	private long outid;
	private int outnumber;
	public void setOutid(long outid) {
		this.outid = outid;
	}
	public void setOutnumber(int outnumber) {
		this.outnumber = outnumber;
	}
	public String execute() throws Exception{
		Goods goods=new Goods();
		goods.setGoods_id(outid);	
		GoodsDao goodsdao=new GoodsDao();
		Goods good1=goodsdao.findById(outid);
		int number=good1.getGoods_number();	
		number=number+outnumber;	
		goods.setGoods_number(number);		
		goodsdao.updatechuku(goods);
	
		return "success";

	}

}
