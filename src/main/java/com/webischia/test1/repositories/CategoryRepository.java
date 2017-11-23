package com.webischia.test1.repositories;

import com.webischia.test1.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
