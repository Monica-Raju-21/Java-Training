package AccessModifiers;

class Users{
    private String password="Super@12345";

    void checkPassword(){
        System.out.println("Accessing private password:"+password);
    }
}
