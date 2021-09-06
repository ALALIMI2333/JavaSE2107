package exception;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ThrowsDemo {
    public void dosome()throws IOException, AWTException{

    }
}
class SubClass extends ThrowsDemo{

    /*public void dosome() throws IOException, AWTException {
     //   super.dosome();
    }*/
    //public void dosome(){}
    //public void dosme()throws IOException{}

    //public void dosome() throws FileNotFoundException{}

    //public void dosome() throws SQLException{}

    //public void dosome() throws Exception{}
}