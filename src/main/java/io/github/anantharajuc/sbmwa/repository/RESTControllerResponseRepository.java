package io.github.anantharajuc.sbmwa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import io.github.anantharajuc.sbmwa.model.RESTcontrollerResponse;

@Repository
public interface RESTControllerResponseRepository extends JpaRepository<RESTcontrollerResponse, Long>
{
	RESTcontrollerResponse getResponseByVerb(@Param("verb") String verb);
}
