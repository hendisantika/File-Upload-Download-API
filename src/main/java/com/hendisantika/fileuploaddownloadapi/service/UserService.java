package com.hendisantika.fileuploaddownloadapi.service;

import com.hendisantika.fileuploaddownloadapi.model.User;
import com.hendisantika.fileuploaddownloadapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project : file-upload-download-api
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-03
 * Time: 03:45
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveUser(String username, String filePath) {
        String fileId = UUID.randomUUID().toString();
        userRepository.save(new User(username, filePath, fileId.split("-")[0]));
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public String getSaveFilePathByUser(int id) {
        return userRepository.findOne(id).getFileStoredPath();
    }
}