package pl.coderslab.users;

import pl.coderslab.model.User;
import pl.coderslab.model.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/add")
public class AddUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        getServletContext().getRequestDispatcher("/users/addUser.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        User user = new User(request.getParameter("email"), request.getParameter("userName"), request.getParameter("password"));
        UserDao userDao = new UserDao();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            userDao.create(user);
            response.sendRedirect("/user/list");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        }
}
