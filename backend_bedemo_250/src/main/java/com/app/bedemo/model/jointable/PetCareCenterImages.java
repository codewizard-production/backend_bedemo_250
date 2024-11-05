package com.app.bedemo.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.bedemo.model.Manager;
import com.app.bedemo.model.Pet;
import com.app.bedemo.model.PetCareCenter;
import com.app.bedemo.model.PetOwner;
import com.app.bedemo.model.Document;
import com.app.bedemo.model.PetService;
import com.app.bedemo.enums.PetServiceType;
import com.app.bedemo.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterImages")
@Table(schema = "\"bedemo\"", name = "\"PetCareCenterImages\"")
@Data
public class PetCareCenterImages{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"DocId\"")
    private Integer docId;
 
}