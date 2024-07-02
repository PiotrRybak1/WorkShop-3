package pl.coderslab.model;

import org.mindrot.jbcrypt.BCrypt;
import pl.coderslab.utils.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class UserDao {
    private static final String CREATE_USER_QUERY = "INSERT INTO users( email,username, password) VALUES (?, ?, ?)" ;
    private static final String READ_USER = "select id,email,username, password from users where id = ?" ;
    private static final String UPDATE_USER = "update users set email = ?,username = ?,password = ?where id= ?" ;
    private static final String FIND_ALL = "select * from users" ;

    private static final String DELETE_USER = "delete from users where id = ?" ;


    public User create(User user) {

        try (Connection conn = DbUtil.connect();//getConnection();
             PreparedStatement preStat = conn.prepareStatement(CREATE_USER_QUERY, PreparedStatement.RETURN_GENERATED_KEYS)) {
            preStat.setString(1, user.getEmail());
            preStat.setString(2, user.getUserName());
            preStat.setString(3, BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()));
            preStat.executeUpdate();
            ResultSet rs = preStat.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                user.setId(id);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return user;

    }

    public User read(int userID) {
        User user = new User();
        try (Connection conn = DbUtil.connect();//getConnection();
             PreparedStatement preStat = conn.prepareStatement(READ_USER)) {
            preStat.setInt(1, userID);
            ResultSet rs = preStat.executeQuery();
            while (rs.next()) {
                user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return user;
    }

    public void update(User user) {
        try (Connection conn = DbUtil.connect();//getConnection();
             PreparedStatement preStat = conn.prepareStatement(UPDATE_USER)) {
            preStat.setString(1, user.getEmail());
            preStat.setString(2, user.getUserName());
            preStat.setString(3, BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()));
            preStat.setInt(4, user.getId());
            int counter = preStat.executeUpdate();
            System.out.println("Update values  = " + counter);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void delete(int userId) {
        try (Connection conn = DbUtil.connect();//getConnection();
             PreparedStatement statement = conn.prepareStatement(DELETE_USER)) {
            statement.setInt(1, userId);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private User[] addToArray(User u, User[] users) {
        User[] tmpUsers = Arrays.copyOf(users, users.length + 1);
        tmpUsers[users.length] = u;
        return tmpUsers;
    }

    public User[] findAll() {

        User[] resultTab = new User[0];
        try (Connection conn = DbUtil.connect();//getConnection();
             PreparedStatement statement = conn.prepareStatement(FIND_ALL)) {
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                resultTab = addToArray(new User(set.getInt(1), set.getString(2), set.getString(3), set.getString(4)), resultTab);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultTab;


    }

}
