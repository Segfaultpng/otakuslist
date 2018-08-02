package com.otaku.otakulist.repositories;

import com.otaku.otakulist.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostsRepo extends CrudRepository<Post,Long> {
}
