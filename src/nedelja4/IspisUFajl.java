package nedelja4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;

public class IspisUFajl {
    public static void main(String[] args) throws FileNotFoundException,
            IOException {
        String roba = "\nNOVI RED";
        FileOutputStream stream =
                new FileOutputStream(LocalDateTime.now().toString().replaceAll(":", ""));
        stream.write(roba.getBytes());
    }
}
