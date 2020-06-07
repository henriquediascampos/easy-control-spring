package com.easycontrol.models.user;

import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {


    @Transactional(readOnly = true)
    @Query(value= "select c.name as name, uuid as uuid FROM User c")
    List<UserDto> teste(@Param("searchTerm") String searchTerm);

    
    @Query("select c.name FROM User c")
    Page<User> search(@Param("searchTerm") String searchTerm, Pageable pageable);


    @Query("select count(uuid) = 1 FROM User where email = :email and password = :password")
	boolean loginMatch(String email, String password);
    

}