import java.sql.*;

public class test {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.56.1:61115;database=Library;user=ek;password=123456";
        try{

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();

            String sql = "SELECT * FROM Author";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getString("authName")+" " +rs.getString("authCode"));
            }
        }
        catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
}
