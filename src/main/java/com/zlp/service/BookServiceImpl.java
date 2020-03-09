package com.zlp.service;

import com.zlp.dao.BookMapper;
import com.zlp.pojo.Books;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-03-09 0:02
 * Description:张立朋，写点注释吧!!
 */
public class BookServiceImpl implements BookService {

    //调用dao层的操作，设置一个set接口，方便spring管理
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper){
        this.bookMapper = bookMapper;
    }

    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookId(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBooks();
    }
}
