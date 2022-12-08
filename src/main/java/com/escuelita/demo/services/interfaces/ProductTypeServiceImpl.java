package com.escuelita.demo.services.interfaces;

import com.escuelita.demo.entities.ProductType;
import com.escuelita.demo.repositories.IProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductTypeServiceImpl implements IProductTypeService{
    @Autowired
    private IProductTypeRepository repository;
    @Override
    public ProductType FindById(Long id) {
        Optional<ProductType> productTypeOptional = repository.findById(id);
        if (productTypeOptional.isPresent()) {
            return productTypeOptional.get();
        }
        throw new RuntimeException("The product type with the id " + id + " doesn't exist");
    }
}
