package com.abc.jpaLabs.Main;

import com.abc.jpaLabs.Dao.AuthorDao;
import com.abc.jpaLabs.bean.Author;

public class AuthorMain {
	
	public static void main(String[] args) {
     AuthorDao authorDao = new AuthorDao();
		
      	String result1 = authorDao.createAuthor(new Author(101, "Devi", "Varaprasad", "Ganjikunta", "9898977333"));
		String result2 = authorDao.createAuthor(new Author(102, "pavan", "Kalyan", "Konidela", "78896352410"));
		String result3 = authorDao.createAuthor(new Author(103, "Chandra", "Sekhar", "Shaik", "9587453210"));
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
//		String resultDelete = authorDao.deleteAuthor(103);
//		System.out.println(resultDelete);
		
		//String resultUpdate = authorDao.updateAuthor(101, "Devi", "Varaprasad", "Azad", "7770001233");
		//System.out.println(resultUpdate);
	}

}
