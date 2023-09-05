package main;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.TbTipo;
import model.TbUsuario;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============PRUEBA EN JPA============");
		
        System.out.println("Listar a tabla usuario");
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("JPA_clase01x");
		
		EntityManager em = fabrica.createEntityManager();
		
		/*List<TbUsuario> lstUsuarios = em.createQuery("select a from TbUsuario a",TbUsuario.class).getResultList();
		System.out.println("==================================================");
		
		//Mostrar Cantidad de usuarios
		System.out.println("nro de usuarios: "+lstUsuarios.size());
		System.out.println("==================================================");*/
		
		//Listar todos los usuarios
		/*System.out.println("Lista de usuarios:");
		System.out.println("------------------");
		for(TbUsuario u: lstUsuarios){
			System.out.println("usuario:"+u.getNomUsua()+ ", " + u.getApeUsua()+ ", "+ u.getUsrUsua()+", "+u.getClaUsua()+", "+u.getFnaUsua()+", "+u.getTbTipo().getDescripcion()+", "+u.getEstUsua());
		}
		System.out.println("==================");*/
		
		//Busqueda de usuario con id=2
		/*System.out.println("Buscar usuario con id=2");
		System.out.println("-----------------------");
		TbUsuario us = em.find(TbUsuario.class, 2);
		System.out.println(us);
		System.out.println(us.getCodUsua());
		System.out.println(us.getNomUsua());
		System.out.println(us.getApeUsua());
		System.out.println("========================");*/
		
		//Insertar nuevo usuario
		System.out.println("Insertar nuevo usuario:");
		System.out.println("-------------------------");
				
		em.getTransaction().begin();
	    TbUsuario usuario = new TbUsuario();
	    Date fecha = new Date();
	    TbTipo tipo = em.find(TbTipo.class, 2);//Tipo: cliente
	    usuario.setCodUsua(6);
	    usuario.setNomUsua("Pepe");
	    usuario.setApeUsua("Perez");
	    usuario.setUsrUsua("pepeperez");
	    usuario.setClaUsua("123456");
	    usuario.setFnaUsua(fecha);
	    usuario.setTbTipo(tipo);
	    usuario.setEstUsua(1);
	    em.persist(usuario);
	    em.getTransaction().commit();
	    System.out.println("====================================");
	    
	    
	    
	    //Actualizar usuario
	    /*System.out.println("Actualizamos usuario con id=6 y actualizar");
	    System.out.println("--------------------------------------------");
	    em.getTransaction().begin();
	    TbUsuario usuarioActualizar = em.find(TbUsuario.class, 6);
	    usuarioActualizar.setClaUsua("100001");
	    em.persist(usuarioActualizar);
	    em.getTransaction().commit();
	    System.out.println("====================================");*/
	    
	    
	    //Eliminar usuario
	    /*System.out.println("Eliminar usuario con id=6");
	    System.out.println("----------------------------");
	    em.getTransaction().begin();
	    TbUsuario usuarioEliminar = em.find(TbUsuario.class, 6);
	    em.remove(usuarioEliminar);
	    em.getTransaction().commit();
	    System.out.println("===================================");
	    //Cerrando la conexion de la base de datos
	    fabrica.close();
	    em.close();*/

	}

}
