/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blueoxygen.cimande.service.impl;

import java.util.List;


import org.blueoxygen.cimande.dao.ItemDao;
import org.blueoxygen.cimande.entity.Item;
import org.blueoxygen.cimande.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author vick
 */
@Service
@Transactional(readOnly = true)
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;

    @Transactional
    public void save(Item item) {
        itemDao.save(item);
    }

    @Transactional
    public void delete(Item item) {
        itemDao.delete(item);
    }

    public Item getItem(String id) {
        return itemDao.findById(id);
    }

    public List<Item> getItems() {
        return itemDao.findAll();
    }

    public List<Item> getItems(int start, int num) {
        return itemDao.findAll(start, num);
    }

    public List<Item> findItems(String name){
        return itemDao.findItem(name);
    }

    
}
