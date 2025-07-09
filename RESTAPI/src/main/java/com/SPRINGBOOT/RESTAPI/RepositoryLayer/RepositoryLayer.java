package com.SPRINGBOOT.RESTAPI.RepositoryLayer;

import com.SPRINGBOOT.RESTAPI.Entity.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryLayer extends JpaRepository<CloudVendor,Integer> {
}
