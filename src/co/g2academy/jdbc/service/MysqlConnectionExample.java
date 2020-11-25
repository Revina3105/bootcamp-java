package co.g2academy.jdbc.service;

import java.sql.*;

public class MysqlConnectionExample {
    public static void main(String[] args) {
        try {
            //1.load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2. Create database connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabootcamp", "root", "Revina310596");
            //3. Create statement
            Statement statement = connection.createStatement();
            //4. Execute query to get data from database
            ResultSet rs = statement.executeQuery("select * from student");
            //5. Iterate
            while (rs.next()){
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                Integer age = rs.getInt("age");
                String phoneNumber = rs.getString("phone_number");
                System.out.println(id + " " + name + " " + age + " " + phoneNumber);
            }
            //6. Update data
            statement.executeUpdate("update student set age = 17, name='vina dwi' where id = 1");

            //7. Delete data
            statement.executeUpdate("delete from student where id = 1");//wajib ada where

            //8. Insert data (row) - Create (using statement)
            statement.executeUpdate("insert into student values(13, 'Utami', 22, '09222')");


            // ==== Prepared Statement ==== (safety)
            String insertQuery = "insert into student(id, name, age, phone_number) values(?, ?, ?, ?)";
            PreparedStatement psInsert = connection.prepareStatement(insertQuery);
            String updateQuery = "update student set name = ?, age = ?, phone_number = ? where id = ?"; //wajib ada where
            PreparedStatement psUpdate= connection.prepareStatement(updateQuery);

            //insert
            psInsert.setInt(1, 15); //baris ke 15
            psInsert.setString(2, "Revina");
            psInsert.setInt(3, 18);
            psInsert.setString(4, "08888883");
            psInsert.executeUpdate();

            //Update
            psUpdate.setString(1, "Updated name");
            psUpdate.setInt(2, 18 );
            psUpdate.setString(3, "0999999");
            psUpdate.setInt(4, 1); //update student where id = 1
            psUpdate.executeUpdate();


            // ===Batch execution and transaction===
            //Baris 58-66 atomic transaction, jika 1 gagal, semuanya gagal
            connection.setAutoCommit(false);
            for(int i = 20; i < 100; i++) { //input 100 data ke tabel student
                //insert
                psInsert.setInt(1, i);
                psInsert.setString(2, "Student" + i);
                psInsert.setInt(3, 17);
                psInsert.setString(4, "08888823" +i);
                psInsert.addBatch();
            }
            psInsert.executeBatch();
            connection.commit();
            connection.setAutoCommit(true);

            //9. Close all resource once it is being used
            //bad example, need to be in finally statement
            rs.close();
            statement.close();
            connection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}