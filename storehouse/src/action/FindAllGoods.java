package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.GoodsDao;
import entity.Goods;

public class FindAllGoods extends ActionSupport{

	public String execute() throws Exception{
		List<Goods> goodslist=new ArrayList<Goods>();
		GoodsDao goodsdao=new GoodsDao();
		goodslist=goodsdao.findAll();
		ActionContext.getContext().getContextMap().put("goods", goodslist);
		return "success";

	}

}
