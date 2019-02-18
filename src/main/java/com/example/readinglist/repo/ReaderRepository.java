package com.example.readinglist.repo;

import com.example.readinglist.entity.Reader;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

/**
 * @author piaozhikang
 * Created on 2019/2/18.
 */
public interface ReaderRepository extends JpaRepository<Reader, String> {

    Reader findOne(String username);
}
