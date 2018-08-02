package com.otaku.otakulist.repositories;

import com.otaku.otakulist.models.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentsRepo extends CrudRepository<Comment,Long> {
}
