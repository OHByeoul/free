package com.anything.free.repository;

import com.anything.free.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileReopsitory extends JpaRepository<File, Long> {

}
