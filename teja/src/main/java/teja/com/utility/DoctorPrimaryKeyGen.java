package teja.com.utility;

import java.io.Serializable;
import java.sql.*;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class DoctorPrimaryKeyGen implements IdentifierGenerator{

    @Override
    public Serializable generate(SessionImplementor session, Object object)
            throws HibernateException {

       
        java.sql.Connection connection = session.connection();

        try {
            java.sql.Statement statement=connection.createStatement();

            ResultSet rs=statement.executeQuery("select count(dId) from doctor");

            if(rs.next())
            {
                String id="Doc"+(rs.getInt(1)+1);
               
                return id;
            }
        } catch (SQLException e) {           
            e.printStackTrace();
        }


        return null;
    }

}

