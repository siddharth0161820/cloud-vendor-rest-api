package com.SpringSecurity.Security.RepositoryLayer;

import com.SpringSecurity.Security.Entity.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryLayer extends JpaRepository<CloudVendor,Integer> {
}
