package com.forohub.apiforohub.topico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    Page<Topico> findByEstatusTrue(Pageable paginacion);

    List<Topico> findTopicoById(Long id);
}