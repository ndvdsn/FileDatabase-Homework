package com.codeclan.example.fileservice;

import com.codeclan.example.fileservice.models.File;
import com.codeclan.example.fileservice.models.Folder;
import com.codeclan.example.fileservice.models.User;
import com.codeclan.example.fileservice.repositories.FileRepository;
import com.codeclan.example.fileservice.repositories.FolderRepository;
import com.codeclan.example.fileservice.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileserviceApplicationTests {


	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;



	@Test
	public void contextLoads() {
	}

	@Test
	public void createUserAndFolderThenSave() {

		User clarice = new User();
		userRepository.save(clarice);
		Folder folder = new Folder("Thot", clarice);
		folderRepository.save(folder);
	}

	@Test
	public void createUserFolderAndFileAndSave() {

		User button = new User();
		userRepository.save(button);

		Folder hinge = new Folder("Hinge", button);
		folderRepository.save(hinge);

		File grapes = new File("this", ".fffft", 89.54, hinge);
		fileRepository.save(grapes);
	}
}
