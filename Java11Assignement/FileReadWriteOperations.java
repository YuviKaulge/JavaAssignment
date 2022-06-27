package Java11Assignement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;


class FileReadWriteOperations
{
    public static void main(String[] args)
    {
        var path="C:\\Users\\KGUNDAPP\\git\\repository\\Java Assignment\\src\\Java11Assignement";
        try 
        {
            String data=Files.readString(Path.of(path));

            List<String> s=data.lines().map(t->t.trim()).collect(Collectors.toList());
            s.stream().filter(t-> !t.isBlank()).forEach(t-> System.out.print(t+" "));

            System.out.println();
            
            long count=s.stream().filter(t-> !t.isBlank()).count();
           
            System.out.println("Number of students :"+ count);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }

    }	
}