package guru.springframework.sfgperclinic.services;

import guru.springframework.sfgperclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
