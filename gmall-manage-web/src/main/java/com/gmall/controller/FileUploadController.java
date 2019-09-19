package com.gmall.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * @ClassName: FileUploadController
 * @Author: WuXiangShuai
 * @Time: 16:27 2019/8/27.
 * @Description:
 */
public class FileUploadController {

    @RequestMapping(value = "fileUpload",method = RequestMethod.POST)
    public String fileUpload(@RequestParam("file") MultipartFile[] files){
        if(files.length!=0){
            System.out.println("multipartFile = " + files[0].getName()+"|"+files[0].getSize());
        }
        return "https://m.360buyimg.com/babel/jfs/t5137/20/1794970752/352145/d56e4e94/591417dcN4fe5ef33.jpg";
    }

}
