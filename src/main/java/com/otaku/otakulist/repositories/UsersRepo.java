package com.otaku.otakulist.repositories;

import com.otaku.otakulist.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepo extends CrudRepository<User,Long> {
}
