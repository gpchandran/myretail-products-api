package com.myretail.api.service.mapper;

import com.myretail.api.domain.*;
import com.myretail.api.service.dto.ProductDTO;

import org.mapstruct.*;
import java.util.List;

/**
 * Mapper for the entity Product and its DTO ProductDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ProductMapper {

    ProductDTO productToProductDTO(Product product);

    List<ProductDTO> productsToProductDTOs(List<Product> products);

    Product productDTOToProduct(ProductDTO productDTO);

    List<Product> productDTOsToProducts(List<ProductDTO> productDTOs);
}
