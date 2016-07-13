package bookcase.controller;

import bookcase.dao.BookDao;
import bookcase.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Administrator
 * Created by tbpwang
 * 2016/7/13.
 */
@Controller
@RequestMapping("book")
public class BookController extends BaseController {
    @Autowired
    private BookDao bookDao;

    @RequestMapping("create")
    public String create(Book book){
        bookDao.create(book);
        return "redirect:/book/queryAll";
    }

    @RequestMapping("update")
    public String update(Book book){
        bookDao.update(book);
        return "redirect:/book/queryAll";
    }

    @RequestMapping("remove/{id}")
    public String remove(@PathVariable int id){
        bookDao.remove(id);
        return "redirect:/book/queryAll";
    }

    @RequestMapping("queryOne/{id}")
    public String queryOne(@PathVariable int id){
        session.setAttribute("book", bookDao.queryOne(id));
        return "redirect:/edit.jsp";
    }
    @RequestMapping("queryAll")
    public String queryAll(){
        session.setAttribute("books", bookDao.queryAll());
        return "redirect:/home.jsp";
    }
}
