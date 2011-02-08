package org.blueoxygen.cimande.wrapper;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.blueoxygen.cimande.entity.Item;


@XmlRootElement(name="itemListWrapper")
public class ItemListWrapper {
	
	private List<Item> items;

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	
	
}
