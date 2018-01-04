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

            ResultSet rs=statement.executeQuery("select dId from doctor order by dId desc limit 1");

            if(rs.next())
            {
                String s=rs.getString(1);
                String id=s.substring(3,s.length());
                int did=Integer.parseInt(id);
               
                return "doc"+(did+1);
            }
            else
            	return "doc1";
        } catch (SQLException e) {           
            e.printStackTrace();
        }


        return null;
    }

}

