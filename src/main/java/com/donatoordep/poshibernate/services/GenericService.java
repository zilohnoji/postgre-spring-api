package com.donatoordep.poshibernate.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.donatoordep.poshibernate.exceptions.ResourceNotFound;
import com.donatoordep.poshibernate.utils.ConversibleContract;

@Service
public interface GenericService<E extends ConversibleContract<DTO>, ID, DTO extends ConversibleContract<E>> {

	public JpaRepository<E, ID> repository();

	/* <-- Consumes | Produces Methods --> */

	default DTO insert(DTO dto) {
		return repository().save(dto.toConvert()).toConvert();
	}

	/* <-- Produces Methods --> */

	default DTO findById(ID id) {
		return repository().findById(id).orElseThrow(() -> new ResourceNotFound("Error: not found resource"))
				.toConvert();
	}

	default void deleteById(ID id) {
		repository().delete(findById(id).toConvert());
	}
}
