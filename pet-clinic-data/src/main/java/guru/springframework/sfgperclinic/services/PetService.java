package guru.springframework.sfgperclinic.services;

import guru.springframework.sfgperclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
