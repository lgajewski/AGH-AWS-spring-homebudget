/*
 * Copyright © 2017 and Confidential to Pegasystems Inc. All rights reserved.
 */

package pl.edu.agh.iosr.aws.stats;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import pl.edu.agh.iosr.aws.stats.model.Entry;

import java.util.List;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "entries", path = "entries")
public interface StatsRepository extends CrudRepository<Entry, Integer> {

    List<Entry> findByUser_Id(@Param("userId") Integer id);

}
