package org.kata.socialnetworking.repositories;

import java.util.List;
import org.kata.socialnetworking.models.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {

    List<Message> findByUserId(Long userId);

}