package co.g2academy.jdbc.dao;
import co.g2academy.jdbc.entity.Person;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PersonDaoJdbc {
    private Connection connection;
    private PreparedStatement insertStatement;
    private PreparedStatement updateStatement;
    private PreparedStatement deleteStatement;
    private PreparedStatement getByIdStatement;
    private PreparedStatement getAllStatement; //1

    private String insertQuery = "insert into T_PERSON(name, password) values (?, ?)";
    private String updateQuery = "update T_PERSON set name = ?, password = ? where id = ?";
    private String deleteQuery = "delete from T_PERSON where id = ?";
    private String getByIdQuery = "select name, password from T_PERSON where id = ?";
    private String getAllQuery = "select id, name, password from T_PERSON"; //2

    public void setConnection(Connection connection) throws SQLException {
        this.connection = connection;
        insertStatement = this.connection.prepareStatement(insertQuery,
                Statement.RETURN_GENERATED_KEYS);
        updateStatement = this.connection.prepareStatement(updateQuery);
        deleteStatement = this.connection.prepareStatement(deleteQuery);
        getByIdStatement = this.connection.prepareStatement(getByIdQuery);
        getAllStatement = this.connection.prepareStatement(getAllQuery); //3
    }

    public Person save(Person p) throws SQLException { //4, untuk menyimpan
        if(p.getId() == null){ //artinya belum ada id / belum disimpan di database
            insertStatement.setString(1, p.getName());
            insertStatement.setString(2, p.getPassword());
            int id = insertStatement.executeUpdate();
            p.setId(id);
        } else { //kalau id tidak null, maka yg dilakukan update id
            updateStatement.setString(1, p.getName());
            updateStatement.setString(2, p.getPassword());
            updateStatement.setInt(3, p.getId());
            updateStatement.executeUpdate();
        }
        return p;
    }
    public Person delete(Person p) throws SQLException { //5
        deleteStatement.setInt(1, p.getId());
        deleteStatement.executeUpdate();
        return p;
    }
    public Person getById(Integer id)throws SQLException { //6
        getByIdStatement.setInt(1, id);
        ResultSet rs = getAllStatement.executeQuery();
        if(rs.next()) {
            return getPersonFromResultSet(rs);
        }
        return null;
    }
    public List<Person> getAll() throws SQLException { //7 ambil semua data dari tabel person
        ResultSet rs = getAllStatement.executeQuery();
        List<Person> persons = new ArrayList<>();
        while(rs.next()){ //next() baca terus
            persons.add(getPersonFromResultSet(rs));
        }
        return persons;
    }
    private Person getPersonFromResultSet(ResultSet rs) throws SQLException{ //ResultSet digunakan untuk
        // menampung hasil dari query, methodnya next()
        Person p = new Person();
        p.setId(rs.getInt("id"));
        p.setName(rs.getString("name"));
        p.setPassword(rs.getString("password"));
        return p;
    }

}

