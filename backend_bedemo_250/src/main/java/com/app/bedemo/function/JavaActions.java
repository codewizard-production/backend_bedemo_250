package com.app.bedemo.function;

import com.app.bedemo.model.Manager;
import com.app.bedemo.model.Pet;
import com.app.bedemo.model.PetCareCenter;
import com.app.bedemo.model.PetOwner;
import com.app.bedemo.model.Document;
import com.app.bedemo.model.PetService;




import com.app.bedemo.enums.PetServiceType;
import com.app.bedemo.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  