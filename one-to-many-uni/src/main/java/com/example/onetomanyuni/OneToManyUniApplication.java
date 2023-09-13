package com.example.onetomanyuni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.onetomanyuni.entity.Comment;
import com.example.onetomanyuni.entity.Post;
import com.example.onetomanyuni.repository.CommentRepository;
import com.example.onetomanyuni.repository.PostRepository;

@SpringBootApplication
public class OneToManyUniApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OneToManyUniApplication.class, args);
	}

	@Autowired
	private CommentRepository cr;
	@Autowired
	private PostRepository pr;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Post p=new Post("G20Summit","This year G20Summit organized in India");
		Comment c=new Comment("Nice");
		Comment c1=new Comment("Wow!");
		Comment c2=new Comment("Pride of India");
		p.getCom().add(c);
		p.getCom().add(c1);
		p.getCom().add(c2);
		pr.save(p);
		
	}

}
