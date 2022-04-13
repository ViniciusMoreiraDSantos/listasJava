
public class TestePetShop {

    public static void main(String[] args) {
        Pet pet1 = new Pet("Hulk", "Pit Bull");
        Pet pet2 = new Pet("Peludinho", "Caramelo");
       
        System.out.println(pet1);
        System.out.println(pet2);
        
        PetShop petshop1 = new PetShop("Pethz");
        petshop1.darBanho(pet1, 100.00);
        petshop1.darBanho(pet1, 100.00, 10);
        
        System.out.println("Depois de dar 3 banhos no Hulk");
        System.out.println(pet1);
        System.out.println(pet2);
        
        petshop1.darBanho(pet2, 100.0);
        
        System.out.println(petshop1);
        
        
    }
}
