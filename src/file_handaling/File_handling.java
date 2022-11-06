package file_handaling;

import java.io.File;
import java.io.IOException;

public class File_handling {
    public static void main(String[] args) throws IOException {
// get name for operating system
      //  System.out.println(System.getProperties());

        // for create directory or folder in desktop
      /*  File file=new File("C:\\Users\\gopal\\OneDrive\\Desktop\\file handling");
        System.out.println(file.exists());
       file.mkdir();*/


// for create  text file inside  folder
      /* file=new File(file,"hello world .txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        // create file 2 inside folder
     /* File file2  =new File(file,"File handling demo .txt");
        file2.createNewFile();*/

        //create file 3 inside folder
     /*   File file3 =new File(file,"file demo.txt");
       file3.createNewFile();*/

// for get all file from directory
   /*  file=new File("C:\\Users\\gopal\\OneDrive\\Desktop\\file handling");
      String[]filenames=file.list();
      for(String fn:filenames){
          System.out.println(fn);
      }*/


// for write something inside file // use filewriter method and file name and close
       /* FileWriter fileWriter=new FileWriter("file demo.txt");
      fileWriter.write("this is try for write some thing inside file demo");
      fileWriter.close();*/

        // for file delete
       File file=new File("C:\\Users\\gopal\\OneDrive\\Desktop\\file handling");
        if(file.delete()){
            System.out.println("Deleted file name is:"+file.getName());}
        else {

            System.out.println("something wrong ");
        }


    }}
