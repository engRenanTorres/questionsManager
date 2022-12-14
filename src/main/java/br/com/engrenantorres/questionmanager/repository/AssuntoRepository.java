package br.com.engrenantorres.questionmanager.repository;

import br.com.engrenantorres.questionmanager.model.Assunto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssuntoRepository extends JpaRepository<Assunto,Long> {
  @Query("select a from Assunto a where a.subjectArea.id = ?1")
  List<Assunto> findAllBySubjectAreaId(Long areaId);
}
