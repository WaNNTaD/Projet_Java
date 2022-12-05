package com.heh.projetjava.adaptater.out;

import java.util.ArrayList;
import java.util.List;

public class UserMapper {

    List<UserJPAEntity> mapToDomainEntity(List<UserJPAEntity> users){
        List<UserJPAEntity> usersList = new ArrayList<>();

        for (UserJPAEntity userJPAEntity: users) {
            usersList.add(new UserJPAEntity(userJPAEntity.getNom(),userJPAEntity.getPrenom(),userJPAEntity.getMail(),userJPAEntity.getMdp(), userJPAEntity.getFonction()));
        }
        return usersList;
    }
}
