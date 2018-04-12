package com.cz.data.dao;

import com.cz.data.model.T_User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<T_User, Long> {
}
