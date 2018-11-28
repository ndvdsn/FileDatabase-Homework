package com.codeclan.example.fileservice.components;

import com.codeclan.example.fileservice.models.File;
import com.codeclan.example.fileservice.models.Folder;
import com.codeclan.example.fileservice.models.User;
import com.codeclan.example.fileservice.repositories.FileRepository;
import com.codeclan.example.fileservice.repositories.FolderRepository;
import com.codeclan.example.fileservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {



        User user = new User("Baffy", "Undersoil");
        userRepository.save(user);

        Folder folder = new Folder("This One", user);
        folderRepository.save(folder);

        File file = new File("clams", ".fsh", 8.09, folder);
        fileRepository.save(file);



        user.addFolder(folder);
        userRepository.save(user);

        folder.addFile(file);
        folderRepository.save(folder);


    }































}
