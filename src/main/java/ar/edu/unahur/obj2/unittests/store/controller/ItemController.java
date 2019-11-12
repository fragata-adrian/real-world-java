package ar.edu.unahur.obj2.unittests.store.controller;

import ar.edu.unahur.obj2.unittests.store.model.Item;
import ar.edu.unahur.obj2.unittests.store.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ItemController {

    //UI

    @Autowired
    private ItemService itemService;

    @RequestMapping(path = "items", method = RequestMethod.GET)
    public List<Item> findAll() {
        return itemService.getAllItem();
    }


}
