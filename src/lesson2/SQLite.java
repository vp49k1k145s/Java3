package lesson2;

import java.sql.*;

public class SQLite {

    static Connection conn = null;
    private static Statement stmt;
    private static PreparedStatement ps;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        connect();
        createTable();
        insertTable();
        updateTable();
        selectTable();
        deleteTable();
        dropTable();
        disconnect();


    }

    static void createTable() {
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(" CREATE TABLE students (" +
                    " id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    " name TEXT," +
                    " score TEXT) ");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void insertTable() {
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate("INSERT INTO students (name, score) VALUES ('Bob1', 10);");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void updateTable() {
        try (PreparedStatement ps = conn.prepareStatement(
                "UPDATE students set name = 'Vasya' where name like 'Bob1'")) {
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void selectTable() {
        try (PreparedStatement ps = conn.prepareStatement(
                "select from * students where name = 'Vasya'")) {
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void deleteTable() {
        try (PreparedStatement ps = conn.prepareStatement(
                "delete from students where name = 'Vasya'")) {
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void dropTable() {
        try (PreparedStatement ps = conn.prepareStatement(
                "DROP TABLE IF EXISTS students")) {
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:main.db");
        stmt = conn.createStatement();
    }

    private static void disconnect() {
        try {
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
