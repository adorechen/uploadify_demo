package com.my.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Description: To do
 * <p>
 * Author : Adore Chen
 * Created: 2018-08-23
 */
@Controller
public class FileUploadController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    // save uploaded file to this folder
    private String uploadDir = System.getProperty("user.home") + "/upload/";

    public FileUploadController(){
        File dir = new File(uploadDir);
        if(!dir.exists()){
            dir.mkdirs();
        }
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(@RequestParam("file_upload") MultipartFile file, ModelMap modelMap) {
        modelMap.addAttribute("image", file);

        // Save file on system
        if (!file.isEmpty()) {
            try{
                Path path = Paths.get(uploadDir + file.getOriginalFilename());
                Files.write(path, file.getBytes());
                logger.info("write file to: {}", path);
            }catch (Exception e){
                logger.error("upload file error", e);
            }
        }

        return "searchResult";
    }

}
