package org.javastart.homework29.kitchen_book.repository;

import org.javastart.homework29.kitchen_book.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
