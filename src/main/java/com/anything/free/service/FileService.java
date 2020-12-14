package com.anything.free.service;

import com.anything.free.dto.FileDTO;
import com.anything.free.repository.FileReopsitory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FileService {
    private final FileReopsitory fileReopsitory;

    public FileService(FileReopsitory fileReopsitory) {
        this.fileReopsitory = fileReopsitory;
    }

    @Transactional
    public Long saveFile(FileDTO fileDTO){
        return fileReopsitory.save(fileDTO.toEntity()).getId();
    }
}
