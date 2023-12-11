package org.example;

import java.sql.*;

public class Secundary {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/teste";
        String username = "user_teste";
        String password = "usertest123";

        try  {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            String sql = "SELECT * FROM usuario";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String email = resultSet.getString("email");

                // Faça o que precisar com os dados do usuário (imprimir, armazenar, etc.)
                System.out.println("ID: " + id + ", Nome: " + nome + ", Email: " + email);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
