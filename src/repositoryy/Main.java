package repositoryy;




public class Main {
    public static void main(String[] args) {

        Repository repository = new Repository();

        Person person = new Person("Pesho", 14, "13-07-2004");

        repository.add(person);


        Person secondPerson = new Person("Gosho", 42, "21-09-1976");
        repository.add(secondPerson);

        System.out.println(repository.get(0).toString());
        //Name: Pesho
        //Age: 14
        //Birthday: 13-07-2004

        System.out.println(repository.get(1).toString());
        //Name: Gosho
        //Age: 42
        //Birthday: 21-09-1976


        //Update person with id 1
        repository.update(1, new Person("Success", 20, "01-01-1999"));

        System.out.println(repository.get(1).toString());
        //Name: Success
        //Age: 20
        //Birthday: 01-01-1999

        //Delete entity
        repository.delete(0);

        System.out.println(repository.getCount());
        //1
    }

}
