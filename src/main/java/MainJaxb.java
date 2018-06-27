import models.User;
import services.UserService;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MainJaxb {
    public static void main(String[] args) {
        UserService service = new UserService();
        List<User> users = service.findAllUsers();
        try {
            FileWriter writer = new FileWriter("C:/java/temp.xml");
            JAXBContext context = JAXBContext.newInstance(User.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            for (User user: users
                 ) {
                marshaller.marshal(user,writer);
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException x) {
            x.printStackTrace();
        }
    }
}
