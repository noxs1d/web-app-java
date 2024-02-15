package com.example.webapp.repo;

import com.example.webapp.models.post;
import org.springframework.data.repository.CrudRepository;

public interface postRepository extends CrudRepository<post,Long> {
}
