package com.escuelita.demo.repositories;

import com.escuelita.demo.entities.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductTypeRepository extends JpaRepository<ProductType,Long> {

}
