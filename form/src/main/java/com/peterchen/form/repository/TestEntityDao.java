package com.peterchen.form.repository;

import com.peterchen.form.entity.TestEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by fanHB on 15-1-24.
 */
public interface TestEntityDao extends CrudRepository<TestEntity, Long> {
}
