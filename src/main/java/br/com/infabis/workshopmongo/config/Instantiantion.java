package br.com.infabis.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.infabis.workshopmongo.domain.User;
import br.com.infabis.workshopmongo.repository.UserRepository;


@Configuration
public class Instantiantion implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		User teste = new User(null, "Bob teste", "teste@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob, teste));

	}

}
