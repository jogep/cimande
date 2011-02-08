/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.blueoxygen.cimande.form;

import java.util.List;

import org.blueoxygen.cimande.entity.Item;



/**
 *
 * @author vick
 */
public class ItemForm {

    private Item item = new Item();
    private List<Item> items;

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
    public ItemForm(){
    }

    public ItemForm(Item item){
        this.item = item;
    }

    public void setItem(Item item){
        this.item = item;
    }

    public Item getItem(){
        return item;
    }

    public void setId(String id){
        item.setId(id);
    }

    public String getId(){
        return item.getId();
    }
    
    public void setCode(String code){
        item.setCode(code);
    }

    public String getCode(){
        return item.getCode();
    }

    public void setName(String name){
        item.setName(name);
    }

    public String getName(){
        return item.getName();
    }

    public void setDescription(String description){
        item.setDescription(description);
    }

    public String getDescription(){
        return item.getDescription();
    }

    public void setPrice(Long price){
        item.setPrice(price);
    }

    public Long getPrice(){
        return item.getPrice();
    }

}
