package com.hsbc.empleado;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.registro.dao.ClienteDao;
import com.hsbc.registro.model.Cliente;



@WebServlet("/registro")
public class RegistroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ClienteDao clienteDao = new ClienteDao();
       
    public RegistroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(":::: Entro a metodo get");
		
		String accion = request.getParameter("accion");
		
		if(accion != null) {
			
			System.out.println(":::: " + accion);
			
		}else {
			
			List<Cliente> clientes = clienteDao.getAllClientes();
			mostrarListaEstudiantes(request, response, clientes);
			
			
		}
	
	}

	private void mostrarListaEstudiantes(HttpServletRequest request, HttpServletResponse response,
			List<Cliente> clientes) throws ServletException, IOException {
		
		for (Cliente cliente : clientes) {
			System.out.println("::: " + cliente);
		}
		
		String paginaJsp = "/adminClientes.jsp";	
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(paginaJsp);
		request.setAttribute("clientes", clientes);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(":::: Entro a metodo POST ::::");
		
		String nombre = request.getParameter("nombre");
		String apPaterno = request.getParameter("ApPaterno");
		
		Cliente cliente = new Cliente();
		cliente.setNombre(nombre);
		cliente.setApellidoPaterno(apPaterno);
		
		clienteDao.addCliente(cliente);
		
		
		
		String paginaJsp = "/adminClientesDos.jsp";
		List<Cliente> clientes = clienteDao.getAllClientes();
		mostrarListaEstudiantes(request, response, clientes);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(paginaJsp);
		request.setAttribute("clientes", clientes);
		dispatcher.forward(request, response);

	}

}
