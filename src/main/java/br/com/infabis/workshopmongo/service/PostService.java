package br.com.infabis.workshopmongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infabis.workshopmongo.domain.Post;
import br.com.infabis.workshopmongo.repository.PostRepository;
import br.com.infabis.workshopmongo.service.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional <Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public List<Post> findByTitle (String text){
//		return repo.findByTitleContainingIgnoreCase(text);
		return repo.searchTitle(text);
	}

}
