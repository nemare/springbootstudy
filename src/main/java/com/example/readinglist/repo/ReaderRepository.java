package com.example.readinglist.repo;

import com.example.readinglist.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author piaozhikang
 * Created on 2019/2/18.
 */
public interface ReaderRepository extends JpaRepository<Reader, String> {
}
