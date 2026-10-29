package com.example.spring_core_concepts;

//import com.example.spring_core_concepts.DI.constructorInjection.OrderService1;
//import com.example.spring_core_concepts.DI.fieldInjection.OrderService;
//import com.example.spring_core_concepts.DI.setterInjection.OrderService2;
//import com.example.spring_core_concepts.beanScopes.prototype.OrderService3;
//import com.example.spring_core_concepts.circularDependency.A;
//import com.example.spring_core_concepts.circularDependency.B;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ConfigurableApplicationContext;
//
//import java.sql.*;

@SpringBootApplication
public class SpringCoreConceptsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreConceptsApplication.class, args);
//		OrderService3 os = context.getBean(OrderService3.class);
//		os.placeOrder("Mobile");
//		os.placeOrder("Charger");
//		OrderService3 os2 = context.getBean(OrderService3.class);
//		os2.placeOrder("Jeans");

//		B a = context.getBean(B.class);
//		a.methodB();
//		context.close();

//		OrderService os = new OrderService();// NPE

//		mysqlJdbcDemo();
	}

//	public static void mysqlJdbcDemo() throws ClassNotFoundException {
//		//Class.forName("com.mysql.cj.jdbc.Driver");
//		try(
//			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/localdb?user=root&password=");
//			Statement statement = con.createStatement();){
//
//
//			ResultSet rs = statement.executeQuery("select PersonID, LastName, FirstName, Address, City");
//			while(rs.next()){
//				int personId = rs.getInt("PersonID");
//				String firstName = rs.getString("FirstName");
//				System.out.println(personId+ ":"+ firstName);
//			}
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		}
//
//	}

}
