package com.apiPetshop.apiPetshop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apiPetshop.apiPetshop.model.PetModel;
import com.apiPetshop.apiPetshop.model.PetRequePerdidoModel;

@Repository
public interface PetRequePerdidoDao extends JpaRepository<PetRequePerdidoModel, Integer> {

    /* será usado o jpql para filtro de pesquisa */
   /*  @Query("SELECT u FROM User u WHERE u.status = 'ADOCAO' ")
    public List<PetModel> findByStatusAdocao(Status status);*/
    
    

}
