package template;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

public class DBConnectionPool {

/* 커넥션 풀을 구성하는 요소 */
	
// 1 커넥션 담을 자료구조 (여기서는 ArrayList 사용)
// 2 매개변수 있는 생성자(setter 대신) (db 연결에 필요한 기본 자료형 저장)
// 3 getConnection 메서드
// 4 자료구조에 커넥션 추가하는 메서드	(addConnection)
// 5 closeConnection 필요.
	
	// 필드
	String url;
	String username;
	String password;
	
	// 싱글턴 패턴으로 바꾸고 싶으면 final 추가.
	ArrayList<Connection> connList = new ArrayList<Connection>();
	
	// 생성자 
	public DBConnectionPool(String driver, String url, String username, String password) throws Exception{
		this.url= url;
		this.username=username;
		this.password=password;
		
		Class.forName(driver);

	}
	
	// getConnection
	public Connection getConnection() throws Exception{
		if(connList.size() >0){
			Connection conn = connList.get(0);
		if(conn.isValid(10)){
			return conn;
		}
		
	} // 커넥션을 리턴해줌.
		return DriverManager.getConnection(url, username, password);
	}
	
	// 자료구조에 커넥션을 추가함.
	public void addConnection(Connection conn) throws Exception{
		connList.add(conn);
	}
	
	// close 커넥션
	public void closeAll(){
		for(Connection conn : connList){
			try{conn.close();} catch(Exception e){}
		}
	}
	
}
