package dao;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dto.registerdto;

public class registerdao {

	private static Connection getConnection() throws  URISyntaxException, SQLException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		 URI dbUri = new URI(System.getenv("DATABASE_URL"));
		 
		 String username = dbUri.getUserInfo().split(":")[0];
		    String password = dbUri.getUserInfo().split(":")[1];
		    String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();

		    return DriverManager.getConnection(dbUrl, username, password);
	}
	
	@SuppressWarnings("rawtypes")
	public static int registerbook(registerdto book) {
		String sql = "INSERT INTO book VALUES( default ,?, ?, ?, ?, ?) ";
		int result = 0;
		
		try(
				Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				){
			pstmt.setString(1, book.getName());
			pstmt.setString(2, book.getWriter());
			pstmt.setString(3, book.getPub());
			pstmt.setInt(4, book.getIsbn());
			pstmt.setInt(5, book.getLogin_id());

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} finally {
			System.out.println(result + "件更新しました。");
		}
		return result;
	}
}