package com.example.readinglist.repo;

import com.example.readinglist.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author piaozhikang
 * Created on 2019/2/17.
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {

    /**
     * findByReader
     *
     * @param reader of book
     * @return java.util.List<com.example.readinglist.entity.Book>
     * @author piaozhikang
     * @date 3:51 PM 2019/2/17
     **/
    List<Book> findByReader(String reader);
}
