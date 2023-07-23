package com.kujproject.kuj.domain.service;

import com.kujproject.kuj.domain.user.UserVo;
import com.kujproject.kuj.domain.user.UserEntity;

import java.util.Optional;


public interface UserService {
    public UserEntity createUser(UserVo userVo);

    public boolean deleteUser(String userId);

    public UserEntity modifyUserInformation(UserEntity userEntity);

    public Optional<UserEntity> searchUserById(String id);
    public boolean existByUserId(String userId);
    public boolean existByEmail(String email);
}
