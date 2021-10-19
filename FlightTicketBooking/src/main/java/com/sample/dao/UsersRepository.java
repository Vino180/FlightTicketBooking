package com.sample.dao;

import java.math.BigInteger;
import org.springframework.data.jpa.repository.JpaRepository;



import com.sample.model.Users;;

public interface UsersRepository extends JpaRepository<Users, BigInteger>{

}