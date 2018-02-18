package com.biz.dao;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.biz.dao.entity.BookEntity;

/**
 * 
 * @author Nagendra
 * @Since 12-02-2018
 * mdkdkdk
 * 
 * dkdk
 * 
 *
 */
@Repository("BizDao")
public class BizDao  implements IBizDao{
	
	private DataSource dataSource;
	
	@Autowired
	@Qualifier("mjdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void initialize() {
		 Connection con = null;
	      Statement stmt = null;
	      int result = 0;
		try {
	         con = dataSource.getConnection();
	         stmt = con.createStatement();
	         result = stmt.executeUpdate("CREATE TABLE tutorials_tbl ( id INT NOT NULL, title VARCHAR(50) NOT NULL,  author VARCHAR(20) NOT NULL, submission_date DATE, PRIMARY KEY (id))");
	         System.out.println(stmt.toString());
		}  catch (Exception e) {
	         e.printStackTrace(System.out);
	      }
	}

	/**
	 * @return the dataSource
	 */
	public DataSource getDataSource() {
		return dataSource;
	}

	/**
	 * @param dataSource the dataSource to set
	 */
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public String addBook(BookEntity	 book){
		//connection
		//who is setting the value inside the query
		//who is creating statement here 
		//who is firing the query 
		//who is doing exception handling 
		//who is doing transaction management 
		// who is iterating the result set
		//who is converting the result data into java object
		//What we are doing here?
		//writing the query and preparing the data
		String sql="insert into book_tbl(name,author,publication,price,doe) values(?,?,?,?,?)";
		Object[] data=new Object[]{book.getName(),book.getAuthor(),book.getPublication(),book.getPrice(),new Timestamp(new Date().getTime())};
		jdbcTemplate.update(sql,data);
		System.out.println("This is addBook method............");
		System.out.println(book);
		return "success";
	}
	
	@Override
	public String updateBook(BookEntity	 book){
		//connection
		//who is setting the value inside the query
		//who is creating statement here 
		//who is firing the query 
		//who is doing exception handling 
		//who is doing transaction management 
		// who is iterating the result set
		//who is converting the result data into java object
		//What we are doing here?
		//writing the query and preparing the data
		String sql="update book_tbl set name=?,author=?,publication=?,price=? where bid=?";
		Object[] data=new Object[]{book.getName(),book.getAuthor(),book.getPublication(),book.getPrice(),book.getBid()};
		jdbcTemplate.update(sql,data);
		System.out.println("This is updateBook method............");
		System.out.println(book);
		return "success";
	}
	
	
	
	@Override
	public BookEntity findBookByBid(int bid){
		//writing the query and preparing the data
		String sql="select bid,name,author,publication,price,doe from  book_tbl where bid="+bid;
		BookEntity book=(BookEntity)jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper(BookEntity.class));
		return book;
	}
	
	@Override
	public List<BookEntity> findBooks(){
		//writing the query and preparing the data
		String sql="select bid,name,author,publication,price,doe from  book_tbl";
		List<BookEntity> books=jdbcTemplate.query(sql,new BeanPropertyRowMapper(BookEntity.class));
		return books;
	}
	
	@Override
	public String deleteBookByBid(int bid){
		//writing the query and preparing the data
		String sql="delete  from  book_tbl where bid  = "+bid;
		int rows=jdbcTemplate.update(sql);
		return rows>0 ? "success":"notdelete";
	}

}
