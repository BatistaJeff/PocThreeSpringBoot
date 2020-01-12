package com.poc.ws.repository;

import com.poc.ws.domain.User;
import com.poc.ws.domain.VerificationToken;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VerificationTokenRepository extends MongoRepository<VerificationToken,String> {

    Optional<VerificationToken> findByToken(String token);

    Optional<VerificationToken> findByUser(User user);

}
