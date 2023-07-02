package com.example.demotaskregistration.token;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Integer> {

    @Query(
            "select t from Token t inner join User u on t.user.id = u.id\n" +
                    "    where u.id =:userid and (t.expired=false or t.revoked=false )"
    )
    List<Token> findAllValidTokenByUser(Integer userid);

    Optional<Token> findByToken(String token);
}

