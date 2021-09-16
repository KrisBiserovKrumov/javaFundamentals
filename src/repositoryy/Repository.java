package repositoryy;

import java.util.HashMap;
import java.util.Map;

public class Repository {
   private Map<Integer,Person> data;
   private int Id;

    public Repository() {
        Id = 0;
        this.data = new HashMap<>();

    }

    public void add(Person person){
        data.put(this.Id,person);
        Id++;
    }
    public Person get(int Id){
       return this.data.get(Id);
    }
    public boolean update(int Id,Person newPerson){
        if (!this.data.containsKey(Id)){
            return false;
        }else {
            this.data.put(Id,newPerson);
            return true;
        }
    }
    public boolean delete(int Id){
        if (!this.data.containsKey(Id)){
            return false;
        }else {
            this.data.remove(Id);
            return true;
        }
    }
    public int getCount(){
        return this.data.size();
    }

}
