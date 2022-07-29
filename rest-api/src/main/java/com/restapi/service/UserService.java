package com.restapi.service;

import com.restapi.dto.UserDto;
import com.restapi.entity.User;
import com.restapi.util.CustomPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto user);

    List<UserDto> getUsers();
    UserDto getUser(Integer id);

    UserDto updateUser(Integer id, UserDto user);
    Boolean deleteUser(Integer id);
    Page<User> pagination(int currentPage,int pageSize);

    Page<User> pagination(Pageable pageable);
    Slice<User> slice(Pageable pageable);
    CustomPage<UserDto> customPagination(Pageable pageable);
}
