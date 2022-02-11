package com.elsevier.db;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.eclipse.persistence.config.PersistenceUnitProperties;

//import com.elsevier.test.support.generic.utils.ParameterStore;



public class DBUtils {

	
	private EntityManagerFactory obiiDBFactory;
	public HashMap <String, String> dbPersistenceMap = new HashMap<String,String>();
	
	//String passwordValue=ParameterStore.getParametrValue(passwordValue, tester);

	public HashMap<String, String> getDbPersistenceMap() {
		return dbPersistenceMap;
	}
	
	public EntityManagerFactory getObiiDBFactory() {
		return obiiDBFactory;
	}
	
	DBUtils(){
		obiiDBFactory = createObiiDBFactory("");
	}
	
	
	protected EntityManagerFactory createObiiDBFactory(String obiiEnv)  {
		Persistence persistanceObject = new Persistence();
		Map teProperties = new HashMap();
		teProperties.put(PersistenceUnitProperties.JDBC_PASSWORD, getDbPersistenceMap().get("OBUAT"));
		
		return Persistence.createEntityManagerFactory(obiiEnv,teProperties);
		
	}
}
