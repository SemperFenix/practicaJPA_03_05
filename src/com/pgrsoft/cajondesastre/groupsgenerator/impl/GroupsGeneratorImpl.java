package com.pgrsoft.cajondesastre.groupsgenerator.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.pgrsoft.cajondesastre.groupsgenerator.GroupsGenerator;

public class GroupsGeneratorImpl implements GroupsGenerator{

	@Override
	public List<String[]> generate(int groupSize, String... members) {
		
		final int NUMERO_MIEMBROS = members.length;
		
		if(NUMERO_MIEMBROS < groupSize) {
			throw new IllegalArgumentException("El número de miembros [" + NUMERO_MIEMBROS + "] es inferior al tamaño de grupo [" + groupSize + "]");
		}
		
		List<String[]> resultado = new ArrayList<>();
		List<List<String>> resultadoParcial = new ArrayList<>();
		List<String> membersList = Arrays.asList(members);
		Collections.shuffle(membersList);
		
		final int NUMERO_GRUPOS = NUMERO_MIEMBROS / groupSize;
		final int NUMERO_MIEMBROS_SOBRANTES = NUMERO_MIEMBROS % groupSize;
		
		// Distribución de miembros
		
		for(int i = 0; i < NUMERO_GRUPOS; i++) {
			int desde = i * groupSize;
			int hasta = desde + groupSize;
			resultadoParcial.add(new ArrayList<>(membersList.subList(desde, hasta)));
		}
		
		// Distribución miembros sobrantes
		
		for(int i = 0 ; i < NUMERO_MIEMBROS_SOBRANTES; i++) {
			resultadoParcial.get(i).add(membersList.get(groupSize * NUMERO_GRUPOS + i));
		}
		
		// Conversión a formato definitivo
		
		for(List<String> grupo: resultadoParcial) {
			String[] grupoArray = new String[grupo.size()];
			grupo.toArray(grupoArray); 
			resultado.add(grupoArray);
		}
		
		return resultado;
	}

}
