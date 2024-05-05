package ee.test.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ThirdServlet", urlPatterns ="/third_servlet" )
public class ThirdServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(ThirdServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Third servlet");
        int sum = Integer.parseInt(req.getParameter("a")) + Integer.parseInt(req.getParameter("b"));
        resp.setContentType("text/html");
        resp.getWriter().printf("<html><body><h1>"+sum+"</h1></body><html>");
    }

    @Override
    public void init() throws ServletException {
        logger.debug("Init");
    }
}
