package net.wodie.backend.repository;

import net.wodie.backend.model.FrameItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrameRepository extends MongoRepository<FrameItem, String> {

}


