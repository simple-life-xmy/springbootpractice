package com.xmy.springbootpractice.service;

import com.xmy.springbootpractice.domain.User;

import java.util.List;

/**
 * @author xmy
 */
public interface IUserService {

    User get(Long id);

    List<User> list();
}
