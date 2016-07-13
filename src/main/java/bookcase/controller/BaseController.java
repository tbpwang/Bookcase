package bookcase.controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Administrator
 * Created by tbpwang
 * 2016/7/13.
 */
public class BaseController {
    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected HttpSession session;
    protected ServletContext application;

    @ModelAttribute
    private void set(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        session = request.getSession();
        application = request.getServletContext();
    }
}
