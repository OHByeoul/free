package com.anything.free.controller;

import com.anything.free.dto.FileDTO;
import com.anything.free.service.FileService;
import com.anything.free.util.MD5maker;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

@Controller
public class FileController {
    private final FileService fileService;

    public FileController(FileService fileService) {
        this.fileService = fileService;
    }

    @PostMapping("/file/insertFile")
    public String insertFile(@RequestParam("file")MultipartFile file) throws IOException, NoSuchAlgorithmException {

        try {
            String originFileName = file.getOriginalFilename();
            String fileName = new MD5maker(originFileName).toString();

            String savePath = System.getProperty("user.dir") + "\\files";

            if (!new File(savePath).exists()) {
                try {
                    new File(savePath).mkdir();
                } catch (Exception e) {
                    e.getStackTrace();
                }
            }
            String filePath = savePath + "\\" + fileName;
            file.transferTo(new File(filePath));

            FileDTO fileDTO = new FileDTO();
            fileDTO.setOriginFileName(originFileName);
            fileDTO.setFileName(fileName);
            fileDTO.setFilePath(filePath);

            Long fileId = fileService.saveFile(fileDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/";
    }
}
