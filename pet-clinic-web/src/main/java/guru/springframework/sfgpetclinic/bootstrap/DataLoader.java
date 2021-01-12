package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    @Autowired
    public DataLoader(OwnerServiceMap ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog= new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat= new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1= new Owner();
        owner1.setFirstName("Micheal");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Puzhu South Road");
        owner1.setCity("Nanjing");
        owner1.setTelephone("18951617639");

        Pet mikesPet= new Pet();
        mikesPet.setPetType(dog);
        mikesPet.setName("Jojo");
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setOwner(owner1);
        owner1.getPets().add(mikesPet);
        ownerService.save(owner1);

        Owner owner2= new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("Dongsheng Town");
        owner2.setCity("Beijing");
        owner2.setTelephone("18988828984");

        Pet fionasCat= new Pet();
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(savedCatPetType);
        fionasCat.setName("Pika");
        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1= new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2= new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");


    }
}
