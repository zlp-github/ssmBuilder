package com.zlp.service;

import com.zlp.pojo.Books;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-03-09 0:00
 * Description:张立朋，写点注释吧!!
 */
public interface BookService {
    //增加一个Book
    int addBook(Books book);
    //根据id删除一个Book
    int deleteBookById(int id);
    //更新Book
    int updateBook(Books books);
    //根据id查询,返回一个Book
    Books queryBookById(int id);
    //查询全部Book,返回list集合
    List<Books> queryAllBook();
}
