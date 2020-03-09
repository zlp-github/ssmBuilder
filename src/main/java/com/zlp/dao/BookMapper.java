package com.zlp.dao;

import com.zlp.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-03-08 23:50
 * Description:张立朋，写点注释吧!!
 */
public interface BookMapper {

    //增加一个Book
    int addBook(Books book);

    //根据id删除一个Book
    int deleteBookById(@Param("bookId") int id);

    //更新books
    int updateBook(Books books);

    //根据id查询，返回一个Book
    Books queryBookId(@Param("bookId") int id);

    //查询全部Book,返回list集合
    List<Books> queryAllBooks();
}
