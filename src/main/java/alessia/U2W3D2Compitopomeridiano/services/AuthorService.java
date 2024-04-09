package alessia.U2W3D2Compitopomeridiano.services;

import alessia.U2W3D2Compitopomeridiano.entities.Author;
import alessia.U2W3D2Compitopomeridiano.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


@Service
public class AuthorService {

    List<Author> authorList = new ArrayList<>();

    public List<Author> getAuthorList() {
        return this.authorList;
    }

    public Author saveAuthor(Author body){
        Random rndm = new Random();
        body.setId(rndm.nextInt(1,1000));
        this.authorList.add(body);
        return body;
    }
    public Author findAuthorById(int id){
        Author found = null;
        for (Author author : this.authorList){
            if (author.getId()== id)found = author;
        }
        if(found == null) throw new NotFoundException(id);
        else return found;
    }

    public Author findAuthorByIdAndUpdate(int id, Author updatedBody){
        Author found = null;
        for (Author author : this.authorList){
            if (author.getId()== id)found = author;
            author.setName(updatedBody.getName());
            author.setAvatar(updatedBody.getAvatar());
        }
        if(found == null) throw new NotFoundException(id);
        else return found;
    }

    public void findAuthorByIdAndDelete(int id){

        this.authorList.removeIf(current -> current.getId() == id);
    }


}



