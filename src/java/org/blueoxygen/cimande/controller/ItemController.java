package org.blueoxygen.cimande.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.blueoxygen.cimande.entity.Item;
import org.blueoxygen.cimande.service.ItemService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Action("/item")
@Results({
		@Result(name = "success", type = "redirect", location = "/item/search/result"),
		@Result(name = "item-add", type = "velocity", location = "/WEB-INF/velocity/item/item-add.xhtml"),
		@Result(name = "item-edit", type = "velocity", location = "/WEB-INF/velocity/item/item-edit.xhtml"),
		@Result(name = "item-list", type = "velocity", location = "/WEB-INF/velocity/item/item-list.xhtml") })
public class ItemController extends ActionSupport implements
		ModelDriven<Object> {

	@Autowired
	private ItemService itemService;

	private Item item = new Item();
	private List<Item> items = new ArrayList<Item>();
	
	private Object model = null;
	
	public String index() {
		items = itemService.findItems(item.getName());
		
		return "item-add";
	}

	public String result() {
		items = itemService.findItems(item.getName());

		return "item-list";
	}

	public String create() {
		itemService.save(item);

		return SUCCESS;
	}

	public String edit() {
		item = itemService.getItem(item.getId());

		return "item-edit";
	}

	public String update() {
		Item item = itemService.getItem(this.item.getId());
		item.setName(this.item.getName());
		item.setPrice(this.item.getPrice());
		item.setCode(this.item.getCode());
		item.setDescription(this.item.getDescription());
		itemService.save(item);

		return SUCCESS;
	}

	public String delete() {
		Item item = itemService.getItem(this.item.getId());
		itemService.delete(item);

		return SUCCESS;
	}

	public Object getModel() {
		return items.size() > 0 ? items : item;
	}

}
