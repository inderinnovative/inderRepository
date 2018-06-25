package com.inder.spring.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MEDICINE_DETAILS")
public class Medicine {
	
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	 
	    @Column(name = "NAME", nullable = false)
	    private String name;
	    
	    @Column(name="USES" )
	    private  String uses;
	    
	    @Column(name="STOCK")
	    private String stock;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUses() {
			return uses;
		}

		public void setUses(String uses) {
			this.uses = uses;
		}

		public String getStock() {
			return stock;
		}

		public void setStock(String stock) {
			this.stock = stock;
		}
	    
	    
}
