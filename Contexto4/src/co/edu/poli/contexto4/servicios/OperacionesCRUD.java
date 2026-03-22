package co.edu.poli.contexto4.servicios;

import co.edu.poli.contexto4.modelo.Traje;

public interface OperacionesCRUD {

	public String crear(Traje objeto);

	public Traje leeruno(int indice);

	public Traje[] leertodos();

	public String modificar(int indice, Traje objeto);
	
	public Traje eliminar(int indice);
}
