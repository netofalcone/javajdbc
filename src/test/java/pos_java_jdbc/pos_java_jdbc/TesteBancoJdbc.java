package pos_java_jdbc.pos_java_jdbc;

import java.util.List;
import java.util.*;

import javax.swing.plaf.ListUI;

import org.junit.Test;

import conexaojdbc.SingleConnection;
import dao.UserPosDAO;
import model.Userposjava;


public class TesteBancoJdbc{
	
	@Test
	public void initBanco() {
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();
		
		
		userposjava.setId(10L);
		userposjava.setNome("F3");
		userposjava.setEmail("f@gmail.com");
		
		userPosDAO.salvar(userposjava);

}
	@Test
	public void initListar() {		
		UserPosDAO dao = new UserPosDAO();
		try {
			List<Userposjava> list = dao.listar();
			
			 for (Userposjava userposjava : list) {
				System.out.println(userposjava); 
				System.out.println("-------------");
			 				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			}				
		}

	@Test
	public void initBuscar() {
			
		UserPosDAO dao = new UserPosDAO();
		
		try {
			Userposjava userposjava = dao.buscar(2L);
			
			System.out.println(userposjava);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
