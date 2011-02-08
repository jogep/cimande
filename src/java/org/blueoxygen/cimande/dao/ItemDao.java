/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.blueoxygen.cimande.dao;

import java.util.List;

import org.blueoxygen.cimande.dao.base.BaseDaoHibernate;
import org.blueoxygen.cimande.entity.Item;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author vick
 */
@Repository
public class ItemDao extends BaseDaoHibernate<Item> {

	@SuppressWarnings("unchecked")
	public List<Item> findItem(String name) {
		name = name == null ? "" : name;
		return sessionFactory
				.getCurrentSession()
				.createQuery(
						"from " + domainClass.getName() + " where name like '%"
								+ name + "%' ").list();
	}

	@SuppressWarnings("unchecked")
	public List<Item> itemCategory(String catagoryId) {
		return sessionFactory
				.getCurrentSession()
				.createQuery(
						"from " + domainClass.getName()
								+ " where category_id='" + catagoryId + "'")
				.list();
	}

	@SuppressWarnings("unchecked")
	public List<Item> listItem() {
		return sessionFactory
				.getCurrentSession()
				.createQuery(
						"from " + domainClass.getName()
								+ " where category_id=null").list();
	}
}
