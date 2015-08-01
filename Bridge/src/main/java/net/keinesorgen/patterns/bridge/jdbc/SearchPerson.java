package net.keinesorgen.patterns.bridge.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 */
public class SearchPerson {

    public String mostImportant(Connection connection) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("select NAME from Person where type=MANAGER");
        statement.setMaxRows(1);
        ResultSet result = statement.executeQuery();
        if (result.next()) {
            return result.getString("NAME");
        } else {
            return null;
        }
    }
}
