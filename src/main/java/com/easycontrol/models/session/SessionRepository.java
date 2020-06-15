package com.easycontrol.models.session;

import com.easycontrol.models.user.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {

    @Query("select sess FROM Session as sess  where user = :user ")
	boolean loginMatch(String email, User user);
    

}