package com.security.middlesec.repository;

import com.security.middlesec.models.entities.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository<ProductoEntity, Long> {

}
