package db;
/**
 * 
 * @author Pallavi Sinha
 * MYSQL database schema :coursedatabase
 * user :coursedatabase_admin
 * pass :Test1234
 * 
 */
public interface MyDB {

	String USER="root";
	String PASS="Shashank1087";
	String CONN_URL="jdbc:mysql://127.0.0.1:3306/cometcab?user=root\"";
	
	
}
/**
CREATE TABLE `customer` (
`userId` char(20) NOT NULL,
`password` char(10) DEFAULT NULL,
`name` char(20) DEFAULT NULL
)


jdbc:mysql://127.0.0.1:3306/coursedatabase?user=coursedatabase_admin

*/
