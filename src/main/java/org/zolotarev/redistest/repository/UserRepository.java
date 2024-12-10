package org.zolotarev.redistest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.zolotarev.redistest.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
