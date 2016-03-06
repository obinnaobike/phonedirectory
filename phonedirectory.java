package main;
import java.util.*;
import java.io.*;
import java.nio.*;
import java.nio.file.Path;
import java.nio.file.Paths;


public class phonedirectory {
	private Map<String, String> direct = new HashMap<String, String>();
    @SuppressWarnings("resource")
	public phonedirectory() throws IOException{
    Path pat =	Paths.get("myfile.txt");
    @SuppressWarnings("unused")
	Scanner scans = new Scanner(pat);
    while(scans.hasNextLine()){
    	String[] target = scans.nextLine().split(".");
    	direct.put(target[0].trim(), target[1].trim());
    }
    }
    public String search(String name) {
    	return name + " " + direct.get(name);
    	
    }
    public void addandchange(String name, String number){
    	if (direct.containsValue(number)){
    		ArrayList<String> duplicate = new ArrayList<String>();
    		for (String item : direct.keySet())
    		{if (direct.get(item).equals(number))
    		{duplicate.add(item);
    		}
    		
    	}
    		for (String tname : duplicate){
    	    	direct.remove(tname);
    	    } }
    
direct.put(name, number);}
    public void deleteetry(String name)
    {direct.remove(name);}
    
    public void write()
    {Path out = Paths.get("out.txt");
    BufferedWriter writes = Files.newBufferedWriter(out);
    for (Map.Entry<String, String> information : direct.entrySet())
    {writes.write(information.getKey() + " " + information.getValue());
    }
