package src;

import java.sql.*;

public class Sql implements ISql{

    public void Select(Statement stmt) {
        try {
            ResultSet rs = stmt.executeQuery("select * from dmihfclosdev.mstCRIFHighMarkConfig order by crifConfigID desc limit 10");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)+" "+rs.getString(4)+ " "+rs.getBoolean(5)+" "+rs.getBoolean(6)+" "+rs.getDate(7));
        }catch(Exception e){System.out.println(e);}
    }

    public void Insert(Statement stmt){
        try {
            stmt.executeUpdate("INSERT INTO dmihfclosdev.mstCRIFHighMarkConfig VALUES ('241','Kind of Business', 'Asset Reconstruction Company', 'ARC',1,1,now())");
            stmt.executeUpdate("INSERT INTO dmihfclosdev.mstCRIFHighMarkConfig VALUES ('242','Kind of Business', 'Other Financial Institutions', 'OFI',1,1,now())");
            stmt.executeUpdate("INSERT INTO dmihfclosdev.mstCRIFHighMarkConfig VALUES ('243','Kind of Business', 'National Housing Bank', 'NHB',1,1,now())");
            stmt.executeUpdate("INSERT INTO dmihfclosdev.mstCRIFHighMarkConfig VALUES ('244','Kind of Business', 'Direct To Consumer', 'DTC',1,1,now())");
            stmt.executeUpdate("INSERT INTO dmihfclosdev.mstCRIFHighMarkConfig VALUES ('245','Kind of Business', 'Small Finance Bank', 'SFB',1,1,now())");
        }catch(Exception e){System.out.println(e);}
    }
    public static void Update(Statement stmt){
        try {
            stmt.executeUpdate("UPDATE dmihfclosdev.mstCRIFHighMarkConfig SET configValue = 'SFC' WHERE crifConfigID in (240)");
        }catch(Exception e){System.out.println(e);}
    }
    public static void Alter(Statement stmt){
        try {
            stmt.executeUpdate("ALTER TABLE dmihfclosdev.emp ADD COLUMN courses VARCHAR(50);");
        }catch(Exception e){System.out.println(e);}
    }
    public static void Delete(Statement stmt){
        try {
            stmt.executeUpdate("DELETE FROM dmihfclosdev.mstCRIFHighMarkConfig WHERE crifConfigID = 3");
        }catch(Exception e){System.out.println(e);}

    }

}
