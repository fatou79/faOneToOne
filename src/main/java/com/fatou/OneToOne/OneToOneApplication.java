package com.fatou.OneToOne;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fatou.OneToOne.entity.Gender;
import com.fatou.OneToOne.entity.User;
import com.fatou.OneToOne.entity.UserProfile;
import com.fatou.OneToOne.repository.UserProfileRepository;
import com.fatou.OneToOne.repository.UserRepository;

@SpringBootApplication
public class OneToOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToOneApplication.class, args);
	}
	
//	@Autowired
//	private UserRepository userRepository;
//	
//	 @Autowired
//	 private UserProfileRepository userProfileRepository ;
//
//	@Override
//	public void run(String... args) throws Exception {
//		
//		//user object
//		User user = new User ();
//		user.setId(1100L);
//		user.setName("fatima");
//		user.setEmail("fatou@gmail.com");
//		
//		UserProfile userProfile = new  UserProfile();
//		userProfile.setAddress("sicap");
//		userProfile.setBirthOdate(LocalDate.of(1979, 05, 04));
//		userProfile.setGender(Gender.FEMALE);
//		userProfile.setPhoneNumber("776415455");
//		
//		
//		
//		user.setUserProfile(userProfile);
//		userProfile.setUser(user);
//		
//		userRepository.save(user);
		
		
		
		
		
		
		
//	}

}
