package pl.coderslab.users;

import pl.coderslab.model.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/delete")
public class RemoveUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        UserDao userDao = new UserDao();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            userDao.delete(Integer.parseInt(request.getParameter("id")));
            response.sendRedirect("/user/list");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
