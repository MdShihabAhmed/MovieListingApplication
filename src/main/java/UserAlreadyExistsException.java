public class UserAlreadyExistsException extends Exception{
    public UserAlreadyExistsException(){
        super("There is already an user with this email.");
    }
}
