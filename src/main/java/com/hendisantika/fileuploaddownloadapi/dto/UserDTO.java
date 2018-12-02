package com.hendisantika.fileuploaddownloadapi.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by IntelliJ IDEA.
 * Project : file-upload-download-api
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-03
 * Time: 03:43
 * To change this template use File | Settings | File Templates.
 */
@Data
public class UserDTO {
    private String name;
    private MultipartFile file;
}
