package com.pgrsoft.cajondesastre.groupsgenerator.impl;

import java.util.Arrays;
import java.util.List;

import com.pgrsoft.cajondesastre.groupsgenerator.GroupsGenerator;

public class TestClass {

	public static void main(String[] args) {
		
		GroupsGenerator groupsGenerator = new GroupsGeneratorImpl();
		
		List<String[]> grupos = groupsGenerator.generate(3, "a", "b", "c", "d", "e");

		for(String[] grupo: grupos) {
			System.out.println(Arrays.toString(grupo));
		}
	}

}
