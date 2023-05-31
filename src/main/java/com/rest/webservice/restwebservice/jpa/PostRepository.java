package com.rest.webservice.restwebservice.jpa;

import com.rest.webservice.restwebservice.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
