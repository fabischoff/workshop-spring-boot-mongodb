package br.com.infabis.workshopmongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infabis.workshopmongo.domain.User;
import br.com.infabis.workshopmongo.repository.UserRepository;
import br.com.infabis.workshopmongo.service.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findById (String id) {
		Optional<User> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
