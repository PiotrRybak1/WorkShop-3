package pl.coderslab.users;

import pl.coderslab.model.User;
import pl.coderslab.model.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/edit")
public class EditUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        request.setAttribute("id", request.getParameter("id"));
        getServletContext().getRequestDispatcher("/users/editUser.jsp").forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        User user = new User(Integer.parseInt(request.getParameter("id")), request.getParameter("email"), request.getParameter("userName"), request.getParameter("password"));
        UserDao userDao = new UserDao();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            userDao.update(user);
            response.sendRedirect("/user/list");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
