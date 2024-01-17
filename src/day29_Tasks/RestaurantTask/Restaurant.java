package day29_Tasks.RestaurantTask;

import java.util.ArrayList;

public class Restaurant {
    public static boolean hasKitchen, hasCashier;
    public String owner;
    public ArrayList<Chef> chefs;
    public ArrayList<Server> servers;

    static {
        hasCashier = true;
        hasKitchen = true;
    }

    public Restaurant(String owner) {
        this.owner = owner;
        chefs = new ArrayList<>();
        servers = new ArrayList<>();
    }

    public void hireServer(Server server) {
        servers.add(server);
    }

    public void hireServer(Server[] servers) {
        for (Server eachSever : servers) hireServer(eachSever);
        //this.servers.addAll(Arrays.asList(servers));
    }

    public void hireChef(Chef chef){
        chefs.add(chef);
    }

    public void hireChef(Chef[] chefs){
        for (Chef eachChef: chefs) hireChef(eachChef);
       //this.chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateEmployee(String ID){
        servers.removeIf(p-> p.ID.equals(ID));
        chefs.removeIf(p->p.ID.equals(ID));
    }

    public void terminateChef(String ID){
        chefs.removeIf(p->p.ID.equals(ID));
    }
    public void terminateServer(String ID){
        servers.removeIf(p-> p.ID.equals(ID));
    }

    public String toString(){
        return "Owner: "+owner+"\nTotal of Employee: "+(servers.size()+chefs.size())+
                "\nservers: "+servers.size()+"\nchefs: "+chefs.size();
    }
}
/*

 Create a class called Restaurant

            Attributes:
                OwnerName, Location, numberOfStars
                Servers (ArrayList of Server objects)
                Chefs (ArrayList of Chef objects)
                Add A constructor that can set the owner, location, and number of stars
            Actions: (all void methods)
                hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
                hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList

                hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList
                hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList
                toString(): Return (String) of all the information of a Restaurant object. No need to print the whole list of Servers or Chefs. Print the number of Servers and Chefs along side the other information

        - Extra optional tasks
                terminateServer(int employeeID): removes the server with the matching ID  from the arraylist
                terminateChef(int employeeID): removes the chef with the matching ID  from the arraylist

 */