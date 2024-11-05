package com.app.bedemo.function;

import com.app.bedemo.model.Manager;
import com.app.bedemo.model.Pet;
import com.app.bedemo.model.PetCareCenter;
import com.app.bedemo.model.PetOwner;
import com.app.bedemo.model.Document;
import com.app.bedemo.model.PetService;
import com.app.bedemo.enums.PetServiceType;
import com.app.bedemo.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.bedemo.repository.PetServiceRepository;
import com.app.bedemo.repository.PetOwnerRepository;
import com.app.bedemo.repository.PetCareCenterRepository;
import com.app.bedemo.repository.ManagerRepository;
import com.app.bedemo.repository.DocumentRepository;
import com.app.bedemo.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
