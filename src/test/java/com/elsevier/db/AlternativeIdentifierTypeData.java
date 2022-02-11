package com.elsevier.db;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class AlternativeIdentifierTypeData{
	
	static DBUtils dbUtils = new DBUtils();
	public static List<AlterIdentifierTypeEntity> getRowsForSqlString( String sqlString) {	
		EntityManager entityManager = dbUtils.getObiiDBFactory().createEntityManager();
		
		Query query = entityManager.createNativeQuery(sqlString, AlterIdentifierTypeEntity.class);
		List<AlterIdentifierTypeEntity> bibRecList = query.getResultList();
		entityManager.close();
        return bibRecList;
	}
	
	public static void main(String args[]) {
		
		String SQL = "select * from ALTERNATIVE_IDENTIFIER_TYPES";
		getRowsForSqlString(SQL);
		
		
	}

}
