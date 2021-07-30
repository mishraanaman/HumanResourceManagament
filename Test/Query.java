package Test;

import java.sql.*;
import src.ISql;

public class Query {




        public static void main(String args[]){

            try{
                Connection con= DriverManager.getConnection(
                        "jdbc:mysql://hfc-mysql-db.cslkkh26v8pd.ap-south-1.rds.amazonaws.com:3306/dmicommondev?autoReconnect=true&useSSL=false","hfcdev","ei37$#%1BI08e");

                System.out.println("Connected database successfully...");

                Statement stmt=con.createStatement();

//              src.Sql.Update(stmt);
//                ISql.Insert(stmt);
//                ISql.Select(stmt);

                con.close();
            }catch(Exception e){System.out.println(e); }
        }
        }


