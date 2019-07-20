package com.trenchbl.blogger.bloggerjava.repositories;

import com.trenchbl.blogger.bloggerjava.entities.BlogPost;
import org.springframework.data.repository.CrudRepository;

public interface BlogPostRepository extends CrudRepository<BlogPost, Integer> {

}
