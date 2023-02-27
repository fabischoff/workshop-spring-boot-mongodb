package br.com.infabis.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.infabis.workshopmongo.domain.Post;

public interface PostRepository  extends MongoRepository<Post, String>{

}
