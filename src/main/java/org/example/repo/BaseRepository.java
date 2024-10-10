package org.example.repo;

import org.example.model.EntityBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public interface BaseRepository<T extends EntityBase> extends JpaRepository<T,Long> {
}
