package day29_Tasks.RestaurantTask;

public class LocalRestaurant {
    public static void main(String[] args) {
        Chef chef = new Chef("Marwan", 34, 'M', 50, "Senior Chef", "313A");
        Server server = new Server("Mandow", 25, 'M', 32, "Servers Supervisor", "AA2321");
        Restaurant restaurant = new Restaurant("Manara");
        restaurant.hireChef(chef);
        restaurant.hireServer(server);

        Server[] servers = {new Server("Yasin", 29, 'M', 35, "Captain Server", "S001"),
                new Server("Sabryne", 28, 'F', 30, "Server Assistant", "S002"),
                new Server("Karim", 27, 'M', 25, "Server1", "S003"),
                new Server("Aysel", 26, 'F', 20, "Server2", "S004"),
                new Server("Kamal", 25, 'M', 15, "Server3", "S005")};


        Chef[] chefs = {new Chef("Mini", 25, 'F', 35, "Executive Chef", "C001"),
                new Chef("Valeria", 24, 'F', 30, "Sous Chef", "C002"),
                new Chef("Halim", 23, 'M', 25, "Head Cook", "C003"),
                new Chef("Habib", 22, 'M', 20, "Line Cook1", "C004"),
                new Chef("Bojan", 21, 'M', 15, "Line Cook2", "C005")};

        restaurant.hireServer(servers);
        restaurant.hireChef(chefs);
        restaurant.terminateEmployee("C005");

        double restaurantBudget = 0;
        System.out.println("*******************");

        System.out.println("Restaurant Staff");

        for (Chef eachChef : restaurant.chefs) {
            System.out.println(eachChef.name+" "+eachChef.jobTitle);
        }
        for (Server eachServer: restaurant.servers){
            System.out.println(eachServer.name+" "+eachServer.jobTitle);
        }
        System.out.println("*********************");
        for (Chef eachChef : restaurant.chefs) {
            restaurantBudget += eachChef.calcSalary();
        }
        for (Server eachServer : restaurant.servers) {
            restaurantBudget += eachServer.calcSalary();
            restaurant.terminateChef("C004");
        }

        System.out.println(restaurant);
    }
}
