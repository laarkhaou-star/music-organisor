import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 7.0
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index) //question3
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }else{
            System.out.println("invalid index");
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }else{
            System.out.println("invalid index");
        }
    }
    public void checkIndex(int index){ //question 1
        if (index >= 0 && index <= files.size()-1){
            System.out.println("valid");
                }else {
            System.out.println("invalid");
    }
    }
    public boolean validIndex (int index){ //question 2
        if (index >= 0 && index <= files.size()-1){
            return true;
                }else {
            return false;
        }
    }
    
    
}
