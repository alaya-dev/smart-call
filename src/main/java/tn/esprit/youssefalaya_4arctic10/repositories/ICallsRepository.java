package tn.esprit.youssefalaya_4arctic10.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import tn.esprit.youssefalaya_4arctic10.entities.Calls;

public interface ICallsRepository extends JpaRepository<Calls,Long> {




}
