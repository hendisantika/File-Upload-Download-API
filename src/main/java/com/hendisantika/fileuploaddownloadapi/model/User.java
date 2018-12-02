package com.hendisantika.fileuploaddownloadapi.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by IntelliJ IDEA.
 * Project : file-upload-download-api
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-03
 * Time: 03:38
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String fileStoredPath;
    private String fileID;

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    public User(String name, String fileStoredPath, String fileID) {
        super();
        this.name = name;
        this.fileStoredPath = fileStoredPath;
        this.fileID = fileID;
    }
}
