package co.edu.poli.contexto4.servicios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import co.edu.poli.contexto4.modelo.Traje;

public class ImplementacionOperacionCRUD implements OperacionCRUD ,OperacionArchivo {

	private Traje[] trajes = new Traje[2];
	private int contador = 0;

	@Override
	//crear_arreglo_de_trajes
	public String crear(Traje objeto) {

		if (contador == trajes.length) {

			Traje[] newTrajes = new Traje[trajes.length * 2];
			for (int i = 0; i < trajes.length; i++) {
				newTrajes[i] = trajes[i];
			}
			trajes = newTrajes;
		}

		for (int i = 0; i < trajes.length; i++) {
			if (trajes[i] == null) {
				trajes[i] = objeto;
				contador++;
				return "Traje Creado";
			}
		}

		return null;
	}

	@Override
	//retorna_el_traje_buscado
	public Traje leeruno(String numero_traje) {
		
		for (int i = 0; i < trajes.length; i++) {
			
			if (trajes[i] != null && trajes[i].getNumero_traje().equals(numero_traje)) {
			    return trajes[i];
			}
			
		}
		return null;	
	}

	@Override
	//retorna_el_arreglo_de_trajes
	public Traje[] leerTodos() {

		return trajes;
	}

	@Override
	public String modificar(String numero_traje, Traje objeto) {
		if(leeruno(numero_traje)!=null) {
			
			eliminar(numero_traje);
			crear(objeto);
			return "Traje modificado";
			
		}
		
		
		return "Traje no encontrado";
	}

	@Override
	public Traje eliminar(String numero_traje) {
		if(leeruno(numero_traje)!=null) {
			for (int i = 0; i < trajes.length; i++) {
				if (trajes[i] != null && trajes[i].getNumero_traje().equals(numero_traje)) {
				    Traje eliminado = trajes[i];
				    trajes[i] = null;
				    --contador;
				    return eliminado;
				}
				
			}
		}
		return null;
	}
	@Override
    public String serializar(Traje[] Trajes, String path, String name) {
        try {
            FileOutputStream fos = new FileOutputStream(path + name);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Trajes);
            oos.close();
            fos.close();
            return "File create!!";
        } catch (IOException ioe) {
            return "Error file " + ioe.getMessage();
        }
    }

    @Override
    public Traje[] deserializar(String path, String name) {
        Traje[] a = null;
        try {
            FileInputStream fis = new FileInputStream(path + name);
            ObjectInputStream ois = new ObjectInputStream(fis);

            a = (Traje[]) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        } catch (ClassNotFoundException c) {
            System.err.println(c.getMessage());
        }
        return a;
    }

}
