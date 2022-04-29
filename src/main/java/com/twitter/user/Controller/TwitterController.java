package com.twitter.user.Controller;

import java.util.List;
import java.util.Optional;

import com.twitter.user.Dao.AgarwalRepository;
import com.twitter.user.Model.Parag;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;

@Controller("/owner")
public class TwitterController {

		

	 public final AgarwalRepository agarwalRepository;
	 


	public TwitterController(AgarwalRepository agarwalRepository) {
		
		this.agarwalRepository = agarwalRepository;
	}

	@Get
	public List<Parag> getOwner() {
		return (List<Parag>) agarwalRepository.findAll();

	}

	@Get("/{id}")
	public Optional<Parag> getOwner(int id) {
		return agarwalRepository.findById(id);
	}

	@Put("/{id}")
	public Parag updateOwner(int id, @Body Parag parag) throws Exception {
		if (agarwalRepository.existsById(id)) {
			parag.setId(id);
			agarwalRepository.update(parag);
			return parag;
		} else {
			throw new Exception("Id not found");
		}
	}

	@Post
	public Parag addOwner(@Body Parag parag) {
		return agarwalRepository.save(parag);
	}

	@Delete("/{id}")
	public void deleteOwner(int id) throws Exception {
		if (agarwalRepository.existsById(id)) {
			agarwalRepository.deleteById(id);
		} else {
			throw new Exception("Id Not Found");
		}
	}

}
