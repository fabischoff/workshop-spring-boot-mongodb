package br.com.infabis.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.infabis.workshopmongo.domain.User;

//@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
