package ee.test.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SecondServlet", urlPatterns ="/second_servlet" )
public class SecondServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(SecondServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Secod servlet");
        resp.setContentType("text/html");
        resp.getWriter().printf("<html><body><h1>Second servlet</h1></body><html>");
    }

    @Override
    public void init() throws ServletException {
        logger.debug("Init");
    }
}
