package com.easycontrol.models.user;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    @Transactional(readOnly = true)
    @Query(value= "select c.name as name, id as id FROM User c")
    List<UserDto> teste(@Param("searchTerm") String searchTerm);

    
    @Query("select c.name FROM User c")
    Page<User> search(@Param("searchTerm") String searchTerm, Pageable pageable);


    @Query("select c.* FROM user c where email = :email and password = :password")
	User loginMatch(String email, String password);
    

}