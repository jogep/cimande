/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.blueoxygen.cimande.service;

import java.util.List;

import org.blueoxygen.cimande.entity.Item;



/**
 *
 * @author vick
 */
public interface ItemService {

    void save(Item item);
    void delete(Item item);
    Item getItem(String id);
    List<Item> getItems();
    List<Item> getItems(int start, int num);
    List<Item> findItems(String name);

    

}
