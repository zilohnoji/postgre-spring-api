package com.donatoordep.poshibernate.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.donatoordep.poshibernate.exceptions.ResourceNotFound;
import com.donatoordep.poshibernate.utils.ConversibleContract;

public interface GenericService<E extends ConversibleContract<DTO>, ID, DTO extends ConversibleContract<E>> {

	public JpaRepository<E, ID> repository();

	/* <-- Insert Methods --> */

	default DTO insert(DTO dto) {
		return repository().save(dto.toConvert()).toConvert();
	}

	/* <-- Search Methods --> */

	default DTO findById(ID id) {
		return repository().findById(id).orElseThrow(() -> new ResourceNotFound("Error: not found resource"))
				.toConvert();
	}

}
