package com.heh.projetjava.adaptater.out;

import java.util.ArrayList;
import java.util.List;

public class ItemsMapper {

    List<ItemsJPAEntity> mapToDomainEntity(List<ItemsJPAEntity> items){
        List<ItemsJPAEntity> itemsList = new ArrayList<>();

        for (ItemsJPAEntity itemsJPAEntity: items) {
            itemsList.add(new ItemsJPAEntity(itemsJPAEntity.getId(),itemsJPAEntity.getNom(),itemsJPAEntity.getDescr(),itemsJPAEntity.getPrix(),itemsJPAEntity.getCategorie()));
        }
        return itemsList;
    }
}
