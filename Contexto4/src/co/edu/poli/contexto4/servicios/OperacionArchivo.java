package co.edu.poli.contexto4.servicios;

import co.edu.poli.contexto4.modelo.Traje;

public interface OperacionArchivo {
	
	public String serializar(Traje[] Trajes, String path, String name);

	public Traje[] deserializar(String path, String name);
}
