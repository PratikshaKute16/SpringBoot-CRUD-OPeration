package com.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringBootDemoApplication {
	public static void main(String[] args) {
		System.out.println("Welcome to springboot");
	ApplicationContext context=SpringApplication.run(SpringBootDemoApplication.class, args);
	USerRepo uSerRepo=context.getBean(USerRepo.class);

//	User user= new User();
//	user.setName("Pratiksha");
//	user.setCity("Pune");

//  saving single user
//	User user1=uSerRepo.save(user);
//		System.out.println(user1);

//creating user
//		User user= new User();
//	    user.setName("Pratiksha");
//        user.setCity("Pune");
//
//		User user1=new User();
//		user1.setName("Sanket");
//		user1.setCity("A.nagar");

//saving single user
//		User user2=uSerRepo.save(user1);
//		System.out.println("User save"+user2);
//		System.out.println("done");

//saving multiple user
//		List<User>users=List.of(user,user1);
//		Iterable<User> result=USerRepo.saveAll(users);
//		result.forEach(User->{
//			System.out.println(result);
//		});

// update the user of  id 2
//         Optional<User> optional =uSerRepo.findById(2);
//		 User user= optional.get();
//		 user.setCity("Ahemadnagar");
//		 User result=uSerRepo.save(user);
//		System.out.println(result);

//Deleting the user element(by id)
//		uSerRepo.deleteById(2);
//		System.out.println("Deleted");

		//Deleting the user element (by deleteAll)
		Iterable<User> allUsers=uSerRepo.findAll();
		allUsers.forEach(user -> System.out.println(user));
			uSerRepo.deleteAll(allUsers);




	}

}
