package com.earroyoron.kdb.services;

import java.util.Set;

import com.earroyoron.kdb.model.Conocimiento;

public interface ConocimientosService {

	// TODO implementar interfaz el interfaz usara el DAO para guardar el objeto
	
	  Conocimiento saveConocimiento(Conocimiento con);  
	  void removeConocimiento(Conocimiento Conocimiento);
	  Conocimiento updateConocimiento(Conocimiento Conocimiento);
	  Conocimiento findConocimientoById(String id);
      Set<Conocimiento> findAllConocimientos();
	  Set<Conocimiento> findConocimientosByLastName(String lastName);

}
