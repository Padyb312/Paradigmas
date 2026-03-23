package co.edu.poli.contexto4.servicios;

import co.edu.poli.contexto4.modelo.Traje;

public interface OperacionCRUD {

	public String crear(Traje objeto);

	public Traje leeruno(String numero_traje);

	public Traje[] leerTodos();

	public String modificar(String numero_traje, Traje objeto);
	
	public Traje eliminar(String numero_traje);
}
