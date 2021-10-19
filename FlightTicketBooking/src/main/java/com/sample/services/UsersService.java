package com.sample.services;

import java.math.BigInteger;

import org.springframework.http.ResponseEntity;

import com.sample.model.Users;

public interface UsersService {

	public ResponseEntity<?> createUser(Users newUser);

	public Users updateUser(Users newUser);

	public String deleteUser(BigInteger UserId);

	public Iterable<Users> displayAllUser();

	public ResponseEntity<?> findUserById(BigInteger userId);
}