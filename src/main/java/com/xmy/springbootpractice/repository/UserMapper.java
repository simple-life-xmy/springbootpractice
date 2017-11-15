package com.xmy.springbootpractice.repository;

import com.xmy.springbootpractice.domain.User;

import java.util.List;

/**
 * @author xmy
 */
public interface UserMapper {

    User get(Long id);

    List<User> all();
}
