package net.friend.controller;

import java.util.ArrayList;
import java.util.List;
import net.friend.model.Book;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

  @RequestMapping("/api/book")
  public List<Book> getBook(){
    List<Book> books = new ArrayList<>();
    books.add(new Book("Đường dẫn đến khung thành", "Kim đồng"));
    books.add(new Book("Bảy viên ngọc rồng", "Kim đồng"));

    return books;
  }

  @PostMapping("/api/book")
  public Book save(@RequestParam String name, @RequestParam String publisher){
    return new Book(name, publisher);
  }

  @PutMapping("/api/book")
  public Book saveJson(@RequestBody Book book){
    book.setName(book.getName().toUpperCase());
    book.setPublisher(book.getPublisher().toUpperCase());
    return book;
  }

  @RequestMapping("/api/book/{name}")
  public Book findByName(@PathVariable String name){
    return new Book(name, "default");
  }

  @RequestMapping("/api/book-list")
  public String getList(@RequestParam List<Integer> numbers){
    return numbers.toString();
  }
}
