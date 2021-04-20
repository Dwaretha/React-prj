package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackend1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackend1Application.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Tom","Robotics","Sam,Tony","tom@gmail.com"));
		this.userRepository.save(new User("Sunil","Health","Swetha,Sarla","sunilhea@gmail.com"));
		this.userRepository.save(new User("Pooja","Genetics","Akash,vijay","poogentic@gmail.com"));
		this.userRepository.save(new User("Shruti","Technical Experiments on human","Akshara,Bharati","shtechhum@gmail.com"));
		
		
		
	}

}
