package com.petshop.model;

import com.petshop.dao.PetDisplayDAO;

public class PetDisplayTest {
	public static void main(String[] args) throws Exception {
		PetDisplay pd=new PetDisplay();
		pd.setPetName("Dog");
		pd.setPetPrice(1276);
		System.out.println(pd);
		PetDisplayDAO petDAO=new PetDisplayDAO();
		//petDAO.petAdd(pd);
		//petDAO.petUpdate(pd);
		petDAO.petDelete(pd);
	}

}
