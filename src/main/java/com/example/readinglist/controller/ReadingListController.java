package com.example.readinglist.controller;

import com.example.readinglist.entity.Book;
import com.example.readinglist.repo.ReadingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author piaozhikang
 * Created on 2019/2/17.
 */
@Controller
@RequestMapping("/")
public class ReadingListController {

    private ReadingListRepository repository;

    @Autowired
    public ReadingListController(ReadingListRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "/{reader}", method = RequestMethod.GET)
    public String readersBooks(
            @PathVariable("reader") String reader,
            Model model
    ) {
        List<Book> readingList = repository.findByReader(reader);
        if (readingList != null) {
            model.addAttribute("books", readingList);
        }
        return "readingList";
    }


    @RequestMapping(value = "/{reader}", method = RequestMethod.POST)
    public String addBookToReadingList(
            @PathVariable("reader") String reader,
            Book book
    ) {
        book.setReader(reader);
        repository.save(book);
        return "redirect:/{reader}";
    }
}
