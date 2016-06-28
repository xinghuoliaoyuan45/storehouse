package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import dao.GoodsDao;
import entity.Goods;

public class FindLikeName {
	private String selectlikegoodsname;

	public void setSelectlikegoodsname(String selectlikegoodsname) {
		this.selectlikegoodsname = selectlikegoodsname;
	}
	public String execute() throws Exception{
		List<Goods> goodslist=new ArrayList<Goods>();
		GoodsDao goodsdao=new GoodsDao();
		goodslist=goodsdao.findbylikename(selectlikegoodsname);
		ActionContext.getContext().getContextMap().put("goods", goodslist);
		return "success";
		
	}

}
