package com.escuelita.demo.services.interfaces;

import com.escuelita.demo.entities.ProductType;

public interface IProductTypeService {
    ProductType FindById(Long id);
}
