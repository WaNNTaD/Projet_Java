package com.heh.projetjava.adaptater.out;

import com.heh.projetjava.model.User;
import com.heh.projetjava.port.in.UserListUseCase;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UserPersistenceAdapter implements UserListUseCase {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        List<UserJPAEntity> userEntity = userRepository.findAll();
        return userMapper.mapToDomainEntity(userEntity);
    }
}
