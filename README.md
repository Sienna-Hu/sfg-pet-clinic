# My Spring Pet Clinic Toy Application

This repo is for a toy project I'm building following instructions in an online course (Spring Framework 5: Beginner to Guru). 

It is an opinionated version of the classic reference application. The idea of Pet Clinic application and the original app is [here](https://github.com/springframeworkguru/sfg-pet-clinic).

## What I have done so far

1. Initialize the project from Spring Initialzr
2. Create the basic POJO Data Model
    - BaseEntity -> Person -> Owner & Vet
    - BaseEntity -> Pet
    - BaseEntity -> PetType
3. Refactor the project into Multi-Module project using Maven
4. Using the Maven Release Plugin
5. Service Layer: Interfaces for Services 
    - CrudService -> OwnerService & PetService & VetService
       - Basic functions of CrudService: `findAll()`, `findById()`, `save()`, `delete()`, `deleteById()`
6. Map Implementation: Implement Map based Services
    - AbstractMapService -> OwnerServiceMap & PetServiceMap & OwnerServiceMap
7. Controller Layer: Index Page and Controllers
    - IndexController & OwnerController & VetController
        - Have a corresponding Service property
    - Under templates: index.html & owners/index.html & vets/index.html
    
## What I have learned from the project
1. Understand OOP in practice (completely mimicing real life: have a BaseEntity - Person extends BaseEntity - Owner & Vet extends Person etc.)
2. Understand Spring MVC in practice (creating service layer, controller layer, and view layer)
