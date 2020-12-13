package com.anything.free.service;

import com.anything.free.dao.FileDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class FileService {
    @Autowired
    private FileDAO fileDAO;

    public int insertFile(HashMap params) {
        return fileDAO.insertFile(params);
    }
}
