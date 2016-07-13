package bookcase.dao.impl;

import bookcase.dao.BookDao;
import bookcase.model.Book;
import org.springframework.stereotype.Repository;

/**
 * Administrator
 * Created by tbpwang
 * 2016/7/13.
 */
@Repository
public class BookDaoImpl extends GenericDaoImpl<Book> implements BookDao {
}
