package alessia.U2W3D2Compitopomeridiano.exceptions;

public class NotFoundException extends RuntimeException{

    public NotFoundException(int id){
        super("L'elemento con id " + id + " non è stato trovato");
    }
}
